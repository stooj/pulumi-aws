// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Transfer.Inputs
{

    public sealed class WorkflowStepArgs : global::Pulumi.ResourceArgs
    {
        [Input("copyStepDetails")]
        public Input<Inputs.WorkflowStepCopyStepDetailsArgs>? CopyStepDetails { get; set; }

        [Input("customStepDetails")]
        public Input<Inputs.WorkflowStepCustomStepDetailsArgs>? CustomStepDetails { get; set; }

        [Input("decryptStepDetails")]
        public Input<Inputs.WorkflowStepDecryptStepDetailsArgs>? DecryptStepDetails { get; set; }

        [Input("deleteStepDetails")]
        public Input<Inputs.WorkflowStepDeleteStepDetailsArgs>? DeleteStepDetails { get; set; }

        [Input("tagStepDetails")]
        public Input<Inputs.WorkflowStepTagStepDetailsArgs>? TagStepDetails { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public WorkflowStepArgs()
        {
        }
        public static new WorkflowStepArgs Empty => new WorkflowStepArgs();
    }
}
