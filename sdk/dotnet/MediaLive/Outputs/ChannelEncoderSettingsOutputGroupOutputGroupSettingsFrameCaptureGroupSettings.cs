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
    public sealed class ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings
    {
        /// <summary>
        /// Destination address and port number for RTP or UDP packets. See Destination for more details.
        /// </summary>
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination Destination;
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings? FrameCaptureCdnSettings;

        [OutputConstructor]
        private ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings(
            Outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination destination,

            Outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings? frameCaptureCdnSettings)
        {
            Destination = destination;
            FrameCaptureCdnSettings = frameCaptureCdnSettings;
        }
    }
}