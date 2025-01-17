// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllow;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlock;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptcha;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallenge;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCount;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUse {
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllow allow;
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlock block;
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptcha captcha;
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallenge challenge;
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCount count;

    private WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUse() {}
    public Optional<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllow> allow() {
        return Optional.ofNullable(this.allow);
    }
    public Optional<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlock> block() {
        return Optional.ofNullable(this.block);
    }
    public Optional<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptcha> captcha() {
        return Optional.ofNullable(this.captcha);
    }
    public Optional<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallenge> challenge() {
        return Optional.ofNullable(this.challenge);
    }
    public Optional<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCount> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllow allow;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlock block;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptcha captcha;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallenge challenge;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCount count;
        public Builder() {}
        public Builder(WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.captcha = defaults.captcha;
    	      this.challenge = defaults.challenge;
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder allow(@Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllow allow) {

            this.allow = allow;
            return this;
        }
        @CustomType.Setter
        public Builder block(@Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlock block) {

            this.block = block;
            return this;
        }
        @CustomType.Setter
        public Builder captcha(@Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptcha captcha) {

            this.captcha = captcha;
            return this;
        }
        @CustomType.Setter
        public Builder challenge(@Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallenge challenge) {

            this.challenge = challenge;
            return this;
        }
        @CustomType.Setter
        public Builder count(@Nullable WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCount count) {

            this.count = count;
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUse build() {
            final var _resultValue = new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUse();
            _resultValue.allow = allow;
            _resultValue.block = block;
            _resultValue.captcha = captcha;
            _resultValue.challenge = challenge;
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
