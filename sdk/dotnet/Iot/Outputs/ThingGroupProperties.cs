// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot.Outputs
{

    [OutputType]
    public sealed class ThingGroupProperties
    {
        /// <summary>
        /// The Thing Group attributes. Defined below.
        /// </summary>
        public readonly Outputs.ThingGroupPropertiesAttributePayload? AttributePayload;
        /// <summary>
        /// A description of the Thing Group.
        /// </summary>
        public readonly string? Description;

        [OutputConstructor]
        private ThingGroupProperties(
            Outputs.ThingGroupPropertiesAttributePayload? attributePayload,

            string? description)
        {
            AttributePayload = attributePayload;
            Description = description;
        }
    }
}