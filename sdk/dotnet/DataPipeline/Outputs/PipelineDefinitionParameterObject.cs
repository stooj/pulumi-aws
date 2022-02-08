// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataPipeline.Outputs
{

    [OutputType]
    public sealed class PipelineDefinitionParameterObject
    {
        public readonly ImmutableArray<Outputs.PipelineDefinitionParameterObjectAttribute> Attributes;
        /// <summary>
        /// ID of the parameter value.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private PipelineDefinitionParameterObject(
            ImmutableArray<Outputs.PipelineDefinitionParameterObjectAttribute> attributes,

            string id)
        {
            Attributes = attributes;
            Id = id;
        }
    }
}