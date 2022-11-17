// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs();

    /**
     * Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;

    /**
     * @return Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    /**
     * @return Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    /**
     * @return Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    /**
     * @return Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * Rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    @Import(name="regexMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs> regexMatchStatement;

    /**
     * @return Rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs>> regexMatchStatement() {
        return Optional.ofNullable(this.regexMatchStatement);
    }

    /**
     * Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    /**
     * @return Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    /**
     * @return Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

    /**
     * @return Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs $) {
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.regexMatchStatement = $.regexMatchStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        /**
         * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        /**
         * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        /**
         * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        /**
         * @param regexMatchStatement Rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs> regexMatchStatement) {
            $.regexMatchStatement = regexMatchStatement;
            return this;
        }

        /**
         * @param regexMatchStatement Rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs regexMatchStatement) {
            return regexMatchStatement(Output.of(regexMatchStatement));
        }

        /**
         * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        /**
         * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        /**
         * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs build() {
            return $;
        }
    }

}