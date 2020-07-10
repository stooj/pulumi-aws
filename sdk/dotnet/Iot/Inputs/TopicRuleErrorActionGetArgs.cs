// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot.Inputs
{

    public sealed class TopicRuleErrorActionGetArgs : Pulumi.ResourceArgs
    {
        [Input("cloudwatchAlarm")]
        public Input<Inputs.TopicRuleErrorActionCloudwatchAlarmGetArgs>? CloudwatchAlarm { get; set; }

        [Input("cloudwatchMetric")]
        public Input<Inputs.TopicRuleErrorActionCloudwatchMetricGetArgs>? CloudwatchMetric { get; set; }

        [Input("dynamodb")]
        public Input<Inputs.TopicRuleErrorActionDynamodbGetArgs>? Dynamodb { get; set; }

        [Input("dynamodbv2")]
        public Input<Inputs.TopicRuleErrorActionDynamodbv2GetArgs>? Dynamodbv2 { get; set; }

        [Input("elasticsearch")]
        public Input<Inputs.TopicRuleErrorActionElasticsearchGetArgs>? Elasticsearch { get; set; }

        [Input("firehose")]
        public Input<Inputs.TopicRuleErrorActionFirehoseGetArgs>? Firehose { get; set; }

        [Input("iotAnalytics")]
        public Input<Inputs.TopicRuleErrorActionIotAnalyticsGetArgs>? IotAnalytics { get; set; }

        [Input("iotEvents")]
        public Input<Inputs.TopicRuleErrorActionIotEventsGetArgs>? IotEvents { get; set; }

        [Input("kinesis")]
        public Input<Inputs.TopicRuleErrorActionKinesisGetArgs>? Kinesis { get; set; }

        [Input("lambda")]
        public Input<Inputs.TopicRuleErrorActionLambdaGetArgs>? Lambda { get; set; }

        [Input("republish")]
        public Input<Inputs.TopicRuleErrorActionRepublishGetArgs>? Republish { get; set; }

        [Input("s3")]
        public Input<Inputs.TopicRuleErrorActionS3GetArgs>? S3 { get; set; }

        [Input("sns")]
        public Input<Inputs.TopicRuleErrorActionSnsGetArgs>? Sns { get; set; }

        [Input("sqs")]
        public Input<Inputs.TopicRuleErrorActionSqsGetArgs>? Sqs { get; set; }

        [Input("stepFunctions")]
        public Input<Inputs.TopicRuleErrorActionStepFunctionsGetArgs>? StepFunctions { get; set; }

        public TopicRuleErrorActionGetArgs()
        {
        }
    }
}