// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Workspaces.Inputs
{

    public sealed class IpGroupRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the IP group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public IpGroupRuleArgs()
        {
        }
        public static new IpGroupRuleArgs Empty => new IpGroupRuleArgs();
    }
}
