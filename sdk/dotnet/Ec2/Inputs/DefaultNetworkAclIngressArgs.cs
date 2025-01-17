// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class DefaultNetworkAclIngressArgs : global::Pulumi.ResourceArgs
    {
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        [Input("fromPort", required: true)]
        public Input<int> FromPort { get; set; } = null!;

        [Input("icmpCode")]
        public Input<int>? IcmpCode { get; set; }

        [Input("icmpType")]
        public Input<int>? IcmpType { get; set; }

        [Input("ipv6CidrBlock")]
        public Input<string>? Ipv6CidrBlock { get; set; }

        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("ruleNo", required: true)]
        public Input<int> RuleNo { get; set; } = null!;

        [Input("toPort", required: true)]
        public Input<int> ToPort { get; set; } = null!;

        public DefaultNetworkAclIngressArgs()
        {
        }
        public static new DefaultNetworkAclIngressArgs Empty => new DefaultNetworkAclIngressArgs();
    }
}
