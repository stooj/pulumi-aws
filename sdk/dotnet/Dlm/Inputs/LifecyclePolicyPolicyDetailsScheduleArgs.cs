// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Inputs
{

    public sealed class LifecyclePolicyPolicyDetailsScheduleArgs : global::Pulumi.ResourceArgs
    {
        [Input("copyTags")]
        public Input<bool>? CopyTags { get; set; }

        [Input("createRule", required: true)]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs> CreateRule { get; set; } = null!;

        [Input("crossRegionCopyRules")]
        private InputList<Inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>? _crossRegionCopyRules;
        public InputList<Inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs> CrossRegionCopyRules
        {
            get => _crossRegionCopyRules ?? (_crossRegionCopyRules = new InputList<Inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>());
            set => _crossRegionCopyRules = value;
        }

        [Input("deprecateRule")]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs>? DeprecateRule { get; set; }

        [Input("fastRestoreRule")]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleArgs>? FastRestoreRule { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("retainRule", required: true)]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs> RetainRule { get; set; } = null!;

        [Input("shareRule")]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleShareRuleArgs>? ShareRule { get; set; }

        [Input("tagsToAdd")]
        private InputMap<string>? _tagsToAdd;
        public InputMap<string> TagsToAdd
        {
            get => _tagsToAdd ?? (_tagsToAdd = new InputMap<string>());
            set => _tagsToAdd = value;
        }

        [Input("variableTags")]
        private InputMap<string>? _variableTags;
        public InputMap<string> VariableTags
        {
            get => _variableTags ?? (_variableTags = new InputMap<string>());
            set => _variableTags = value;
        }

        public LifecyclePolicyPolicyDetailsScheduleArgs()
        {
        }
        public static new LifecyclePolicyPolicyDetailsScheduleArgs Empty => new LifecyclePolicyPolicyDetailsScheduleArgs();
    }
}
