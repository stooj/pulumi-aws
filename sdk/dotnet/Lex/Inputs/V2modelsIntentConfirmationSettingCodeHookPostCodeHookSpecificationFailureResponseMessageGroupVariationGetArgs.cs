// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customPayload")]
        public Input<Inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationCustomPayloadGetArgs>? CustomPayload { get; set; }

        [Input("imageResponseCard")]
        public Input<Inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardGetArgs>? ImageResponseCard { get; set; }

        [Input("plainTextMessage")]
        public Input<Inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationPlainTextMessageGetArgs>? PlainTextMessage { get; set; }

        [Input("ssmlMessage")]
        public Input<Inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationSsmlMessageGetArgs>? SsmlMessage { get; set; }

        public V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationGetArgs()
        {
        }
        public static new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationGetArgs Empty => new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationGetArgs();
    }
}
