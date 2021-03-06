/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification of the service.
 */
public class OperationPropertiesFormatServiceSpecification {
    /**
     * Operation service specification.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /**
     * Operation log specification.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /**
     * Get the metricSpecifications value.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications value.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the OperationPropertiesFormatServiceSpecification object itself.
     */
    public OperationPropertiesFormatServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications value.
     *
     * @return the logSpecifications value
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications value.
     *
     * @param logSpecifications the logSpecifications value to set
     * @return the OperationPropertiesFormatServiceSpecification object itself.
     */
    public OperationPropertiesFormatServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

}
