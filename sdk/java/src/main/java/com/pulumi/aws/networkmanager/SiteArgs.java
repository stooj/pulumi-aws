// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.networkmanager.inputs.SiteLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteArgs Empty = new SiteArgs();

    /**
     * Description of the Site.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Site.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the Global Network to create the site in.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the Global Network to create the site in.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The site location as documented below.
     * 
     */
    @Import(name="location")
    private @Nullable Output<SiteLocationArgs> location;

    /**
     * @return The site location as documented below.
     * 
     */
    public Optional<Output<SiteLocationArgs>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Key-value tags for the Site. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the Site. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SiteArgs() {}

    private SiteArgs(SiteArgs $) {
        this.description = $.description;
        this.globalNetworkId = $.globalNetworkId;
        this.location = $.location;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteArgs $;

        public Builder() {
            $ = new SiteArgs();
        }

        public Builder(SiteArgs defaults) {
            $ = new SiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the Site.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Site.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param globalNetworkId The ID of the Global Network to create the site in.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the Global Network to create the site in.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param location The site location as documented below.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<SiteLocationArgs> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The site location as documented below.
         * 
         * @return builder
         * 
         */
        public Builder location(SiteLocationArgs location) {
            return location(Output.of(location));
        }

        /**
         * @param tags Key-value tags for the Site. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the Site. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SiteArgs build() {
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            return $;
        }
    }

}