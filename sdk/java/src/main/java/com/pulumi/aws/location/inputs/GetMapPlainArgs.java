// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMapPlainArgs Empty = new GetMapPlainArgs();

    /**
     * Name of the map resource.
     * 
     */
    @Import(name="mapName", required=true)
    private String mapName;

    /**
     * @return Name of the map resource.
     * 
     */
    public String mapName() {
        return this.mapName;
    }

    /**
     * Key-value map of resource tags for the map.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value map of resource tags for the map.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetMapPlainArgs() {}

    private GetMapPlainArgs(GetMapPlainArgs $) {
        this.mapName = $.mapName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMapPlainArgs $;

        public Builder() {
            $ = new GetMapPlainArgs();
        }

        public Builder(GetMapPlainArgs defaults) {
            $ = new GetMapPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mapName Name of the map resource.
         * 
         * @return builder
         * 
         */
        public Builder mapName(String mapName) {
            $.mapName = mapName;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags for the map.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetMapPlainArgs build() {
            $.mapName = Objects.requireNonNull($.mapName, "expected parameter 'mapName' to be non-null");
            return $;
        }
    }

}