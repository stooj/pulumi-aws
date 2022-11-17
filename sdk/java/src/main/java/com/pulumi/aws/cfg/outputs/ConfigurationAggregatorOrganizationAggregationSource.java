// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationAggregatorOrganizationAggregationSource {
    /**
     * @return If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    private @Nullable Boolean allRegions;
    /**
     * @return List of source regions being aggregated.
     * 
     */
    private @Nullable List<String> regions;
    /**
     * @return ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
     * 
     */
    private String roleArn;

    private ConfigurationAggregatorOrganizationAggregationSource() {}
    /**
     * @return If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    public Optional<Boolean> allRegions() {
        return Optional.ofNullable(this.allRegions);
    }
    /**
     * @return List of source regions being aggregated.
     * 
     */
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }
    /**
     * @return ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorOrganizationAggregationSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allRegions;
        private @Nullable List<String> regions;
        private String roleArn;
        public Builder() {}
        public Builder(ConfigurationAggregatorOrganizationAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder allRegions(@Nullable Boolean allRegions) {
            this.allRegions = allRegions;
            return this;
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public ConfigurationAggregatorOrganizationAggregationSource build() {
            final var o = new ConfigurationAggregatorOrganizationAggregationSource();
            o.allRegions = allRegions;
            o.regions = regions;
            o.roleArn = roleArn;
            return o;
        }
    }
}