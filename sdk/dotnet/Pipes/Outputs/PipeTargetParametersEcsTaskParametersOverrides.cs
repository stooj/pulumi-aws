// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Outputs
{

    [OutputType]
    public sealed class PipeTargetParametersEcsTaskParametersOverrides
    {
        public readonly ImmutableArray<Outputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverride> ContainerOverrides;
        public readonly string? Cpu;
        public readonly Outputs.PipeTargetParametersEcsTaskParametersOverridesEphemeralStorage? EphemeralStorage;
        public readonly string? ExecutionRoleArn;
        public readonly ImmutableArray<Outputs.PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverride> InferenceAcceleratorOverrides;
        public readonly string? Memory;
        public readonly string? TaskRoleArn;

        [OutputConstructor]
        private PipeTargetParametersEcsTaskParametersOverrides(
            ImmutableArray<Outputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverride> containerOverrides,

            string? cpu,

            Outputs.PipeTargetParametersEcsTaskParametersOverridesEphemeralStorage? ephemeralStorage,

            string? executionRoleArn,

            ImmutableArray<Outputs.PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverride> inferenceAcceleratorOverrides,

            string? memory,

            string? taskRoleArn)
        {
            ContainerOverrides = containerOverrides;
            Cpu = cpu;
            EphemeralStorage = ephemeralStorage;
            ExecutionRoleArn = executionRoleArn;
            InferenceAcceleratorOverrides = inferenceAcceleratorOverrides;
            Memory = memory;
            TaskRoleArn = taskRoleArn;
        }
    }
}
