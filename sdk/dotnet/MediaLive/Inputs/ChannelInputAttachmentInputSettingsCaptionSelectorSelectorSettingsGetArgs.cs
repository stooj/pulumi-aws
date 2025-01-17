// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ancillarySourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettingsGetArgs>? AncillarySourceSettings { get; set; }

        [Input("aribSourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAribSourceSettingsGetArgs>? AribSourceSettings { get; set; }

        [Input("dvbSubSourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbSubSourceSettingsGetArgs>? DvbSubSourceSettings { get; set; }

        [Input("embeddedSourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettingsGetArgs>? EmbeddedSourceSettings { get; set; }

        [Input("scte20SourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsGetArgs>? Scte20SourceSettings { get; set; }

        [Input("scte27SourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettingsGetArgs>? Scte27SourceSettings { get; set; }

        [Input("teletextSourceSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsGetArgs>? TeletextSourceSettings { get; set; }

        public ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsGetArgs()
        {
        }
        public static new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsGetArgs Empty => new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsGetArgs();
    }
}
