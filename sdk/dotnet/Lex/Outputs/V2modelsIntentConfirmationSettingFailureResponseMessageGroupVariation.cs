// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Outputs
{

    [OutputType]
    public sealed class V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariation
    {
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationCustomPayload? CustomPayload;
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCard? ImageResponseCard;
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationPlainTextMessage? PlainTextMessage;
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationSsmlMessage? SsmlMessage;

        [OutputConstructor]
        private V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariation(
            Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationCustomPayload? customPayload,

            Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCard? imageResponseCard,

            Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationPlainTextMessage? plainTextMessage,

            Outputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationSsmlMessage? ssmlMessage)
        {
            CustomPayload = customPayload;
            ImageResponseCard = imageResponseCard;
            PlainTextMessage = plainTextMessage;
            SsmlMessage = ssmlMessage;
        }
    }
}
