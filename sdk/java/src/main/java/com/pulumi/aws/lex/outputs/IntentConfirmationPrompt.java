// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.IntentConfirmationPromptMessage;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntentConfirmationPrompt {
    private Integer maxAttempts;
    private List<IntentConfirmationPromptMessage> messages;
    private @Nullable String responseCard;

    private IntentConfirmationPrompt() {}
    public Integer maxAttempts() {
        return this.maxAttempts;
    }
    public List<IntentConfirmationPromptMessage> messages() {
        return this.messages;
    }
    public Optional<String> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentConfirmationPrompt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxAttempts;
        private List<IntentConfirmationPromptMessage> messages;
        private @Nullable String responseCard;
        public Builder() {}
        public Builder(IntentConfirmationPrompt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        @CustomType.Setter
        public Builder maxAttempts(Integer maxAttempts) {
            if (maxAttempts == null) {
              throw new MissingRequiredPropertyException("IntentConfirmationPrompt", "maxAttempts");
            }
            this.maxAttempts = maxAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder messages(List<IntentConfirmationPromptMessage> messages) {
            if (messages == null) {
              throw new MissingRequiredPropertyException("IntentConfirmationPrompt", "messages");
            }
            this.messages = messages;
            return this;
        }
        public Builder messages(IntentConfirmationPromptMessage... messages) {
            return messages(List.of(messages));
        }
        @CustomType.Setter
        public Builder responseCard(@Nullable String responseCard) {

            this.responseCard = responseCard;
            return this;
        }
        public IntentConfirmationPrompt build() {
            final var _resultValue = new IntentConfirmationPrompt();
            _resultValue.maxAttempts = maxAttempts;
            _resultValue.messages = messages;
            _resultValue.responseCard = responseCard;
            return _resultValue;
        }
    }
}
