// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Outputs
{

    [OutputType]
    public sealed class DistributionOriginCustomOriginConfig
    {
        public readonly int HttpPort;
        public readonly int HttpsPort;
        public readonly int? OriginKeepaliveTimeout;
        public readonly string OriginProtocolPolicy;
        public readonly int? OriginReadTimeout;
        public readonly ImmutableArray<string> OriginSslProtocols;

        [OutputConstructor]
        private DistributionOriginCustomOriginConfig(
            int httpPort,

            int httpsPort,

            int? originKeepaliveTimeout,

            string originProtocolPolicy,

            int? originReadTimeout,

            ImmutableArray<string> originSslProtocols)
        {
            HttpPort = httpPort;
            HttpsPort = httpsPort;
            OriginKeepaliveTimeout = originKeepaliveTimeout;
            OriginProtocolPolicy = originProtocolPolicy;
            OriginReadTimeout = originReadTimeout;
            OriginSslProtocols = originSslProtocols;
        }
    }
}
