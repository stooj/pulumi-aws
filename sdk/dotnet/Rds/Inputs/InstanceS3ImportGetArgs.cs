// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds.Inputs
{

    public sealed class InstanceS3ImportGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        [Input("bucketPrefix")]
        public Input<string>? BucketPrefix { get; set; }

        [Input("ingestionRole", required: true)]
        public Input<string> IngestionRole { get; set; } = null!;

        [Input("sourceEngine", required: true)]
        public Input<string> SourceEngine { get; set; } = null!;

        [Input("sourceEngineVersion", required: true)]
        public Input<string> SourceEngineVersion { get; set; } = null!;

        public InstanceS3ImportGetArgs()
        {
        }
        public static new InstanceS3ImportGetArgs Empty => new InstanceS3ImportGetArgs();
    }
}
