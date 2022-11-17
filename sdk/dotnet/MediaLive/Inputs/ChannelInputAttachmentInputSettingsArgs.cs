// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputAttachmentInputSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("audioSelectors")]
        private InputList<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs>? _audioSelectors;
        public InputList<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs> AudioSelectors
        {
            get => _audioSelectors ?? (_audioSelectors = new InputList<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs>());
            set => _audioSelectors = value;
        }

        [Input("captionSelectors")]
        private InputList<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs>? _captionSelectors;
        public InputList<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs> CaptionSelectors
        {
            get => _captionSelectors ?? (_captionSelectors = new InputList<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs>());
            set => _captionSelectors = value;
        }

        public ChannelInputAttachmentInputSettingsArgs()
        {
        }
        public static new ChannelInputAttachmentInputSettingsArgs Empty => new ChannelInputAttachmentInputSettingsArgs();
    }
}