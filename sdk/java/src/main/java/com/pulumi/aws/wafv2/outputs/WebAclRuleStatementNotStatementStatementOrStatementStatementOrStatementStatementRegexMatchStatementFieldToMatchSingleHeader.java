// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader {
    /**
     * @return Name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    private String name;

    private WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader() {}
    /**
     * @return Name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader build() {
            final var o = new WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader();
            o.name = name;
            return o;
        }
    }
}