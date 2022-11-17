// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Kendra FAQ.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Faq("example", {
 *     indexId: aws_kendra_index.example.id,
 *     roleArn: aws_iam_role.example.arn,
 *     s3Path: {
 *         bucket: aws_s3_bucket.example.id,
 *         key: aws_s3_object.example.key,
 *     },
 *     tags: {
 *         Name: "Example Kendra Faq",
 *     },
 * });
 * ```
 * ### With File Format
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Faq("example", {
 *     indexId: aws_kendra_index.example.id,
 *     fileFormat: "CSV",
 *     roleArn: aws_iam_role.example.arn,
 *     s3Path: {
 *         bucket: aws_s3_bucket.example.id,
 *         key: aws_s3_object.example.key,
 *     },
 * });
 * ```
 * ### With Language Code
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Faq("example", {
 *     indexId: aws_kendra_index.example.id,
 *     languageCode: "en",
 *     roleArn: aws_iam_role.example.arn,
 *     s3Path: {
 *         bucket: aws_s3_bucket.example.id,
 *         key: aws_s3_object.example.key,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * `aws_kendra_faq` can be imported using the unique identifiers of the FAQ and index separated by a slash (`/`), e.g.,
 *
 * ```sh
 *  $ pulumi import aws:kendra/faq:Faq example faq-123456780/idx-8012925589
 * ```
 */
export class Faq extends pulumi.CustomResource {
    /**
     * Get an existing Faq resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FaqState, opts?: pulumi.CustomResourceOptions): Faq {
        return new Faq(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kendra/faq:Faq';

    /**
     * Returns true if the given object is an instance of Faq.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Faq {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Faq.__pulumiType;
    }

    /**
     * ARN of the FAQ.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The Unix datetime that the FAQ was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The description for a FAQ.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * When the Status field value is `FAILED`, this contains a message that explains why.
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * The identifier of the FAQ.
     */
    public /*out*/ readonly faqId!: pulumi.Output<string>;
    /**
     * The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     */
    public readonly fileFormat!: pulumi.Output<string | undefined>;
    /**
     * The identifier of the index for a FAQ.
     */
    public readonly indexId!: pulumi.Output<string>;
    /**
     * The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     */
    public readonly languageCode!: pulumi.Output<string>;
    /**
     * The name that should be associated with the FAQ.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * The S3 location of the FAQ input data. Detailed below.
     */
    public readonly s3Path!: pulumi.Output<outputs.kendra.FaqS3Path>;
    /**
     * The status of the FAQ. It is ready to use when the status is ACTIVE.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The date and time that the FAQ was last updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a Faq resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FaqArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FaqArgs | FaqState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FaqState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["errorMessage"] = state ? state.errorMessage : undefined;
            resourceInputs["faqId"] = state ? state.faqId : undefined;
            resourceInputs["fileFormat"] = state ? state.fileFormat : undefined;
            resourceInputs["indexId"] = state ? state.indexId : undefined;
            resourceInputs["languageCode"] = state ? state.languageCode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["s3Path"] = state ? state.s3Path : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as FaqArgs | undefined;
            if ((!args || args.indexId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'indexId'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            if ((!args || args.s3Path === undefined) && !opts.urn) {
                throw new Error("Missing required property 's3Path'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fileFormat"] = args ? args.fileFormat : undefined;
            resourceInputs["indexId"] = args ? args.indexId : undefined;
            resourceInputs["languageCode"] = args ? args.languageCode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["s3Path"] = args ? args.s3Path : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["errorMessage"] = undefined /*out*/;
            resourceInputs["faqId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Faq.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Faq resources.
 */
export interface FaqState {
    /**
     * ARN of the FAQ.
     */
    arn?: pulumi.Input<string>;
    /**
     * The Unix datetime that the FAQ was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The description for a FAQ.
     */
    description?: pulumi.Input<string>;
    /**
     * When the Status field value is `FAILED`, this contains a message that explains why.
     */
    errorMessage?: pulumi.Input<string>;
    /**
     * The identifier of the FAQ.
     */
    faqId?: pulumi.Input<string>;
    /**
     * The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     */
    fileFormat?: pulumi.Input<string>;
    /**
     * The identifier of the index for a FAQ.
     */
    indexId?: pulumi.Input<string>;
    /**
     * The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     */
    languageCode?: pulumi.Input<string>;
    /**
     * The name that should be associated with the FAQ.
     */
    name?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     */
    roleArn?: pulumi.Input<string>;
    /**
     * The S3 location of the FAQ input data. Detailed below.
     */
    s3Path?: pulumi.Input<inputs.kendra.FaqS3Path>;
    /**
     * The status of the FAQ. It is ready to use when the status is ACTIVE.
     */
    status?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The date and time that the FAQ was last updated.
     */
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Faq resource.
 */
export interface FaqArgs {
    /**
     * The description for a FAQ.
     */
    description?: pulumi.Input<string>;
    /**
     * The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     */
    fileFormat?: pulumi.Input<string>;
    /**
     * The identifier of the index for a FAQ.
     */
    indexId: pulumi.Input<string>;
    /**
     * The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     */
    languageCode?: pulumi.Input<string>;
    /**
     * The name that should be associated with the FAQ.
     */
    name?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     */
    roleArn: pulumi.Input<string>;
    /**
     * The S3 location of the FAQ input data. Detailed below.
     */
    s3Path: pulumi.Input<inputs.kendra.FaqS3Path>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}