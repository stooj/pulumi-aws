// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
 *
 * ## Example Usage
 *
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.ServicecatalogPortfolioStatus("example", {
 *     status: "Enabled",
 * });
 * ```
 *
 * ## Import
 *
 * Models can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:sagemaker/servicecatalogPortfolioStatus:ServicecatalogPortfolioStatus example us-east-1
 * ```
 */
export class ServicecatalogPortfolioStatus extends pulumi.CustomResource {
    /**
     * Get an existing ServicecatalogPortfolioStatus resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicecatalogPortfolioStatusState, opts?: pulumi.CustomResourceOptions): ServicecatalogPortfolioStatus {
        return new ServicecatalogPortfolioStatus(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sagemaker/servicecatalogPortfolioStatus:ServicecatalogPortfolioStatus';

    /**
     * Returns true if the given object is an instance of ServicecatalogPortfolioStatus.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicecatalogPortfolioStatus {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicecatalogPortfolioStatus.__pulumiType;
    }

    /**
     * Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a ServicecatalogPortfolioStatus resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicecatalogPortfolioStatusArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicecatalogPortfolioStatusArgs | ServicecatalogPortfolioStatusState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicecatalogPortfolioStatusState | undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ServicecatalogPortfolioStatusArgs | undefined;
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServicecatalogPortfolioStatus.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicecatalogPortfolioStatus resources.
 */
export interface ServicecatalogPortfolioStatusState {
    /**
     * Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServicecatalogPortfolioStatus resource.
 */
export interface ServicecatalogPortfolioStatusArgs {
    /**
     * Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
     */
    status: pulumi.Input<string>;
}