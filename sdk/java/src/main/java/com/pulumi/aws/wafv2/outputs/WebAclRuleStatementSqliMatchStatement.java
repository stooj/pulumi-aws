// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementSqliMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementSqliMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementSqliMatchStatement {
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    private @Nullable WebAclRuleStatementSqliMatchStatementFieldToMatch fieldToMatch;
    private @Nullable String sensitivityLevel;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `text_transformation` below for details.
     * 
     */
    private List<WebAclRuleStatementSqliMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementSqliMatchStatement() {}
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    public Optional<WebAclRuleStatementSqliMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    public Optional<String> sensitivityLevel() {
        return Optional.ofNullable(this.sensitivityLevel);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `text_transformation` below for details.
     * 
     */
    public List<WebAclRuleStatementSqliMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private @Nullable String sensitivityLevel;
        private List<WebAclRuleStatementSqliMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.sensitivityLevel = defaults.sensitivityLevel;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementSqliMatchStatementFieldToMatch fieldToMatch) {

            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder sensitivityLevel(@Nullable String sensitivityLevel) {

            this.sensitivityLevel = sensitivityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementSqliMatchStatementTextTransformation> textTransformations) {
            if (textTransformations == null) {
              throw new MissingRequiredPropertyException("WebAclRuleStatementSqliMatchStatement", "textTransformations");
            }
            this.textTransformations = textTransformations;
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementSqliMatchStatement build() {
            final var _resultValue = new WebAclRuleStatementSqliMatchStatement();
            _resultValue.fieldToMatch = fieldToMatch;
            _resultValue.sensitivityLevel = sensitivityLevel;
            _resultValue.textTransformations = textTransformations;
            return _resultValue;
        }
    }
}
