// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeTargetParametersKinesisStreamParametersArgs : global::Pulumi.ResourceArgs
    {
        [Input("partitionKey", required: true)]
        public Input<string> PartitionKey { get; set; } = null!;

        public PipeTargetParametersKinesisStreamParametersArgs()
        {
        }
        public static new PipeTargetParametersKinesisStreamParametersArgs Empty => new PipeTargetParametersKinesisStreamParametersArgs();
    }
}
