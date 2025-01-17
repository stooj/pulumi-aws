// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager.Outputs
{

    [OutputType]
    public sealed class GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverrideResult
    {
        /// <summary>
        /// A list of strings. The list of edges associated with the network function group.
        /// </summary>
        public readonly ImmutableArray<string> EdgeSets;
        /// <summary>
        /// The preferred edge to use.
        /// </summary>
        public readonly string? UseEdge;

        [OutputConstructor]
        private GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverrideResult(
            ImmutableArray<string> edgeSets,

            string? useEdge)
        {
            EdgeSets = edgeSets;
            UseEdge = useEdge;
        }
    }
}
