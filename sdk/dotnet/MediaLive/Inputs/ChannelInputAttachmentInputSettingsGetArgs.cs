// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputAttachmentInputSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("audioSelectors")]
        private InputList<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorGetArgs>? _audioSelectors;
        public InputList<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorGetArgs> AudioSelectors
        {
            get => _audioSelectors ?? (_audioSelectors = new InputList<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorGetArgs>());
            set => _audioSelectors = value;
        }

        [Input("captionSelectors")]
        private InputList<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorGetArgs>? _captionSelectors;
        public InputList<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorGetArgs> CaptionSelectors
        {
            get => _captionSelectors ?? (_captionSelectors = new InputList<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorGetArgs>());
            set => _captionSelectors = value;
        }

        public ChannelInputAttachmentInputSettingsGetArgs()
        {
        }
        public static new ChannelInputAttachmentInputSettingsGetArgs Empty => new ChannelInputAttachmentInputSettingsGetArgs();
    }
}