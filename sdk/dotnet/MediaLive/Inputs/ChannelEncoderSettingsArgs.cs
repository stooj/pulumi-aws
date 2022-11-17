// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("audioDescriptions")]
        private InputList<Inputs.ChannelEncoderSettingsAudioDescriptionArgs>? _audioDescriptions;

        /// <summary>
        /// Audio descriptions for the channel. See Audio Descriptions for more details.
        /// </summary>
        public InputList<Inputs.ChannelEncoderSettingsAudioDescriptionArgs> AudioDescriptions
        {
            get => _audioDescriptions ?? (_audioDescriptions = new InputList<Inputs.ChannelEncoderSettingsAudioDescriptionArgs>());
            set => _audioDescriptions = value;
        }

        [Input("outputGroups", required: true)]
        private InputList<Inputs.ChannelEncoderSettingsOutputGroupArgs>? _outputGroups;

        /// <summary>
        /// Output groups for the channel. See Output Groups for more details.
        /// </summary>
        public InputList<Inputs.ChannelEncoderSettingsOutputGroupArgs> OutputGroups
        {
            get => _outputGroups ?? (_outputGroups = new InputList<Inputs.ChannelEncoderSettingsOutputGroupArgs>());
            set => _outputGroups = value;
        }

        /// <summary>
        /// Contains settings used to acquire and adjust timecode information from inputs. See Timecode Config for more details.
        /// </summary>
        [Input("timecodeConfig", required: true)]
        public Input<Inputs.ChannelEncoderSettingsTimecodeConfigArgs> TimecodeConfig { get; set; } = null!;

        [Input("videoDescriptions")]
        private InputList<Inputs.ChannelEncoderSettingsVideoDescriptionArgs>? _videoDescriptions;

        /// <summary>
        /// Video Descriptions. See Video Descriptions for more details.
        /// </summary>
        public InputList<Inputs.ChannelEncoderSettingsVideoDescriptionArgs> VideoDescriptions
        {
            get => _videoDescriptions ?? (_videoDescriptions = new InputList<Inputs.ChannelEncoderSettingsVideoDescriptionArgs>());
            set => _videoDescriptions = value;
        }

        public ChannelEncoderSettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsArgs Empty => new ChannelEncoderSettingsArgs();
    }
}