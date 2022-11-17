// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointDnsEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointDnsEntryArgs Empty = new VpcEndpointDnsEntryArgs();

    /**
     * The DNS name.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return The DNS name.
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * The ID of the private hosted zone.
     * 
     */
    @Import(name="hostedZoneId")
    private @Nullable Output<String> hostedZoneId;

    /**
     * @return The ID of the private hosted zone.
     * 
     */
    public Optional<Output<String>> hostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }

    private VpcEndpointDnsEntryArgs() {}

    private VpcEndpointDnsEntryArgs(VpcEndpointDnsEntryArgs $) {
        this.dnsName = $.dnsName;
        this.hostedZoneId = $.hostedZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointDnsEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointDnsEntryArgs $;

        public Builder() {
            $ = new VpcEndpointDnsEntryArgs();
        }

        public Builder(VpcEndpointDnsEntryArgs defaults) {
            $ = new VpcEndpointDnsEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsName The DNS name.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName The DNS name.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param hostedZoneId The ID of the private hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        /**
         * @param hostedZoneId The ID of the private hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        public VpcEndpointDnsEntryArgs build() {
            return $;
        }
    }

}