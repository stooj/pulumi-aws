// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("andStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementGetArgs>? AndStatement { get; set; }

        [Input("byteMatchStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementGetArgs>? ByteMatchStatement { get; set; }

        [Input("geoMatchStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementGetArgs>? GeoMatchStatement { get; set; }

        [Input("ipSetReferenceStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementGetArgs>? IpSetReferenceStatement { get; set; }

        [Input("labelMatchStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementGetArgs>? LabelMatchStatement { get; set; }

        [Input("notStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementGetArgs>? NotStatement { get; set; }

        [Input("orStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementGetArgs>? OrStatement { get; set; }

        [Input("regexMatchStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementGetArgs>? RegexMatchStatement { get; set; }

        [Input("regexPatternSetReferenceStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementGetArgs>? RegexPatternSetReferenceStatement { get; set; }

        [Input("sizeConstraintStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementGetArgs>? SizeConstraintStatement { get; set; }

        [Input("sqliMatchStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementGetArgs>? SqliMatchStatement { get; set; }

        [Input("xssMatchStatement")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementGetArgs>? XssMatchStatement { get; set; }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs()
        {
        }
        public static new WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs Empty => new WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs();
    }
}
