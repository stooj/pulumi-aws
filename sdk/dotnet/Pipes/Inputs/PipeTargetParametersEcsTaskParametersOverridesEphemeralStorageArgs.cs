// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs : global::Pulumi.ResourceArgs
    {
        [Input("sizeInGib", required: true)]
        public Input<int> SizeInGib { get; set; } = null!;

        public PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs()
        {
        }
        public static new PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs Empty => new PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs();
    }
}
