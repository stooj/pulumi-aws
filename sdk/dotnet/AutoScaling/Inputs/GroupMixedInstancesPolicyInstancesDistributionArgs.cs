// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class GroupMixedInstancesPolicyInstancesDistributionArgs : global::Pulumi.ResourceArgs
    {
        [Input("onDemandAllocationStrategy")]
        public Input<string>? OnDemandAllocationStrategy { get; set; }

        [Input("onDemandBaseCapacity")]
        public Input<int>? OnDemandBaseCapacity { get; set; }

        [Input("onDemandPercentageAboveBaseCapacity")]
        public Input<int>? OnDemandPercentageAboveBaseCapacity { get; set; }

        [Input("spotAllocationStrategy")]
        public Input<string>? SpotAllocationStrategy { get; set; }

        [Input("spotInstancePools")]
        public Input<int>? SpotInstancePools { get; set; }

        [Input("spotMaxPrice")]
        public Input<string>? SpotMaxPrice { get; set; }

        public GroupMixedInstancesPolicyInstancesDistributionArgs()
        {
        }
        public static new GroupMixedInstancesPolicyInstancesDistributionArgs Empty => new GroupMixedInstancesPolicyInstancesDistributionArgs();
    }
}
