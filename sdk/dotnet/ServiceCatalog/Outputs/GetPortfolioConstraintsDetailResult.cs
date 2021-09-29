// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceCatalog.Outputs
{

    [OutputType]
    public sealed class GetPortfolioConstraintsDetailResult
    {
        /// <summary>
        /// Identifier of the constraint.
        /// </summary>
        public readonly string ConstraintId;
        /// <summary>
        /// Description of the constraint.
        /// </summary>
        public readonly string Description;
        public readonly string Owner;
        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        public readonly string PortfolioId;
        /// <summary>
        /// Product identifier.
        /// </summary>
        public readonly string ProductId;
        /// <summary>
        /// Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `STACKSET`, and `TEMPLATE`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPortfolioConstraintsDetailResult(
            string constraintId,

            string description,

            string owner,

            string portfolioId,

            string productId,

            string type)
        {
            ConstraintId = constraintId;
            Description = description;
            Owner = owner;
            PortfolioId = portfolioId;
            ProductId = productId;
            Type = type;
        }
    }
}