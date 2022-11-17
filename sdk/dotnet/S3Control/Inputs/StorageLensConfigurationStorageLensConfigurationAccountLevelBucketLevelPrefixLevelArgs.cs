// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3Control.Inputs
{

    public sealed class StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Prefix-level storage metrics for S3 Storage Lens. See Prefix Level Storage Metrics below for more details.
        /// </summary>
        [Input("storageMetrics", required: true)]
        public Input<Inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs> StorageMetrics { get; set; } = null!;

        public StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs()
        {
        }
        public static new StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs Empty => new StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs();
    }
}