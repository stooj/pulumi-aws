// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.inputs;

import com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrailAdvancedEventSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrailAdvancedEventSelectorArgs Empty = new TrailAdvancedEventSelectorArgs();

    /**
     * Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    @Import(name="fieldSelectors", required=true)
    private Output<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors;

    /**
     * @return Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    public Output<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors() {
        return this.fieldSelectors;
    }

    /**
     * Name of the advanced event selector.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the advanced event selector.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TrailAdvancedEventSelectorArgs() {}

    private TrailAdvancedEventSelectorArgs(TrailAdvancedEventSelectorArgs $) {
        this.fieldSelectors = $.fieldSelectors;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrailAdvancedEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrailAdvancedEventSelectorArgs $;

        public Builder() {
            $ = new TrailAdvancedEventSelectorArgs();
        }

        public Builder(TrailAdvancedEventSelectorArgs defaults) {
            $ = new TrailAdvancedEventSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder fieldSelectors(Output<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors) {
            $.fieldSelectors = fieldSelectors;
            return this;
        }

        /**
         * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder fieldSelectors(List<TrailAdvancedEventSelectorFieldSelectorArgs> fieldSelectors) {
            return fieldSelectors(Output.of(fieldSelectors));
        }

        /**
         * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder fieldSelectors(TrailAdvancedEventSelectorFieldSelectorArgs... fieldSelectors) {
            return fieldSelectors(List.of(fieldSelectors));
        }

        /**
         * @param name Name of the advanced event selector.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the advanced event selector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TrailAdvancedEventSelectorArgs build() {
            $.fieldSelectors = Objects.requireNonNull($.fieldSelectors, "expected parameter 'fieldSelectors' to be non-null");
            return $;
        }
    }

}