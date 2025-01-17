// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentialsMap")]
        private InputMap<string>? _credentialsMap;
        public InputMap<string> CredentialsMap
        {
            get => _credentialsMap ?? (_credentialsMap = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _credentialsMap = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        [Input("customAuthenticationType", required: true)]
        public Input<string> CustomAuthenticationType { get; set; } = null!;

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs();
    }
}
