// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeTargetParametersEventbridgeEventBusParametersArgs : global::Pulumi.ResourceArgs
    {
        [Input("detailType")]
        public Input<string>? DetailType { get; set; }

        [Input("endpointId")]
        public Input<string>? EndpointId { get; set; }

        [Input("resources")]
        private InputList<string>? _resources;
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        /// <summary>
        /// Source resource of the pipe. This field typically requires an ARN (Amazon Resource Name). However, when using a self-managed Kafka cluster, you should use a different format. Instead of an ARN, use 'smk://' followed by the bootstrap server's address.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("time")]
        public Input<string>? Time { get; set; }

        public PipeTargetParametersEventbridgeEventBusParametersArgs()
        {
        }
        public static new PipeTargetParametersEventbridgeEventBusParametersArgs Empty => new PipeTargetParametersEventbridgeEventBusParametersArgs();
    }
}
