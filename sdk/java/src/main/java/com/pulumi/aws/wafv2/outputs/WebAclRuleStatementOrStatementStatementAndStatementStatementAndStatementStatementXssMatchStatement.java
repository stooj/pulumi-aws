// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement {
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    private List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement() {}
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}