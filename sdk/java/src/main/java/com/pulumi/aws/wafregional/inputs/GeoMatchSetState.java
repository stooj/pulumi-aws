// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.aws.wafregional.inputs.GeoMatchSetGeoMatchConstraintArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GeoMatchSetState extends com.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetState Empty = new GeoMatchSetState();

    /**
     * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @Import(name="geoMatchConstraints")
    private @Nullable Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints;

    /**
     * @return The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    public Optional<Output<List<GeoMatchSetGeoMatchConstraintArgs>>> geoMatchConstraints() {
        return Optional.ofNullable(this.geoMatchConstraints);
    }

    /**
     * The name or description of the Geo Match Set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name or description of the Geo Match Set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GeoMatchSetState() {}

    private GeoMatchSetState(GeoMatchSetState $) {
        this.geoMatchConstraints = $.geoMatchConstraints;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GeoMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GeoMatchSetState $;

        public Builder() {
            $ = new GeoMatchSetState();
        }

        public Builder(GeoMatchSetState defaults) {
            $ = new GeoMatchSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param geoMatchConstraints The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchConstraints(@Nullable Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints) {
            $.geoMatchConstraints = geoMatchConstraints;
            return this;
        }

        /**
         * @param geoMatchConstraints The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchConstraints(List<GeoMatchSetGeoMatchConstraintArgs> geoMatchConstraints) {
            return geoMatchConstraints(Output.of(geoMatchConstraints));
        }

        /**
         * @param geoMatchConstraints The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchConstraints(GeoMatchSetGeoMatchConstraintArgs... geoMatchConstraints) {
            return geoMatchConstraints(List.of(geoMatchConstraints));
        }

        /**
         * @param name The name or description of the Geo Match Set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name or description of the Geo Match Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GeoMatchSetState build() {
            return $;
        }
    }

}