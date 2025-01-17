// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.EndpointConfigurationShadowProductionVariantCoreDumpConfig;
import com.pulumi.aws.sagemaker.outputs.EndpointConfigurationShadowProductionVariantRoutingConfig;
import com.pulumi.aws.sagemaker.outputs.EndpointConfigurationShadowProductionVariantServerlessConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationShadowProductionVariant {
    private @Nullable String acceleratorType;
    private @Nullable Integer containerStartupHealthCheckTimeoutInSeconds;
    private @Nullable EndpointConfigurationShadowProductionVariantCoreDumpConfig coreDumpConfig;
    private @Nullable Boolean enableSsmAccess;
    private @Nullable String inferenceAmiVersion;
    private @Nullable Integer initialInstanceCount;
    private @Nullable Double initialVariantWeight;
    private @Nullable String instanceType;
    private @Nullable Integer modelDataDownloadTimeoutInSeconds;
    private String modelName;
    private @Nullable List<EndpointConfigurationShadowProductionVariantRoutingConfig> routingConfigs;
    private @Nullable EndpointConfigurationShadowProductionVariantServerlessConfig serverlessConfig;
    private @Nullable String variantName;
    private @Nullable Integer volumeSizeInGb;

    private EndpointConfigurationShadowProductionVariant() {}
    public Optional<String> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }
    public Optional<Integer> containerStartupHealthCheckTimeoutInSeconds() {
        return Optional.ofNullable(this.containerStartupHealthCheckTimeoutInSeconds);
    }
    public Optional<EndpointConfigurationShadowProductionVariantCoreDumpConfig> coreDumpConfig() {
        return Optional.ofNullable(this.coreDumpConfig);
    }
    public Optional<Boolean> enableSsmAccess() {
        return Optional.ofNullable(this.enableSsmAccess);
    }
    public Optional<String> inferenceAmiVersion() {
        return Optional.ofNullable(this.inferenceAmiVersion);
    }
    public Optional<Integer> initialInstanceCount() {
        return Optional.ofNullable(this.initialInstanceCount);
    }
    public Optional<Double> initialVariantWeight() {
        return Optional.ofNullable(this.initialVariantWeight);
    }
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<Integer> modelDataDownloadTimeoutInSeconds() {
        return Optional.ofNullable(this.modelDataDownloadTimeoutInSeconds);
    }
    public String modelName() {
        return this.modelName;
    }
    public List<EndpointConfigurationShadowProductionVariantRoutingConfig> routingConfigs() {
        return this.routingConfigs == null ? List.of() : this.routingConfigs;
    }
    public Optional<EndpointConfigurationShadowProductionVariantServerlessConfig> serverlessConfig() {
        return Optional.ofNullable(this.serverlessConfig);
    }
    public Optional<String> variantName() {
        return Optional.ofNullable(this.variantName);
    }
    public Optional<Integer> volumeSizeInGb() {
        return Optional.ofNullable(this.volumeSizeInGb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationShadowProductionVariant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acceleratorType;
        private @Nullable Integer containerStartupHealthCheckTimeoutInSeconds;
        private @Nullable EndpointConfigurationShadowProductionVariantCoreDumpConfig coreDumpConfig;
        private @Nullable Boolean enableSsmAccess;
        private @Nullable String inferenceAmiVersion;
        private @Nullable Integer initialInstanceCount;
        private @Nullable Double initialVariantWeight;
        private @Nullable String instanceType;
        private @Nullable Integer modelDataDownloadTimeoutInSeconds;
        private String modelName;
        private @Nullable List<EndpointConfigurationShadowProductionVariantRoutingConfig> routingConfigs;
        private @Nullable EndpointConfigurationShadowProductionVariantServerlessConfig serverlessConfig;
        private @Nullable String variantName;
        private @Nullable Integer volumeSizeInGb;
        public Builder() {}
        public Builder(EndpointConfigurationShadowProductionVariant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.containerStartupHealthCheckTimeoutInSeconds = defaults.containerStartupHealthCheckTimeoutInSeconds;
    	      this.coreDumpConfig = defaults.coreDumpConfig;
    	      this.enableSsmAccess = defaults.enableSsmAccess;
    	      this.inferenceAmiVersion = defaults.inferenceAmiVersion;
    	      this.initialInstanceCount = defaults.initialInstanceCount;
    	      this.initialVariantWeight = defaults.initialVariantWeight;
    	      this.instanceType = defaults.instanceType;
    	      this.modelDataDownloadTimeoutInSeconds = defaults.modelDataDownloadTimeoutInSeconds;
    	      this.modelName = defaults.modelName;
    	      this.routingConfigs = defaults.routingConfigs;
    	      this.serverlessConfig = defaults.serverlessConfig;
    	      this.variantName = defaults.variantName;
    	      this.volumeSizeInGb = defaults.volumeSizeInGb;
        }

        @CustomType.Setter
        public Builder acceleratorType(@Nullable String acceleratorType) {

            this.acceleratorType = acceleratorType;
            return this;
        }
        @CustomType.Setter
        public Builder containerStartupHealthCheckTimeoutInSeconds(@Nullable Integer containerStartupHealthCheckTimeoutInSeconds) {

            this.containerStartupHealthCheckTimeoutInSeconds = containerStartupHealthCheckTimeoutInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder coreDumpConfig(@Nullable EndpointConfigurationShadowProductionVariantCoreDumpConfig coreDumpConfig) {

            this.coreDumpConfig = coreDumpConfig;
            return this;
        }
        @CustomType.Setter
        public Builder enableSsmAccess(@Nullable Boolean enableSsmAccess) {

            this.enableSsmAccess = enableSsmAccess;
            return this;
        }
        @CustomType.Setter
        public Builder inferenceAmiVersion(@Nullable String inferenceAmiVersion) {

            this.inferenceAmiVersion = inferenceAmiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder initialInstanceCount(@Nullable Integer initialInstanceCount) {

            this.initialInstanceCount = initialInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder initialVariantWeight(@Nullable Double initialVariantWeight) {

            this.initialVariantWeight = initialVariantWeight;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder modelDataDownloadTimeoutInSeconds(@Nullable Integer modelDataDownloadTimeoutInSeconds) {

            this.modelDataDownloadTimeoutInSeconds = modelDataDownloadTimeoutInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder modelName(String modelName) {
            if (modelName == null) {
              throw new MissingRequiredPropertyException("EndpointConfigurationShadowProductionVariant", "modelName");
            }
            this.modelName = modelName;
            return this;
        }
        @CustomType.Setter
        public Builder routingConfigs(@Nullable List<EndpointConfigurationShadowProductionVariantRoutingConfig> routingConfigs) {

            this.routingConfigs = routingConfigs;
            return this;
        }
        public Builder routingConfigs(EndpointConfigurationShadowProductionVariantRoutingConfig... routingConfigs) {
            return routingConfigs(List.of(routingConfigs));
        }
        @CustomType.Setter
        public Builder serverlessConfig(@Nullable EndpointConfigurationShadowProductionVariantServerlessConfig serverlessConfig) {

            this.serverlessConfig = serverlessConfig;
            return this;
        }
        @CustomType.Setter
        public Builder variantName(@Nullable String variantName) {

            this.variantName = variantName;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSizeInGb(@Nullable Integer volumeSizeInGb) {

            this.volumeSizeInGb = volumeSizeInGb;
            return this;
        }
        public EndpointConfigurationShadowProductionVariant build() {
            final var _resultValue = new EndpointConfigurationShadowProductionVariant();
            _resultValue.acceleratorType = acceleratorType;
            _resultValue.containerStartupHealthCheckTimeoutInSeconds = containerStartupHealthCheckTimeoutInSeconds;
            _resultValue.coreDumpConfig = coreDumpConfig;
            _resultValue.enableSsmAccess = enableSsmAccess;
            _resultValue.inferenceAmiVersion = inferenceAmiVersion;
            _resultValue.initialInstanceCount = initialInstanceCount;
            _resultValue.initialVariantWeight = initialVariantWeight;
            _resultValue.instanceType = instanceType;
            _resultValue.modelDataDownloadTimeoutInSeconds = modelDataDownloadTimeoutInSeconds;
            _resultValue.modelName = modelName;
            _resultValue.routingConfigs = routingConfigs;
            _resultValue.serverlessConfig = serverlessConfig;
            _resultValue.variantName = variantName;
            _resultValue.volumeSizeInGb = volumeSizeInGb;
            return _resultValue;
        }
    }
}
