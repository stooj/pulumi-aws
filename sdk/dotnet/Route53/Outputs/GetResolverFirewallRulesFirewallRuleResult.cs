// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53.Outputs
{

    [OutputType]
    public sealed class GetResolverFirewallRulesFirewallRuleResult
    {
        /// <summary>
        /// The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The DNS record's type.
        /// </summary>
        public readonly string BlockOverrideDnsType;
        /// <summary>
        /// The custom DNS record to send back in response to the query.
        /// </summary>
        public readonly string BlockOverrideDomain;
        /// <summary>
        /// The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record.
        /// </summary>
        public readonly int BlockOverrideTtl;
        /// <summary>
        /// The way that you want DNS Firewall to block the request.
        /// </summary>
        public readonly string BlockResponse;
        /// <summary>
        /// The date and time that the rule was created, in Unix time format and Coordinated Universal Time (UTC).
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// A unique string defined by you to identify the request.
        /// </summary>
        public readonly string CreatorRequestId;
        /// <summary>
        /// The ID of the domain list that's used in the rule.
        /// </summary>
        public readonly string FirewallDomainListId;
        /// <summary>
        /// The unique identifier of the firewall rule group that you want to retrieve the rules for.
        /// </summary>
        public readonly string FirewallRuleGroupId;
        /// <summary>
        /// The date and time that the rule was last modified, in Unix time format and Coordinated Universal Time (UTC).
        /// </summary>
        public readonly string ModificationTime;
        /// <summary>
        /// The name of the rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The setting that determines the processing order of the rules in a rule group.
        /// </summary>
        public readonly int Priority;

        [OutputConstructor]
        private GetResolverFirewallRulesFirewallRuleResult(
            string action,

            string blockOverrideDnsType,

            string blockOverrideDomain,

            int blockOverrideTtl,

            string blockResponse,

            string creationTime,

            string creatorRequestId,

            string firewallDomainListId,

            string firewallRuleGroupId,

            string modificationTime,

            string name,

            int priority)
        {
            Action = action;
            BlockOverrideDnsType = blockOverrideDnsType;
            BlockOverrideDomain = blockOverrideDomain;
            BlockOverrideTtl = blockOverrideTtl;
            BlockResponse = blockResponse;
            CreationTime = creationTime;
            CreatorRequestId = creatorRequestId;
            FirewallDomainListId = firewallDomainListId;
            FirewallRuleGroupId = firewallRuleGroupId;
            ModificationTime = modificationTime;
            Name = name;
            Priority = priority;
        }
    }
}