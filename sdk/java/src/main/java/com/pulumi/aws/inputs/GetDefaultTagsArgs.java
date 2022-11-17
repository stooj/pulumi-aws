// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDefaultTagsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultTagsArgs Empty = new GetDefaultTagsArgs();

    /**
     * Blocks of default tags set on the provider. See details below.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Blocks of default tags set on the provider. See details below.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDefaultTagsArgs() {}

    private GetDefaultTagsArgs(GetDefaultTagsArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultTagsArgs $;

        public Builder() {
            $ = new GetDefaultTagsArgs();
        }

        public Builder(GetDefaultTagsArgs defaults) {
            $ = new GetDefaultTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags Blocks of default tags set on the provider. See details below.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Blocks of default tags set on the provider. See details below.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetDefaultTagsArgs build() {
            return $;
        }
    }

}