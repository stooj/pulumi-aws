// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.GetFirewallFirewallStatusCapacityUsageSummaryCidr;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallFirewallStatusCapacityUsageSummary {
    /**
     * @return Capacity usage of CIDR blocks used by IP set references in a firewall.
     * 
     */
    private List<GetFirewallFirewallStatusCapacityUsageSummaryCidr> cidrs;

    private GetFirewallFirewallStatusCapacityUsageSummary() {}
    /**
     * @return Capacity usage of CIDR blocks used by IP set references in a firewall.
     * 
     */
    public List<GetFirewallFirewallStatusCapacityUsageSummaryCidr> cidrs() {
        return this.cidrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallFirewallStatusCapacityUsageSummary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFirewallFirewallStatusCapacityUsageSummaryCidr> cidrs;
        public Builder() {}
        public Builder(GetFirewallFirewallStatusCapacityUsageSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
        }

        @CustomType.Setter
        public Builder cidrs(List<GetFirewallFirewallStatusCapacityUsageSummaryCidr> cidrs) {
            this.cidrs = Objects.requireNonNull(cidrs);
            return this;
        }
        public Builder cidrs(GetFirewallFirewallStatusCapacityUsageSummaryCidr... cidrs) {
            return cidrs(List.of(cidrs));
        }
        public GetFirewallFirewallStatusCapacityUsageSummary build() {
            final var o = new GetFirewallFirewallStatusCapacityUsageSummary();
            o.cidrs = cidrs;
            return o;
        }
    }
}