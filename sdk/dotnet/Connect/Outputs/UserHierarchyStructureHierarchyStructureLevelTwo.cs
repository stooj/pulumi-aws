// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class UserHierarchyStructureHierarchyStructureLevelTwo
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the hierarchy level.
        /// </summary>
        public readonly string? Arn;
        /// <summary>
        /// The identifier of the hierarchy level.
        /// </summary>
        public readonly string? Id;
        public readonly string Name;

        [OutputConstructor]
        private UserHierarchyStructureHierarchyStructureLevelTwo(
            string? arn,

            string? id,

            string name)
        {
            Arn = arn;
            Id = id;
            Name = name;
        }
    }
}
