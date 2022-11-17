// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3Control.Inputs
{

    public sealed class StorageLensConfigurationStorageLensConfigurationAwsOrgArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Amazon Web Services organization.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        public StorageLensConfigurationStorageLensConfigurationAwsOrgArgs()
        {
        }
        public static new StorageLensConfigurationStorageLensConfigurationAwsOrgArgs Empty => new StorageLensConfigurationStorageLensConfigurationAwsOrgArgs();
    }
}