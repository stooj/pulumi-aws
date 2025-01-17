// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsIntentClosingSettingClosingResponseMessageGroupVariationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customPayload")]
        public Input<Inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationCustomPayloadGetArgs>? CustomPayload { get; set; }

        [Input("imageResponseCard")]
        public Input<Inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardGetArgs>? ImageResponseCard { get; set; }

        [Input("plainTextMessage")]
        public Input<Inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationPlainTextMessageGetArgs>? PlainTextMessage { get; set; }

        [Input("ssmlMessage")]
        public Input<Inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationSsmlMessageGetArgs>? SsmlMessage { get; set; }

        public V2modelsIntentClosingSettingClosingResponseMessageGroupVariationGetArgs()
        {
        }
        public static new V2modelsIntentClosingSettingClosingResponseMessageGroupVariationGetArgs Empty => new V2modelsIntentClosingSettingClosingResponseMessageGroupVariationGetArgs();
    }
}
