// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs();

    @Import(name="failureValues", required=true)
    private Output<List<String>> failureValues;

    public Output<List<String>> failureValues() {
        return this.failureValues;
    }

    /**
     * The identifier for the value to match against in the JSON.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return The identifier for the value to match against in the JSON.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="successValues", required=true)
    private Output<List<String>> successValues;

    public Output<List<String>> successValues() {
        return this.successValues;
    }

    private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs $) {
        this.failureValues = $.failureValues;
        this.identifier = $.identifier;
        this.successValues = $.successValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs(Objects.requireNonNull(defaults));
        }

        public Builder failureValues(Output<List<String>> failureValues) {
            $.failureValues = failureValues;
            return this;
        }

        public Builder failureValues(List<String> failureValues) {
            return failureValues(Output.of(failureValues));
        }

        public Builder failureValues(String... failureValues) {
            return failureValues(List.of(failureValues));
        }

        /**
         * @param identifier The identifier for the value to match against in the JSON.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The identifier for the value to match against in the JSON.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder successValues(Output<List<String>> successValues) {
            $.successValues = successValues;
            return this;
        }

        public Builder successValues(List<String> successValues) {
            return successValues(Output.of(successValues));
        }

        public Builder successValues(String... successValues) {
            return successValues(List.of(successValues));
        }

        public WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs build() {
            if ($.failureValues == null) {
                throw new MissingRequiredPropertyException("WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs", "failureValues");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs", "identifier");
            }
            if ($.successValues == null) {
                throw new MissingRequiredPropertyException("WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs", "successValues");
            }
            return $;
        }
    }

}
