/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.LangDefinition;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Defines values for SnapshotSkuType.
 */
@Beta(Beta.SinceVersion.V1_8_0)
@LangDefinition
public final class SnapshotSkuType {

    private static final Map<String, SnapshotSkuType> VALUES_BY_NAME = new HashMap<>();

    /** Static value STANDARD_LRS for SnapshotSkuType. */
    public static final SnapshotSkuType STANDARD_LRS = new SnapshotSkuType(SnapshotStorageAccountTypes.STANDARD_LRS);

    /** Static value PREMIUM_LRS for SnapshotSkuType. */
    public static final SnapshotSkuType PREMIUM_LRS = new SnapshotSkuType(SnapshotStorageAccountTypes.PREMIUM_LRS);

    /** Static value STANDARD_ZRS for SnapshotSkuType. */
    public static final SnapshotSkuType STANDARD_ZRS = new SnapshotSkuType(SnapshotStorageAccountTypes.STANDARD_ZRS);

    /** The actual serialized value for a SnapshotSkuType instance. */
    private SnapshotStorageAccountTypes value;

    /**
     * @return predefined snapshot SKU types
     */
    public static SnapshotSkuType[] values() {
        Collection<SnapshotSkuType> valuesCollection = VALUES_BY_NAME.values();
        return valuesCollection.toArray(new SnapshotSkuType[valuesCollection.size()]);
    }

    /**
     * Creates a custom value for SnapshotSkuType.
     *
     * @param value the custom value
     */
    private SnapshotSkuType(SnapshotStorageAccountTypes value) {
        this.value = value;
        if (value != null) {
            VALUES_BY_NAME.put(value.toString().toLowerCase(), this);
        }
    }

    /**
     * Parses a value into a snapshot SKU type and creates a new SnapshotSkuType instance if not found
     * among the existing ones.
     *
     * @param value a snapshot SKU type name
     * @return the parsed or created snapshot SKU type
     */
    public static SnapshotSkuType fromStorageAccountType(SnapshotStorageAccountTypes value) {
        if (value == null) {
            return null;
        }

        SnapshotSkuType result = VALUES_BY_NAME.get(value.toString().toLowerCase());
        if (result != null) {
            return result;
        } else {
            return new SnapshotSkuType(value);
        }
    }

    /**
     * Parses a value into a snapshot SKU type and creates a new SnapshotSkuType instance if not found among
     * the existing ones.
     *
     * @param snapshotSku a snapshot SKU type name
     * @return the parsed or created snapshot SKU type
     */
    public static SnapshotSkuType fromSnapshotSku(SnapshotSku snapshotSku) {
        if (snapshotSku == null || snapshotSku.name() == null) {
            return null;
        } else {
            return fromStorageAccountType(snapshotSku.name());
        }
    }

    /**
     * @return the account type associated with the SKU.
     */
    public SnapshotStorageAccountTypes accountType() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SnapshotSkuType)) {
            return false;
        } else if (obj == this) {
            return true;
        } else  if (value == null) {
            return ((SnapshotSkuType) obj).value == null;
        } else {
            return value.equals(((SnapshotSkuType) obj).value);
        }
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
