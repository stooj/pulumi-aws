// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate {
    /**
     * @return The ID of the Amazon EC2 launch template to use.
     * 
     */
    private @Nullable String launchTemplateId;
    /**
     * @return The name of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    private @Nullable String launchTemplateName;
    /**
     * @return The version of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    private @Nullable String launchTemplateVersion;

    private DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate() {}
    /**
     * @return The ID of the Amazon EC2 launch template to use.
     * 
     */
    public Optional<String> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    /**
     * @return The name of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    public Optional<String> launchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    /**
     * @return The version of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    public Optional<String> launchTemplateVersion() {
        return Optional.ofNullable(this.launchTemplateVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private @Nullable String launchTemplateVersion;
        public Builder() {}
        public Builder(DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.launchTemplateVersion = defaults.launchTemplateVersion;
        }

        @CustomType.Setter
        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplateVersion(@Nullable String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate build() {
            final var o = new DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplate();
            o.launchTemplateId = launchTemplateId;
            o.launchTemplateName = launchTemplateName;
            o.launchTemplateVersion = launchTemplateVersion;
            return o;
        }
    }
}