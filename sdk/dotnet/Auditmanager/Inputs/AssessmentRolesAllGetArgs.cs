// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Auditmanager.Inputs
{

    public sealed class AssessmentRolesAllGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("roleType", required: true)]
        public Input<string> RoleType { get; set; } = null!;

        public AssessmentRolesAllGetArgs()
        {
        }
        public static new AssessmentRolesAllGetArgs Empty => new AssessmentRolesAllGetArgs();
    }
}
