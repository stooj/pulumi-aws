// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class DomainDefaultUserSettingsCanvasAppSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
        /// </summary>
        [Input("timeSeriesForecastingSettings")]
        public Input<Inputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsGetArgs>? TimeSeriesForecastingSettings { get; set; }

        public DomainDefaultUserSettingsCanvasAppSettingsGetArgs()
        {
        }
        public static new DomainDefaultUserSettingsCanvasAppSettingsGetArgs Empty => new DomainDefaultUserSettingsCanvasAppSettingsGetArgs();
    }
}