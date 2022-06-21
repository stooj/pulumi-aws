// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
        /// </summary>
        [Input("errorHandlingConfig")]
        public Input<Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeErrorHandlingConfigGetArgs>? ErrorHandlingConfig { get; set; }

        /// <summary>
        /// The object specified in the Veeva flow source.
        /// </summary>
        [Input("object", required: true)]
        public Input<string> Object { get; set; } = null!;

        public FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeGetArgs()
        {
        }
    }
}