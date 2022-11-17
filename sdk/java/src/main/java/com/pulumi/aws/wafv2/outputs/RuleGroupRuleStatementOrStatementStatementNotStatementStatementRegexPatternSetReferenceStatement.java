// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement {
    /**
     * @return The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    private String arn;
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    private List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

    private RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement() {}
    /**
     * @return The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement build() {
            final var o = new RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement();
            o.arn = arn;
            o.fieldToMatch = fieldToMatch;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}