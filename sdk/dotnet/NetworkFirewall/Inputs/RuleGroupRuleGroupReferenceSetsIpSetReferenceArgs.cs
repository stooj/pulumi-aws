// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Inputs
{

    public sealed class RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipSetReferences", required: true)]
        private InputList<Inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs>? _ipSetReferences;
        public InputList<Inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs> IpSetReferences
        {
            get => _ipSetReferences ?? (_ipSetReferences = new InputList<Inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs>());
            set => _ipSetReferences = value;
        }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs()
        {
        }
        public static new RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs Empty => new RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs();
    }
}
