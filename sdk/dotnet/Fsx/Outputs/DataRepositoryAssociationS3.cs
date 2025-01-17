// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Outputs
{

    [OutputType]
    public sealed class DataRepositoryAssociationS3
    {
        public readonly Outputs.DataRepositoryAssociationS3AutoExportPolicy? AutoExportPolicy;
        public readonly Outputs.DataRepositoryAssociationS3AutoImportPolicy? AutoImportPolicy;

        [OutputConstructor]
        private DataRepositoryAssociationS3(
            Outputs.DataRepositoryAssociationS3AutoExportPolicy? autoExportPolicy,

            Outputs.DataRepositoryAssociationS3AutoImportPolicy? autoImportPolicy)
        {
            AutoExportPolicy = autoExportPolicy;
            AutoImportPolicy = autoImportPolicy;
        }
    }
}
