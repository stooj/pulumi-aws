// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudcontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceArgs Empty = new GetResourceArgs();

    /**
     * Identifier of the CloudFormation resource type. For example, `vpc-12345678`.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the CloudFormation resource type. For example, `vpc-12345678`.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * ARN of the IAM Role to assume for operations.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return ARN of the IAM Role to assume for operations.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @Import(name="typeName", required=true)
    private Output<String> typeName;

    /**
     * @return CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    public Output<String> typeName() {
        return this.typeName;
    }

    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @Import(name="typeVersionId")
    private @Nullable Output<String> typeVersionId;

    /**
     * @return Identifier of the CloudFormation resource type version.
     * 
     */
    public Optional<Output<String>> typeVersionId() {
        return Optional.ofNullable(this.typeVersionId);
    }

    private GetResourceArgs() {}

    private GetResourceArgs(GetResourceArgs $) {
        this.identifier = $.identifier;
        this.roleArn = $.roleArn;
        this.typeName = $.typeName;
        this.typeVersionId = $.typeVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceArgs $;

        public Builder() {
            $ = new GetResourceArgs();
        }

        public Builder(GetResourceArgs defaults) {
            $ = new GetResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Identifier of the CloudFormation resource type. For example, `vpc-12345678`.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the CloudFormation resource type. For example, `vpc-12345678`.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param roleArn ARN of the IAM Role to assume for operations.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn ARN of the IAM Role to assume for operations.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param typeName CloudFormation resource type name. For example, `AWS::EC2::VPC`.
         * 
         * @return builder
         * 
         */
        public Builder typeName(Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        /**
         * @param typeName CloudFormation resource type name. For example, `AWS::EC2::VPC`.
         * 
         * @return builder
         * 
         */
        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        /**
         * @param typeVersionId Identifier of the CloudFormation resource type version.
         * 
         * @return builder
         * 
         */
        public Builder typeVersionId(@Nullable Output<String> typeVersionId) {
            $.typeVersionId = typeVersionId;
            return this;
        }

        /**
         * @param typeVersionId Identifier of the CloudFormation resource type version.
         * 
         * @return builder
         * 
         */
        public Builder typeVersionId(String typeVersionId) {
            return typeVersionId(Output.of(typeVersionId));
        }

        public GetResourceArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.typeName = Objects.requireNonNull($.typeName, "expected parameter 'typeName' to be non-null");
            return $;
        }
    }

}