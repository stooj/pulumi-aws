// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final WebAclAssociationState Empty = new WebAclAssociationState();

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer, an Amazon API Gateway stage, or an Amazon Cognito User Pool.
     * 
     */
    @Import(name="resourceArn")
    private @Nullable Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer, an Amazon API Gateway stage, or an Amazon Cognito User Pool.
     * 
     */
    public Optional<Output<String>> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    /**
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    @Import(name="webAclArn")
    private @Nullable Output<String> webAclArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    public Optional<Output<String>> webAclArn() {
        return Optional.ofNullable(this.webAclArn);
    }

    private WebAclAssociationState() {}

    private WebAclAssociationState(WebAclAssociationState $) {
        this.resourceArn = $.resourceArn;
        this.webAclArn = $.webAclArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclAssociationState $;

        public Builder() {
            $ = new WebAclAssociationState();
        }

        public Builder(WebAclAssociationState defaults) {
            $ = new WebAclAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer, an Amazon API Gateway stage, or an Amazon Cognito User Pool.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer, an Amazon API Gateway stage, or an Amazon Cognito User Pool.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        /**
         * @param webAclArn The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder webAclArn(@Nullable Output<String> webAclArn) {
            $.webAclArn = webAclArn;
            return this;
        }

        /**
         * @param webAclArn The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder webAclArn(String webAclArn) {
            return webAclArn(Output.of(webAclArn));
        }

        public WebAclAssociationState build() {
            return $;
        }
    }

}