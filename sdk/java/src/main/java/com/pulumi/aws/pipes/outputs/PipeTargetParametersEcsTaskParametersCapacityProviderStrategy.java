// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipeTargetParametersEcsTaskParametersCapacityProviderStrategy {
    private @Nullable Integer base;
    private String capacityProvider;
    private @Nullable Integer weight;

    private PipeTargetParametersEcsTaskParametersCapacityProviderStrategy() {}
    public Optional<Integer> base() {
        return Optional.ofNullable(this.base);
    }
    public String capacityProvider() {
        return this.capacityProvider;
    }
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipeTargetParametersEcsTaskParametersCapacityProviderStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer base;
        private String capacityProvider;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(PipeTargetParametersEcsTaskParametersCapacityProviderStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder base(@Nullable Integer base) {

            this.base = base;
            return this;
        }
        @CustomType.Setter
        public Builder capacityProvider(String capacityProvider) {
            if (capacityProvider == null) {
              throw new MissingRequiredPropertyException("PipeTargetParametersEcsTaskParametersCapacityProviderStrategy", "capacityProvider");
            }
            this.capacityProvider = capacityProvider;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {

            this.weight = weight;
            return this;
        }
        public PipeTargetParametersEcsTaskParametersCapacityProviderStrategy build() {
            final var _resultValue = new PipeTargetParametersEcsTaskParametersCapacityProviderStrategy();
            _resultValue.base = base;
            _resultValue.capacityProvider = capacityProvider;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
