// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAll {
    private RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAll() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAll defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAll build() {
            final var o = new RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAll();
            return o;
        }
    }
}