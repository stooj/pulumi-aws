// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs Empty = new InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs();

    @Import(name="cidr", required=true)
    private Output<String> cidr;

    public Output<String> cidr() {
        return this.cidr;
    }

    private InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs() {}

    private InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs(InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs $) {
        this.cidr = $.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs $;

        public Builder() {
            $ = new InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs();
        }

        public Builder(InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs defaults) {
            $ = new InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        public InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs build() {
            if ($.cidr == null) {
                throw new MissingRequiredPropertyException("InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs", "cidr");
            }
            return $;
        }
    }

}
