// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Outputs
{

    [OutputType]
    public sealed class ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings
    {
        public readonly Outputs.ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsHlsInputSettings? HlsInputSettings;
        public readonly string? ServerValidation;

        [OutputConstructor]
        private ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings(
            Outputs.ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettingsHlsInputSettings? hlsInputSettings,

            string? serverValidation)
        {
            HlsInputSettings = hlsInputSettings;
            ServerValidation = serverValidation;
        }
    }
}