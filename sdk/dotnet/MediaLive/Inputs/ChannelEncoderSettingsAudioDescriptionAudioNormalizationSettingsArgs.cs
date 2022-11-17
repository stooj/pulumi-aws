// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 to the EBU R-128 specification.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        /// <summary>
        /// Algorithm control for the audio description.
        /// </summary>
        [Input("algorithmControl")]
        public Input<string>? AlgorithmControl { get; set; }

        /// <summary>
        /// Target LKFS (loudness) to adjust volume to.
        /// </summary>
        [Input("targetLkfs")]
        public Input<double>? TargetLkfs { get; set; }

        public ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs Empty => new ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs();
    }
}