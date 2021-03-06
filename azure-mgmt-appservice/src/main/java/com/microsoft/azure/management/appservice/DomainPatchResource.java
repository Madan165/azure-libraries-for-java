/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * ARM resource for a domain.
 */
@JsonFlatten
public class DomainPatchResource extends ProxyOnlyResource {
    /**
     * Administrative contact.
     */
    @JsonProperty(value = "properties.contactAdmin", required = true)
    private Contact contactAdmin;

    /**
     * Billing contact.
     */
    @JsonProperty(value = "properties.contactBilling", required = true)
    private Contact contactBilling;

    /**
     * Registrant contact.
     */
    @JsonProperty(value = "properties.contactRegistrant", required = true)
    private Contact contactRegistrant;

    /**
     * Technical contact.
     */
    @JsonProperty(value = "properties.contactTech", required = true)
    private Contact contactTech;

    /**
     * Domain registration status. Possible values include: 'Active',
     * 'Awaiting', 'Cancelled', 'Confiscated', 'Disabled', 'Excluded',
     * 'Expired', 'Failed', 'Held', 'Locked', 'Parked', 'Pending', 'Reserved',
     * 'Reverted', 'Suspended', 'Transferred', 'Unknown', 'Unlocked',
     * 'Unparked', 'Updated', 'JsonConverterFailed'.
     */
    @JsonProperty(value = "properties.registrationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DomainStatus registrationStatus;

    /**
     * Domain provisioning state. Possible values include: 'Succeeded',
     * 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name servers.
     */
    @JsonProperty(value = "properties.nameServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nameServers;

    /**
     * &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this
     * domain; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.privacy")
    private Boolean privacy;

    /**
     * Domain creation timestamp.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * Domain expiration timestamp.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationTime;

    /**
     * Timestamp when the domain was renewed last time.
     */
    @JsonProperty(value = "properties.lastRenewedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastRenewedTime;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the domain should be automatically
     * renewed; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.autoRenew")
    private Boolean autoRenew;

    /**
     * &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to App
     * Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will
     * be &lt;code&gt;true&lt;/code&gt; if domain registration status is active
     * and
     * it is hosted on name servers Azure has programmatic access to.
     */
    @JsonProperty(value = "properties.readyForDnsRecordManagement", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean readyForDnsRecordManagement;

    /**
     * All hostnames derived from the domain and assigned to Azure resources.
     */
    @JsonProperty(value = "properties.managedHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<HostName> managedHostNames;

    /**
     * Legal agreement consent.
     */
    @JsonProperty(value = "properties.consent", required = true)
    private DomainPurchaseConsent consent;

    /**
     * Reasons why domain is not renewable.
     */
    @JsonProperty(value = "properties.domainNotRenewableReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> domainNotRenewableReasons;

    /**
     * Current DNS type. Possible values include: 'AzureDns',
     * 'DefaultDomainRegistrarDns'.
     */
    @JsonProperty(value = "properties.dnsType")
    private DnsType dnsType;

    /**
     * Azure DNS Zone to use.
     */
    @JsonProperty(value = "properties.dnsZoneId")
    private String dnsZoneId;

    /**
     * Target DNS type (would be used for migration). Possible values include:
     * 'AzureDns', 'DefaultDomainRegistrarDns'.
     */
    @JsonProperty(value = "properties.targetDnsType")
    private DnsType targetDnsType;

    /**
     * The authCode property.
     */
    @JsonProperty(value = "properties.authCode")
    private String authCode;

    /**
     * Get administrative contact.
     *
     * @return the contactAdmin value
     */
    public Contact contactAdmin() {
        return this.contactAdmin;
    }

    /**
     * Set administrative contact.
     *
     * @param contactAdmin the contactAdmin value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactAdmin(Contact contactAdmin) {
        this.contactAdmin = contactAdmin;
        return this;
    }

    /**
     * Get billing contact.
     *
     * @return the contactBilling value
     */
    public Contact contactBilling() {
        return this.contactBilling;
    }

    /**
     * Set billing contact.
     *
     * @param contactBilling the contactBilling value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactBilling(Contact contactBilling) {
        this.contactBilling = contactBilling;
        return this;
    }

    /**
     * Get registrant contact.
     *
     * @return the contactRegistrant value
     */
    public Contact contactRegistrant() {
        return this.contactRegistrant;
    }

    /**
     * Set registrant contact.
     *
     * @param contactRegistrant the contactRegistrant value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactRegistrant(Contact contactRegistrant) {
        this.contactRegistrant = contactRegistrant;
        return this;
    }

    /**
     * Get technical contact.
     *
     * @return the contactTech value
     */
    public Contact contactTech() {
        return this.contactTech;
    }

    /**
     * Set technical contact.
     *
     * @param contactTech the contactTech value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactTech(Contact contactTech) {
        this.contactTech = contactTech;
        return this;
    }

    /**
     * Get domain registration status. Possible values include: 'Active', 'Awaiting', 'Cancelled', 'Confiscated', 'Disabled', 'Excluded', 'Expired', 'Failed', 'Held', 'Locked', 'Parked', 'Pending', 'Reserved', 'Reverted', 'Suspended', 'Transferred', 'Unknown', 'Unlocked', 'Unparked', 'Updated', 'JsonConverterFailed'.
     *
     * @return the registrationStatus value
     */
    public DomainStatus registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Get domain provisioning state. Possible values include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name servers.
     *
     * @return the nameServers value
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the privacy value
     */
    public Boolean privacy() {
        return this.privacy;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param privacy the privacy value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get domain creation timestamp.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get domain expiration timestamp.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get timestamp when the domain was renewed last time.
     *
     * @return the lastRenewedTime value
     */
    public DateTime lastRenewedTime() {
        return this.lastRenewedTime;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoRenew the autoRenew value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to App Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will be &lt;code&gt;true&lt;/code&gt; if domain registration status is active and
      it is hosted on name servers Azure has programmatic access to.
     *
     * @return the readyForDnsRecordManagement value
     */
    public Boolean readyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }

    /**
     * Get all hostnames derived from the domain and assigned to Azure resources.
     *
     * @return the managedHostNames value
     */
    public List<HostName> managedHostNames() {
        return this.managedHostNames;
    }

    /**
     * Get legal agreement consent.
     *
     * @return the consent value
     */
    public DomainPurchaseConsent consent() {
        return this.consent;
    }

    /**
     * Set legal agreement consent.
     *
     * @param consent the consent value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withConsent(DomainPurchaseConsent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get reasons why domain is not renewable.
     *
     * @return the domainNotRenewableReasons value
     */
    public List<String> domainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }

    /**
     * Get current DNS type. Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'.
     *
     * @return the dnsType value
     */
    public DnsType dnsType() {
        return this.dnsType;
    }

    /**
     * Set current DNS type. Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'.
     *
     * @param dnsType the dnsType value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withDnsType(DnsType dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * Get azure DNS Zone to use.
     *
     * @return the dnsZoneId value
     */
    public String dnsZoneId() {
        return this.dnsZoneId;
    }

    /**
     * Set azure DNS Zone to use.
     *
     * @param dnsZoneId the dnsZoneId value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withDnsZoneId(String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
        return this;
    }

    /**
     * Get target DNS type (would be used for migration). Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'.
     *
     * @return the targetDnsType value
     */
    public DnsType targetDnsType() {
        return this.targetDnsType;
    }

    /**
     * Set target DNS type (would be used for migration). Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'.
     *
     * @param targetDnsType the targetDnsType value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withTargetDnsType(DnsType targetDnsType) {
        this.targetDnsType = targetDnsType;
        return this;
    }

    /**
     * Get the authCode value.
     *
     * @return the authCode value
     */
    public String authCode() {
        return this.authCode;
    }

    /**
     * Set the authCode value.
     *
     * @param authCode the authCode value to set
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

}
