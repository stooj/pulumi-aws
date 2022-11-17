// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParametersByPathArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParametersByPathArgs Empty = new GetParametersByPathArgs();

    /**
     * Prefix path of the parameter.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Prefix path of the parameter.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * Whether to recursively return parameters under `path`. Defaults to `false`.
     * 
     */
    @Import(name="recursive")
    private @Nullable Output<Boolean> recursive;

    /**
     * @return Whether to recursively return parameters under `path`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    @Import(name="withDecryption")
    private @Nullable Output<Boolean> withDecryption;

    /**
     * @return Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> withDecryption() {
        return Optional.ofNullable(this.withDecryption);
    }

    private GetParametersByPathArgs() {}

    private GetParametersByPathArgs(GetParametersByPathArgs $) {
        this.path = $.path;
        this.recursive = $.recursive;
        this.withDecryption = $.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParametersByPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParametersByPathArgs $;

        public Builder() {
            $ = new GetParametersByPathArgs();
        }

        public Builder(GetParametersByPathArgs defaults) {
            $ = new GetParametersByPathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Prefix path of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Prefix path of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param recursive Whether to recursively return parameters under `path`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Output<Boolean> recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param recursive Whether to recursively return parameters under `path`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder recursive(Boolean recursive) {
            return recursive(Output.of(recursive));
        }

        /**
         * @param withDecryption Whether to return decrypted `SecureString` value. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder withDecryption(@Nullable Output<Boolean> withDecryption) {
            $.withDecryption = withDecryption;
            return this;
        }

        /**
         * @param withDecryption Whether to return decrypted `SecureString` value. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder withDecryption(Boolean withDecryption) {
            return withDecryption(Output.of(withDecryption));
        }

        public GetParametersByPathArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}