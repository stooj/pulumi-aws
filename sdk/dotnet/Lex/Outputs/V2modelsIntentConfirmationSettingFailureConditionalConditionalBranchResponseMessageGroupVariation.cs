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
    public sealed class V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariation
    {
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayload? CustomPayload;
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCard? ImageResponseCard;
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessage? PlainTextMessage;
        public readonly Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessage? SsmlMessage;

        [OutputConstructor]
        private V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariation(
            Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayload? customPayload,

            Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCard? imageResponseCard,

            Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessage? plainTextMessage,

            Outputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessage? ssmlMessage)
        {
            CustomPayload = customPayload;
            ImageResponseCard = imageResponseCard;
            PlainTextMessage = plainTextMessage;
            SsmlMessage = ssmlMessage;
        }
    }
}
