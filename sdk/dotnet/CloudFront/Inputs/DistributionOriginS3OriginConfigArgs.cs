// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class DistributionOriginS3OriginConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("originAccessIdentity", required: true)]
        public Input<string> OriginAccessIdentity { get; set; } = null!;

        public DistributionOriginS3OriginConfigArgs()
        {
        }
        public static new DistributionOriginS3OriginConfigArgs Empty => new DistributionOriginS3OriginConfigArgs();
    }
}
