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
    public sealed class ChannelEncoderSettingsAudioDescriptionRemixSettings
    {
        public readonly ImmutableArray<Outputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMapping> ChannelMappings;
        public readonly int? ChannelsIn;
        public readonly int? ChannelsOut;

        [OutputConstructor]
        private ChannelEncoderSettingsAudioDescriptionRemixSettings(
            ImmutableArray<Outputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMapping> channelMappings,

            int? channelsIn,

            int? channelsOut)
        {
            ChannelMappings = channelMappings;
            ChannelsIn = channelsIn;
            ChannelsOut = channelsOut;
        }
    }
}