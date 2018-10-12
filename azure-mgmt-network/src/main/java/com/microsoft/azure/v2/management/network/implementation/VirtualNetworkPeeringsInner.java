/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualNetworkPeerings.
 */
public final class VirtualNetworkPeeringsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualNetworkPeeringsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VirtualNetworkPeeringsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualNetworkPeeringsInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(VirtualNetworkPeeringsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualNetworkPeerings to be
     * used by the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface VirtualNetworkPeeringsService {
        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginDelete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> delete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<VirtualNetworkPeeringInner>> get(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<VirtualNetworkPeeringInner>> beginCreateOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") VirtualNetworkPeeringInner virtualNetworkPeeringParameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<VirtualNetworkPeeringInner>> createOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") VirtualNetworkPeeringInner virtualNetworkPeeringParameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<VirtualNetworkPeeringInner>> resumeCreateOrUpdate(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<VirtualNetworkPeeringInner>>> list(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<VirtualNetworkPeeringInner>>> listNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginDelete(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        beginDeleteAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName).blockingLast();
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginDeleteAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName), serviceCallback);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (virtualNetworkPeeringName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginDelete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void delete(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        deleteAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName).blockingAwait();
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> deleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName), serviceCallback);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> deleteWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (virtualNetworkPeeringName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable deleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        return deleteWithRestResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName)
            .toCompletable();
    }

    /**
     * Deletes the specified virtual network peering. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeDelete(operationDescription);
    }

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualNetworkPeeringInner object if successful.
     */
    public VirtualNetworkPeeringInner get(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        return getAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName).blockingGet();
    }

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<VirtualNetworkPeeringInner> getAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, ServiceCallback<VirtualNetworkPeeringInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName), serviceCallback);
    }

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<VirtualNetworkPeeringInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (virtualNetworkPeeringName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<VirtualNetworkPeeringInner> getAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName) {
        return getWithRestResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName)
            .flatMapMaybe((BodyResponse<VirtualNetworkPeeringInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualNetworkPeeringInner object if successful.
     */
    public VirtualNetworkPeeringInner beginCreateOrUpdate(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters).blockingLast().result();
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;VirtualNetworkPeeringInner&gt; object.
     */
    public ServiceFuture<VirtualNetworkPeeringInner> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters, ServiceCallback<VirtualNetworkPeeringInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCreateOrUpdateAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters), serviceCallback);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<VirtualNetworkPeeringInner>> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (virtualNetworkPeeringName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (virtualNetworkPeeringParameters == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringParameters is required and cannot be null.");
        }
        Validator.validate(virtualNetworkPeeringParameters);
        final String apiVersion = "2018-06-01";
        return service.beginCreateOrUpdate(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.subscriptionId(), virtualNetworkPeeringParameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualNetworkPeeringInner object if successful.
     */
    public VirtualNetworkPeeringInner createOrUpdate(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        return createOrUpdateAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters).blockingGet();
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<VirtualNetworkPeeringInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters, ServiceCallback<VirtualNetworkPeeringInner> serviceCallback) {
        return ServiceFuture.fromBody(createOrUpdateAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters), serviceCallback);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<VirtualNetworkPeeringInner>> createOrUpdateWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (virtualNetworkPeeringName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (virtualNetworkPeeringParameters == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkPeeringParameters is required and cannot be null.");
        }
        Validator.validate(virtualNetworkPeeringParameters);
        final String apiVersion = "2018-06-01";
        return service.createOrUpdate(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.subscriptionId(), virtualNetworkPeeringParameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<VirtualNetworkPeeringInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String virtualNetworkPeeringName, @NonNull VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        return createOrUpdateWithRestResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters)
            .flatMapMaybe((BodyResponse<VirtualNetworkPeeringInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a peering in the specified virtual network. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<VirtualNetworkPeeringInner>> resumeCreateOrUpdate(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCreateOrUpdate(operationDescription);
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;VirtualNetworkPeeringInner&gt; object if successful.
     */
    public PagedList<VirtualNetworkPeeringInner> list(@NonNull String resourceGroupName, @NonNull String virtualNetworkName) {
        Page<VirtualNetworkPeeringInner> response = listSinglePageAsync(resourceGroupName, virtualNetworkName).blockingGet();
        return new PagedList<VirtualNetworkPeeringInner>(response) {
            @Override
            public Page<VirtualNetworkPeeringInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;VirtualNetworkPeeringInner&gt; object.
     */
    public Observable<Page<VirtualNetworkPeeringInner>> listAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName) {
        return listSinglePageAsync(resourceGroupName, virtualNetworkName)
            .toObservable()
            .concatMap((Page<VirtualNetworkPeeringInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink));
            });
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;VirtualNetworkPeeringInner&gt;&gt; object if successful.
     */
    public Single<Page<VirtualNetworkPeeringInner>> listSinglePageAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.list(resourceGroupName, virtualNetworkName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<VirtualNetworkPeeringInner>> res) -> res.body());
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;VirtualNetworkPeeringInner&gt; object if successful.
     */
    public PagedList<VirtualNetworkPeeringInner> listNext(@NonNull String nextPageLink) {
        Page<VirtualNetworkPeeringInner> response = listNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<VirtualNetworkPeeringInner>(response) {
            @Override
            public Page<VirtualNetworkPeeringInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;VirtualNetworkPeeringInner&gt; object.
     */
    public Observable<Page<VirtualNetworkPeeringInner>> listNextAsync(@NonNull String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<VirtualNetworkPeeringInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink1));
            });
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;VirtualNetworkPeeringInner&gt;&gt; object if successful.
     */
    public Single<Page<VirtualNetworkPeeringInner>> listNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<VirtualNetworkPeeringInner>> res) -> res.body());
    }
}