// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class PeeringConnectionOptionsRequesterArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowRemoteVpcDnsResolution")]
        public Input<bool>? AllowRemoteVpcDnsResolution { get; set; }

        public PeeringConnectionOptionsRequesterArgs()
        {
        }
        public static new PeeringConnectionOptionsRequesterArgs Empty => new PeeringConnectionOptionsRequesterArgs();
    }
}
