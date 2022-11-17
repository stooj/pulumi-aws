// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.inputs;

import com.pulumi.aws.cfg.inputs.RuleSourceCustomPolicyDetailsArgs;
import com.pulumi.aws.cfg.inputs.RuleSourceSourceDetailArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleSourceArgs Empty = new RuleSourceArgs();

    /**
     * Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
     * 
     */
    @Import(name="customPolicyDetails")
    private @Nullable Output<RuleSourceCustomPolicyDetailsArgs> customPolicyDetails;

    /**
     * @return Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
     * 
     */
    public Optional<Output<RuleSourceCustomPolicyDetailsArgs>> customPolicyDetails() {
        return Optional.ofNullable(this.customPolicyDetails);
    }

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS`, `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g., via the `aws.lambda.Permission` resource.
     * 
     */
    @Import(name="owner", required=true)
    private Output<String> owner;

    /**
     * @return Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS`, `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g., via the `aws.lambda.Permission` resource.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }

    /**
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
     * 
     */
    @Import(name="sourceDetails")
    private @Nullable Output<List<RuleSourceSourceDetailArgs>> sourceDetails;

    /**
     * @return Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
     * 
     */
    public Optional<Output<List<RuleSourceSourceDetailArgs>>> sourceDetails() {
        return Optional.ofNullable(this.sourceDetails);
    }

    /**
     * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
     */
    @Import(name="sourceIdentifier")
    private @Nullable Output<String> sourceIdentifier;

    /**
     * @return For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
     */
    public Optional<Output<String>> sourceIdentifier() {
        return Optional.ofNullable(this.sourceIdentifier);
    }

    private RuleSourceArgs() {}

    private RuleSourceArgs(RuleSourceArgs $) {
        this.customPolicyDetails = $.customPolicyDetails;
        this.owner = $.owner;
        this.sourceDetails = $.sourceDetails;
        this.sourceIdentifier = $.sourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleSourceArgs $;

        public Builder() {
            $ = new RuleSourceArgs();
        }

        public Builder(RuleSourceArgs defaults) {
            $ = new RuleSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customPolicyDetails Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
         * 
         * @return builder
         * 
         */
        public Builder customPolicyDetails(@Nullable Output<RuleSourceCustomPolicyDetailsArgs> customPolicyDetails) {
            $.customPolicyDetails = customPolicyDetails;
            return this;
        }

        /**
         * @param customPolicyDetails Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
         * 
         * @return builder
         * 
         */
        public Builder customPolicyDetails(RuleSourceCustomPolicyDetailsArgs customPolicyDetails) {
            return customPolicyDetails(Output.of(customPolicyDetails));
        }

        /**
         * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS`, `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g., via the `aws.lambda.Permission` resource.
         * 
         * @return builder
         * 
         */
        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS`, `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g., via the `aws.lambda.Permission` resource.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(@Nullable Output<List<RuleSourceSourceDetailArgs>> sourceDetails) {
            $.sourceDetails = sourceDetails;
            return this;
        }

        /**
         * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(List<RuleSourceSourceDetailArgs> sourceDetails) {
            return sourceDetails(Output.of(sourceDetails));
        }

        /**
         * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(RuleSourceSourceDetailArgs... sourceDetails) {
            return sourceDetails(List.of(sourceDetails));
        }

        /**
         * @param sourceIdentifier For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceIdentifier(@Nullable Output<String> sourceIdentifier) {
            $.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * @param sourceIdentifier For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceIdentifier(String sourceIdentifier) {
            return sourceIdentifier(Output.of(sourceIdentifier));
        }

        public RuleSourceArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            return $;
        }
    }

}