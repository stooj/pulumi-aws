// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsoAdmin.Inputs
{

    public sealed class InstanceAccessControlAttributesAttributeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<Inputs.InstanceAccessControlAttributesAttributeValueGetArgs>? _values;
        public InputList<Inputs.InstanceAccessControlAttributesAttributeValueGetArgs> Values
        {
            get => _values ?? (_values = new InputList<Inputs.InstanceAccessControlAttributesAttributeValueGetArgs>());
            set => _values = value;
        }

        public InstanceAccessControlAttributesAttributeGetArgs()
        {
        }
        public static new InstanceAccessControlAttributesAttributeGetArgs Empty => new InstanceAccessControlAttributesAttributeGetArgs();
    }
}
