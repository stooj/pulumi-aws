// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Inputs
{

    public sealed class DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of the target document attribute or metadata field. For example, 'Department' could be an identifier for the target attribute or metadata field that includes the department names associated with the documents.
        /// </summary>
        [Input("targetDocumentAttributeKey")]
        public Input<string>? TargetDocumentAttributeKey { get; set; }

        /// <summary>
        /// The target value you want to create for the target attribute. For example, 'Finance' could be the target value for the target attribute key 'Department'.
        /// See Document Attribute Value.
        /// </summary>
        [Input("targetDocumentAttributeValue")]
        public Input<Inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetTargetDocumentAttributeValueGetArgs>? TargetDocumentAttributeValue { get; set; }

        /// <summary>
        /// `TRUE` to delete the existing target value for your specified target attribute key. You cannot create a target value and set this to `TRUE`. To create a target value (`TargetDocumentAttributeValue`), set this to `FALSE`.
        /// </summary>
        [Input("targetDocumentAttributeValueDeletion")]
        public Input<bool>? TargetDocumentAttributeValueDeletion { get; set; }

        public DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetGetArgs()
        {
        }
        public static new DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetGetArgs Empty => new DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetGetArgs();
    }
}