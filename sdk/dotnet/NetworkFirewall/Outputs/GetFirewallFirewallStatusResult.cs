// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Outputs
{

    [OutputType]
    public sealed class GetFirewallFirewallStatusResult
    {
        /// <summary>
        /// Aggregated count of all resources used by reference sets in a firewall.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallFirewallStatusCapacityUsageSummaryResult> CapacityUsageSummaries;
        /// <summary>
        /// Summary of sync states for all availability zones in which the firewall is configured.
        /// </summary>
        public readonly string ConfigurationSyncStateSummary;
        public readonly string Status;
        /// <summary>
        /// Set of subnets configured for use by the firewall.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallFirewallStatusSyncStateResult> SyncStates;

        [OutputConstructor]
        private GetFirewallFirewallStatusResult(
            ImmutableArray<Outputs.GetFirewallFirewallStatusCapacityUsageSummaryResult> capacityUsageSummaries,

            string configurationSyncStateSummary,

            string status,

            ImmutableArray<Outputs.GetFirewallFirewallStatusSyncStateResult> syncStates)
        {
            CapacityUsageSummaries = capacityUsageSummaries;
            ConfigurationSyncStateSummary = configurationSyncStateSummary;
            Status = status;
            SyncStates = syncStates;
        }
    }
}