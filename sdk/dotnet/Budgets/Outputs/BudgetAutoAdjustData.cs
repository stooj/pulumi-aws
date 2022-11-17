// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Budgets.Outputs
{

    [OutputType]
    public sealed class BudgetAutoAdjustData
    {
        public readonly string AutoAdjustType;
        public readonly Outputs.BudgetAutoAdjustDataHistoricalOptions? HistoricalOptions;
        public readonly string? LastAutoAdjustTime;

        [OutputConstructor]
        private BudgetAutoAdjustData(
            string autoAdjustType,

            Outputs.BudgetAutoAdjustDataHistoricalOptions? historicalOptions,

            string? lastAutoAdjustTime)
        {
            AutoAdjustType = autoAdjustType;
            HistoricalOptions = historicalOptions;
            LastAutoAdjustTime = lastAutoAdjustTime;
        }
    }
}