// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class MultiplexProgramMultiplexProgramSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("preferredChannelPipeline", required: true)]
        public Input<string> PreferredChannelPipeline { get; set; } = null!;

        [Input("programNumber", required: true)]
        public Input<int> ProgramNumber { get; set; } = null!;

        [Input("serviceDescriptor")]
        public Input<Inputs.MultiplexProgramMultiplexProgramSettingsServiceDescriptorGetArgs>? ServiceDescriptor { get; set; }

        [Input("videoSettings")]
        public Input<Inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsGetArgs>? VideoSettings { get; set; }

        public MultiplexProgramMultiplexProgramSettingsGetArgs()
        {
        }
        public static new MultiplexProgramMultiplexProgramSettingsGetArgs Empty => new MultiplexProgramMultiplexProgramSettingsGetArgs();
    }
}
