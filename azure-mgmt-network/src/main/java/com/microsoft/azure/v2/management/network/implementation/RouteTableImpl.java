/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network.implementation;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.Route;
import com.microsoft.azure.v2.management.network.RouteNextHopType;
import com.microsoft.azure.v2.management.network.RouteTable;
import com.microsoft.azure.v2.management.network.Subnet;
import com.microsoft.azure.v2.management.network.model.GroupableParentResourceWithTagsImpl;
import com.microsoft.azure.v2.management.resources.fluentcore.utils.Utils;
import io.reactivex.Maybe;
import io.reactivex.Observable;

/**
 * Implementation for RouteTable.
 */
@LangDefinition
class RouteTableImpl
    extends GroupableParentResourceWithTagsImpl<
        RouteTable,
        RouteTableInner,
        RouteTableImpl,
        NetworkManager>
    implements
        RouteTable,
        RouteTable.Definition,
        RouteTable.Update {

    private Map<String, Route> routes;

    RouteTableImpl(String name,
            final RouteTableInner innerModel,
            final NetworkManager networkManager) {
        super(name, innerModel, networkManager);
    }

    @Override
    protected Observable<RouteTableInner> applyTagsToInnerAsync() {
        return this.manager().inner().routeTables().updateTagsAsync(resourceGroupName(), name(), inner().getTags())
                .toObservable();
    }

    @Override
    protected void initializeChildrenFromInner() {
        this.routes = new TreeMap<>();
        List<RouteInner> inners = this.inner().routesProperty();
        if (inners != null) {
            for (RouteInner inner : inners) {
                RouteImpl route = new RouteImpl(inner, this);
                this.routes.put(inner.name(), route);
            }
        }
    }

    // Getters

    // Verbs

    @Override
    public Maybe<RouteTable> refreshAsync() {
        return super.refreshAsync()
                .map(routeTable -> {
                    RouteTableImpl impl = (RouteTableImpl) routeTable;
                    impl.initializeChildrenFromInner();
                    return impl;
                });
    }

    @Override
    protected Maybe<RouteTableInner> getInnerAsync() {
        return this.manager().inner().routeTables().getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public List<Subnet> listAssociatedSubnets() {
        return this.myManager.listAssociatedSubnets(this.inner().subnetsProperty());
    }

    // Setters (fluent)

    @Override
    public RouteImpl defineRoute(String name) {
        RouteInner inner = new RouteInner()
                .withName(name);
        return new RouteImpl(inner, this);
    }

    @Override
    public RouteImpl updateRoute(String name) {
        return (RouteImpl) this.routes.get(name);
    }

    @Override
    public Update withoutRoute(String name) {
        this.routes.remove(name);
        return this;
    }

    @Override
    public RouteTableImpl withRoute(String destinationAddressPrefix, RouteNextHopType nextHop) {
        return this.defineRoute("route_" + this.name() + System.currentTimeMillis())
                .withDestinationAddressPrefix(destinationAddressPrefix)
                .withNextHop(nextHop)
                .attach();
    }

    @Override
    public RouteTableImpl withRouteViaVirtualAppliance(String destinationAddressPrefix, String ipAddress) {
        return this.defineRoute("route_" + this.name() + System.currentTimeMillis())
                .withDestinationAddressPrefix(destinationAddressPrefix)
                .withNextHopToVirtualAppliance(ipAddress)
                .attach();
    }

    RouteTableImpl withRoute(RouteImpl route) {
        this.routes.put(route.name(), route);
        return this;
    }

    // Helpers

    @Override
    protected void beforeCreating() {
        // Reset and update routes
        this.inner().withRoutesProperty(innersFromWrappers(this.routes.values()));
    }

    @Override
    protected void afterCreating() {
        initializeChildrenFromInner();
    }

    @Override
    protected Observable<RouteTableInner> createInner() {
        return this.manager().inner().routeTables().createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
                .toObservable();
    }

    @Override
    public Map<String, Route> routes() {
        return Collections.unmodifiableMap(this.routes);
    }

    @Override
    public boolean isBgpRoutePropagationDisabled() {
        return Utils.toPrimitiveBoolean(inner().disableBgpRoutePropagation());
    }

    @Override
    public RouteTableImpl withDisableBgpRoutePropagation() {
        inner().withDisableBgpRoutePropagation(true);
        return this;
    }

    @Override
    public RouteTableImpl withEnableBgpRoutePropagation() {
        inner().withDisableBgpRoutePropagation(false);
        return this;
    }
}
