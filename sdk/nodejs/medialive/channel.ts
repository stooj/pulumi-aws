// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS MediaLive Channel.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.medialive.Channel("example", {
 *     channelClass: "STANDARD",
 *     roleArn: aws_iam_role.example.arn,
 *     inputSpecification: {
 *         codec: "AVC",
 *         inputResolution: "HD",
 *         maximumBitrate: "MAX_20_MBPS",
 *     },
 *     inputAttachments: [{
 *         inputAttachmentName: "example-input",
 *         inputId: aws_medialive_input.example.id,
 *     }],
 *     destinations: [{
 *         id: "destination",
 *         settings: [
 *             {
 *                 url: `s3://${aws_s3_bucket.main.id}/test1`,
 *             },
 *             {
 *                 url: `s3://${aws_s3_bucket.main2.id}/test2`,
 *             },
 *         ],
 *     }],
 *     encoderSettings: {
 *         timecodeConfig: {
 *             source: "EMBEDDED",
 *         },
 *         audioDescriptions: [{
 *             audioSelectorName: "example audio selector",
 *             name: "audio-selector",
 *         }],
 *         videoDescriptions: [{
 *             name: "example-vidoe",
 *         }],
 *         outputGroups: [{
 *             outputGroupSettings: {
 *                 archiveGroupSettings: [{
 *                     destination: {
 *                         destinationRefId: "destination",
 *                     },
 *                 }],
 *             },
 *             outputs: [{
 *                 outputName: "example-name",
 *                 videoDescriptionName: "example-vidoe",
 *                 audioDescriptionNames: ["audio-selector"],
 *                 outputSettings: {
 *                     archiveOutputSettings: {
 *                         nameModifier: "_1",
 *                         extension: "m2ts",
 *                         containerSettings: {
 *                             m2tsSettings: {
 *                                 audioBufferModel: "ATSC",
 *                                 bufferModel: "MULTIPLEX",
 *                                 rateMode: "CBR",
 *                             },
 *                         },
 *                     },
 *                 },
 *             }],
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * MediaLive Channel can be imported using the `channel_id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:medialive/channel:Channel example 1234567
 * ```
 */
export class Channel extends pulumi.CustomResource {
    /**
     * Get an existing Channel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ChannelState, opts?: pulumi.CustomResourceOptions): Channel {
        return new Channel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:medialive/channel:Channel';

    /**
     * Returns true if the given object is an instance of Channel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Channel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Channel.__pulumiType;
    }

    /**
     * ARN of the Channel.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     */
    public readonly cdiInputSpecification!: pulumi.Output<outputs.medialive.ChannelCdiInputSpecification | undefined>;
    /**
     * Concise argument description.
     */
    public readonly channelClass!: pulumi.Output<string>;
    /**
     * ID of the channel in MediaPackage that is the destination for this output group.
     */
    public /*out*/ readonly channelId!: pulumi.Output<string>;
    /**
     * Destinations for channel. See Destinations for more details.
     */
    public readonly destinations!: pulumi.Output<outputs.medialive.ChannelDestination[]>;
    /**
     * Encoder settings. See Encoder Settings for more details.
     */
    public readonly encoderSettings!: pulumi.Output<outputs.medialive.ChannelEncoderSettings>;
    /**
     * Input attachments for the channel. See Input Attachments for more details.
     */
    public readonly inputAttachments!: pulumi.Output<outputs.medialive.ChannelInputAttachment[]>;
    /**
     * Specification of network and file inputs for the channel.
     */
    public readonly inputSpecification!: pulumi.Output<outputs.medialive.ChannelInputSpecification>;
    /**
     * The log level to write to Cloudwatch logs.
     */
    public readonly logLevel!: pulumi.Output<string>;
    /**
     * Maintenance settings for this channel. See Maintenance for more details.
     */
    public readonly maintenance!: pulumi.Output<outputs.medialive.ChannelMaintenance>;
    /**
     * Custom output group name defined by the user.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Concise argument description.
     */
    public readonly roleArn!: pulumi.Output<string | undefined>;
    /**
     * A map of tags to assign to the channel. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Settings for the VPC outputs.
     */
    public readonly vpc!: pulumi.Output<outputs.medialive.ChannelVpc | undefined>;

    /**
     * Create a Channel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ChannelArgs | ChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ChannelState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cdiInputSpecification"] = state ? state.cdiInputSpecification : undefined;
            resourceInputs["channelClass"] = state ? state.channelClass : undefined;
            resourceInputs["channelId"] = state ? state.channelId : undefined;
            resourceInputs["destinations"] = state ? state.destinations : undefined;
            resourceInputs["encoderSettings"] = state ? state.encoderSettings : undefined;
            resourceInputs["inputAttachments"] = state ? state.inputAttachments : undefined;
            resourceInputs["inputSpecification"] = state ? state.inputSpecification : undefined;
            resourceInputs["logLevel"] = state ? state.logLevel : undefined;
            resourceInputs["maintenance"] = state ? state.maintenance : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpc"] = state ? state.vpc : undefined;
        } else {
            const args = argsOrState as ChannelArgs | undefined;
            if ((!args || args.channelClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'channelClass'");
            }
            if ((!args || args.destinations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinations'");
            }
            if ((!args || args.encoderSettings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'encoderSettings'");
            }
            if ((!args || args.inputAttachments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inputAttachments'");
            }
            if ((!args || args.inputSpecification === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inputSpecification'");
            }
            resourceInputs["cdiInputSpecification"] = args ? args.cdiInputSpecification : undefined;
            resourceInputs["channelClass"] = args ? args.channelClass : undefined;
            resourceInputs["destinations"] = args ? args.destinations : undefined;
            resourceInputs["encoderSettings"] = args ? args.encoderSettings : undefined;
            resourceInputs["inputAttachments"] = args ? args.inputAttachments : undefined;
            resourceInputs["inputSpecification"] = args ? args.inputSpecification : undefined;
            resourceInputs["logLevel"] = args ? args.logLevel : undefined;
            resourceInputs["maintenance"] = args ? args.maintenance : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpc"] = args ? args.vpc : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["channelId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Channel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Channel resources.
 */
export interface ChannelState {
    /**
     * ARN of the Channel.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     */
    cdiInputSpecification?: pulumi.Input<inputs.medialive.ChannelCdiInputSpecification>;
    /**
     * Concise argument description.
     */
    channelClass?: pulumi.Input<string>;
    /**
     * ID of the channel in MediaPackage that is the destination for this output group.
     */
    channelId?: pulumi.Input<string>;
    /**
     * Destinations for channel. See Destinations for more details.
     */
    destinations?: pulumi.Input<pulumi.Input<inputs.medialive.ChannelDestination>[]>;
    /**
     * Encoder settings. See Encoder Settings for more details.
     */
    encoderSettings?: pulumi.Input<inputs.medialive.ChannelEncoderSettings>;
    /**
     * Input attachments for the channel. See Input Attachments for more details.
     */
    inputAttachments?: pulumi.Input<pulumi.Input<inputs.medialive.ChannelInputAttachment>[]>;
    /**
     * Specification of network and file inputs for the channel.
     */
    inputSpecification?: pulumi.Input<inputs.medialive.ChannelInputSpecification>;
    /**
     * The log level to write to Cloudwatch logs.
     */
    logLevel?: pulumi.Input<string>;
    /**
     * Maintenance settings for this channel. See Maintenance for more details.
     */
    maintenance?: pulumi.Input<inputs.medialive.ChannelMaintenance>;
    /**
     * Custom output group name defined by the user.
     */
    name?: pulumi.Input<string>;
    /**
     * Concise argument description.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the channel. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Settings for the VPC outputs.
     */
    vpc?: pulumi.Input<inputs.medialive.ChannelVpc>;
}

/**
 * The set of arguments for constructing a Channel resource.
 */
export interface ChannelArgs {
    /**
     * Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     */
    cdiInputSpecification?: pulumi.Input<inputs.medialive.ChannelCdiInputSpecification>;
    /**
     * Concise argument description.
     */
    channelClass: pulumi.Input<string>;
    /**
     * Destinations for channel. See Destinations for more details.
     */
    destinations: pulumi.Input<pulumi.Input<inputs.medialive.ChannelDestination>[]>;
    /**
     * Encoder settings. See Encoder Settings for more details.
     */
    encoderSettings: pulumi.Input<inputs.medialive.ChannelEncoderSettings>;
    /**
     * Input attachments for the channel. See Input Attachments for more details.
     */
    inputAttachments: pulumi.Input<pulumi.Input<inputs.medialive.ChannelInputAttachment>[]>;
    /**
     * Specification of network and file inputs for the channel.
     */
    inputSpecification: pulumi.Input<inputs.medialive.ChannelInputSpecification>;
    /**
     * The log level to write to Cloudwatch logs.
     */
    logLevel?: pulumi.Input<string>;
    /**
     * Maintenance settings for this channel. See Maintenance for more details.
     */
    maintenance?: pulumi.Input<inputs.medialive.ChannelMaintenance>;
    /**
     * Custom output group name defined by the user.
     */
    name?: pulumi.Input<string>;
    /**
     * Concise argument description.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the channel. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Settings for the VPC outputs.
     */
    vpc?: pulumi.Input<inputs.medialive.ChannelVpc>;
}