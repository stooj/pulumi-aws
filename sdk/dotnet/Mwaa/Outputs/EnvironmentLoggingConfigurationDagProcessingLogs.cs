// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Mwaa.Outputs
{

    [OutputType]
    public sealed class EnvironmentLoggingConfigurationDagProcessingLogs
    {
        public readonly string? CloudWatchLogGroupArn;
        public readonly bool? Enabled;
        public readonly string? LogLevel;

        [OutputConstructor]
        private EnvironmentLoggingConfigurationDagProcessingLogs(
            string? cloudWatchLogGroupArn,

            bool? enabled,

            string? logLevel)
        {
            CloudWatchLogGroupArn = cloudWatchLogGroupArn;
            Enabled = enabled;
            LogLevel = logLevel;
        }
    }
}
