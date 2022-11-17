// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        [Input("allQueryArguments")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArgumentsGetArgs>? AllQueryArguments { get; set; }

        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        [Input("body")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchBodyGetArgs>? Body { get; set; }

        /// <summary>
        /// Inspect the cookies in the web request. See Cookies below for details.
        /// </summary>
        [Input("cookies")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesGetArgs>? Cookies { get; set; }

        [Input("headers")]
        private InputList<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeaderGetArgs>? _headers;

        /// <summary>
        /// Inspect the request headers. See Headers below for details.
        /// </summary>
        public InputList<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        [Input("jsonBody")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBodyGetArgs>? JsonBody { get; set; }

        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        [Input("method")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchMethodGetArgs>? Method { get; set; }

        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        [Input("queryString")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchQueryStringGetArgs>? QueryString { get; set; }

        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        [Input("singleHeader")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeaderGetArgs>? SingleHeader { get; set; }

        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        [Input("singleQueryArgument")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgumentGetArgs>? SingleQueryArgument { get; set; }

        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        [Input("uriPath")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchUriPathGetArgs>? UriPath { get; set; }

        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchGetArgs()
        {
        }
        public static new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchGetArgs Empty => new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchGetArgs();
    }
}