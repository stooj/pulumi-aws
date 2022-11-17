// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs();

    /**
     * Whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
     * 
     */
    @Import(name="modeBlock")
    private @Nullable Output<Boolean> modeBlock;

    /**
     * @return Whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
     * 
     */
    public Optional<Output<Boolean>> modeBlock() {
        return Optional.ofNullable(this.modeBlock);
    }

    /**
     * Whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
    private Output<Boolean> override;

    /**
     * @return Whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Output<Boolean> override() {
        return this.override;
    }

    /**
     * A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
     * 
     */
    @Import(name="protection", required=true)
    private Output<Boolean> protection;

    /**
     * @return A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
     * 
     */
    public Output<Boolean> protection() {
        return this.protection;
    }

    /**
     * A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
     * 
     */
    @Import(name="reportUri")
    private @Nullable Output<String> reportUri;

    /**
     * @return A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
     * 
     */
    public Optional<Output<String>> reportUri() {
        return Optional.ofNullable(this.reportUri);
    }

    private ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs() {}

    private ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs(ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs $) {
        this.modeBlock = $.modeBlock;
        this.override = $.override;
        this.protection = $.protection;
        this.reportUri = $.reportUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs();
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs defaults) {
            $ = new ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param modeBlock Whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
         * 
         * @return builder
         * 
         */
        public Builder modeBlock(@Nullable Output<Boolean> modeBlock) {
            $.modeBlock = modeBlock;
            return this;
        }

        /**
         * @param modeBlock Whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
         * 
         * @return builder
         * 
         */
        public Builder modeBlock(Boolean modeBlock) {
            return modeBlock(Output.of(modeBlock));
        }

        /**
         * @param override Whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        /**
         * @param override Whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        /**
         * @param protection A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
         * 
         * @return builder
         * 
         */
        public Builder protection(Output<Boolean> protection) {
            $.protection = protection;
            return this;
        }

        /**
         * @param protection A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
         * 
         * @return builder
         * 
         */
        public Builder protection(Boolean protection) {
            return protection(Output.of(protection));
        }

        /**
         * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder reportUri(@Nullable Output<String> reportUri) {
            $.reportUri = reportUri;
            return this;
        }

        /**
         * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder reportUri(String reportUri) {
            return reportUri(Output.of(reportUri));
        }

        public ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs build() {
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            $.protection = Objects.requireNonNull($.protection, "expected parameter 'protection' to be non-null");
            return $;
        }
    }

}