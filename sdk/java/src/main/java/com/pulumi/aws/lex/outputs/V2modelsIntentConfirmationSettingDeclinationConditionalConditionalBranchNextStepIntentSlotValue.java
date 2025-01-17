// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValue {
    private @Nullable String interpretedValue;

    private V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValue() {}
    public Optional<String> interpretedValue() {
        return Optional.ofNullable(this.interpretedValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String interpretedValue;
        public Builder() {}
        public Builder(V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interpretedValue = defaults.interpretedValue;
        }

        @CustomType.Setter
        public Builder interpretedValue(@Nullable String interpretedValue) {

            this.interpretedValue = interpretedValue;
            return this;
        }
        public V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValue build() {
            final var _resultValue = new V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValue();
            _resultValue.interpretedValue = interpretedValue;
            return _resultValue;
        }
    }
}
