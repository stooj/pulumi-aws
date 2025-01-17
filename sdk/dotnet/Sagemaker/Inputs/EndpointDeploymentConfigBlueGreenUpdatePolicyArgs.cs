// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class EndpointDeploymentConfigBlueGreenUpdatePolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("maximumExecutionTimeoutInSeconds")]
        public Input<int>? MaximumExecutionTimeoutInSeconds { get; set; }

        [Input("terminationWaitInSeconds")]
        public Input<int>? TerminationWaitInSeconds { get; set; }

        [Input("trafficRoutingConfiguration", required: true)]
        public Input<Inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs> TrafficRoutingConfiguration { get; set; } = null!;

        public EndpointDeploymentConfigBlueGreenUpdatePolicyArgs()
        {
        }
        public static new EndpointDeploymentConfigBlueGreenUpdatePolicyArgs Empty => new EndpointDeploymentConfigBlueGreenUpdatePolicyArgs();
    }
}
