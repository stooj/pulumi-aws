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
    public sealed class ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings
    {
        /// <summary>
        /// M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
        /// </summary>
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings? M2tsSettings;

        [OutputConstructor]
        private ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings(Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings? m2tsSettings)
        {
            M2tsSettings = m2tsSettings;
        }
    }
}