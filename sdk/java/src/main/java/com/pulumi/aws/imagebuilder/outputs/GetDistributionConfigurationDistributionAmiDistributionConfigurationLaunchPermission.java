// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    /**
     * @return Set of AWS Organization ARNs.
     * 
     */
    private List<String> organizationArns;
    /**
     * @return Set of AWS Organizational Unit ARNs.
     * 
     */
    private List<String> organizationalUnitArns;
    /**
     * @return Set of EC2 launch permission user groups.
     * 
     */
    private List<String> userGroups;
    /**
     * @return Set of AWS Account identifiers.
     * 
     */
    private List<String> userIds;

    private GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission() {}
    /**
     * @return Set of AWS Organization ARNs.
     * 
     */
    public List<String> organizationArns() {
        return this.organizationArns;
    }
    /**
     * @return Set of AWS Organizational Unit ARNs.
     * 
     */
    public List<String> organizationalUnitArns() {
        return this.organizationalUnitArns;
    }
    /**
     * @return Set of EC2 launch permission user groups.
     * 
     */
    public List<String> userGroups() {
        return this.userGroups;
    }
    /**
     * @return Set of AWS Account identifiers.
     * 
     */
    public List<String> userIds() {
        return this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> organizationArns;
        private List<String> organizationalUnitArns;
        private List<String> userGroups;
        private List<String> userIds;
        public Builder() {}
        public Builder(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationArns = defaults.organizationArns;
    	      this.organizationalUnitArns = defaults.organizationalUnitArns;
    	      this.userGroups = defaults.userGroups;
    	      this.userIds = defaults.userIds;
        }

        @CustomType.Setter
        public Builder organizationArns(List<String> organizationArns) {
            this.organizationArns = Objects.requireNonNull(organizationArns);
            return this;
        }
        public Builder organizationArns(String... organizationArns) {
            return organizationArns(List.of(organizationArns));
        }
        @CustomType.Setter
        public Builder organizationalUnitArns(List<String> organizationalUnitArns) {
            this.organizationalUnitArns = Objects.requireNonNull(organizationalUnitArns);
            return this;
        }
        public Builder organizationalUnitArns(String... organizationalUnitArns) {
            return organizationalUnitArns(List.of(organizationalUnitArns));
        }
        @CustomType.Setter
        public Builder userGroups(List<String> userGroups) {
            this.userGroups = Objects.requireNonNull(userGroups);
            return this;
        }
        public Builder userGroups(String... userGroups) {
            return userGroups(List.of(userGroups));
        }
        @CustomType.Setter
        public Builder userIds(List<String> userIds) {
            this.userIds = Objects.requireNonNull(userIds);
            return this;
        }
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }
        public GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission build() {
            final var o = new GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission();
            o.organizationArns = organizationArns;
            o.organizationalUnitArns = organizationalUnitArns;
            o.userGroups = userGroups;
            o.userIds = userIds;
            return o;
        }
    }
}