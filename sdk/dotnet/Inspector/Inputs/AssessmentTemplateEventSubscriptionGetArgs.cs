// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Inspector.Inputs
{

    public sealed class AssessmentTemplateEventSubscriptionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("event", required: true)]
        public Input<string> Event { get; set; } = null!;

        [Input("topicArn", required: true)]
        public Input<string> TopicArn { get; set; } = null!;

        public AssessmentTemplateEventSubscriptionGetArgs()
        {
        }
        public static new AssessmentTemplateEventSubscriptionGetArgs Empty => new AssessmentTemplateEventSubscriptionGetArgs();
    }
}
