// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolSchemaNumberAttributeConstraintsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaNumberAttributeConstraintsArgs Empty = new UserPoolSchemaNumberAttributeConstraintsArgs();

    /**
     * Maximum value of an attribute that is of the number data type.
     * 
     */
    @Import(name="maxValue")
    private @Nullable Output<String> maxValue;

    /**
     * @return Maximum value of an attribute that is of the number data type.
     * 
     */
    public Optional<Output<String>> maxValue() {
        return Optional.ofNullable(this.maxValue);
    }

    /**
     * Minimum value of an attribute that is of the number data type.
     * 
     */
    @Import(name="minValue")
    private @Nullable Output<String> minValue;

    /**
     * @return Minimum value of an attribute that is of the number data type.
     * 
     */
    public Optional<Output<String>> minValue() {
        return Optional.ofNullable(this.minValue);
    }

    private UserPoolSchemaNumberAttributeConstraintsArgs() {}

    private UserPoolSchemaNumberAttributeConstraintsArgs(UserPoolSchemaNumberAttributeConstraintsArgs $) {
        this.maxValue = $.maxValue;
        this.minValue = $.minValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolSchemaNumberAttributeConstraintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolSchemaNumberAttributeConstraintsArgs $;

        public Builder() {
            $ = new UserPoolSchemaNumberAttributeConstraintsArgs();
        }

        public Builder(UserPoolSchemaNumberAttributeConstraintsArgs defaults) {
            $ = new UserPoolSchemaNumberAttributeConstraintsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxValue Maximum value of an attribute that is of the number data type.
         * 
         * @return builder
         * 
         */
        public Builder maxValue(@Nullable Output<String> maxValue) {
            $.maxValue = maxValue;
            return this;
        }

        /**
         * @param maxValue Maximum value of an attribute that is of the number data type.
         * 
         * @return builder
         * 
         */
        public Builder maxValue(String maxValue) {
            return maxValue(Output.of(maxValue));
        }

        /**
         * @param minValue Minimum value of an attribute that is of the number data type.
         * 
         * @return builder
         * 
         */
        public Builder minValue(@Nullable Output<String> minValue) {
            $.minValue = minValue;
            return this;
        }

        /**
         * @param minValue Minimum value of an attribute that is of the number data type.
         * 
         * @return builder
         * 
         */
        public Builder minValue(String minValue) {
            return minValue(Output.of(minValue));
        }

        public UserPoolSchemaNumberAttributeConstraintsArgs build() {
            return $;
        }
    }

}