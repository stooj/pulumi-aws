// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an EKS Node Group, which can provision and optionally update an Auto Scaling Group of Kubernetes worker nodes compatible with EKS. Additional documentation about this functionality can be found in the [EKS User Guide](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html).
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/eks_node_group.html.markdown.
 */
export class NodeGroup extends pulumi.CustomResource {
    /**
     * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodeGroupState, opts?: pulumi.CustomResourceOptions): NodeGroup {
        return new NodeGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:eks/nodeGroup:NodeGroup';

    /**
     * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NodeGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NodeGroup.__pulumiType;
    }

    public readonly amiType!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the EKS Node Group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Name of the EKS Cluster.
     */
    public readonly clusterName!: pulumi.Output<string>;
    public readonly diskSize!: pulumi.Output<number>;
    public readonly instanceTypes!: pulumi.Output<string>;
    /**
     * Key-value mapping of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Name of the EKS Node Group.
     */
    public readonly nodeGroupName!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     */
    public readonly nodeRoleArn!: pulumi.Output<string>;
    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     */
    public readonly releaseVersion!: pulumi.Output<string>;
    /**
     * Configuration block with remote access settings. Detailed below.
     */
    public readonly remoteAccess!: pulumi.Output<outputs.eks.NodeGroupRemoteAccess | undefined>;
    /**
     * List of objects containing information about underlying resources.
     */
    public /*out*/ readonly resources!: pulumi.Output<outputs.eks.NodeGroupResource[]>;
    /**
     * Configuration block with scaling settings. Detailed below.
     */
    public readonly scalingConfig!: pulumi.Output<outputs.eks.NodeGroupScalingConfig>;
    /**
     * Status of the EKS Node Group.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * Key-value mapping of resource tags.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a NodeGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NodeGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeGroupArgs | NodeGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NodeGroupState | undefined;
            inputs["amiType"] = state ? state.amiType : undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["diskSize"] = state ? state.diskSize : undefined;
            inputs["instanceTypes"] = state ? state.instanceTypes : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["nodeGroupName"] = state ? state.nodeGroupName : undefined;
            inputs["nodeRoleArn"] = state ? state.nodeRoleArn : undefined;
            inputs["releaseVersion"] = state ? state.releaseVersion : undefined;
            inputs["remoteAccess"] = state ? state.remoteAccess : undefined;
            inputs["resources"] = state ? state.resources : undefined;
            inputs["scalingConfig"] = state ? state.scalingConfig : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["subnetIds"] = state ? state.subnetIds : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as NodeGroupArgs | undefined;
            if (!args || args.clusterName === undefined) {
                throw new Error("Missing required property 'clusterName'");
            }
            if (!args || args.nodeRoleArn === undefined) {
                throw new Error("Missing required property 'nodeRoleArn'");
            }
            if (!args || args.scalingConfig === undefined) {
                throw new Error("Missing required property 'scalingConfig'");
            }
            if (!args || args.subnetIds === undefined) {
                throw new Error("Missing required property 'subnetIds'");
            }
            inputs["amiType"] = args ? args.amiType : undefined;
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["diskSize"] = args ? args.diskSize : undefined;
            inputs["instanceTypes"] = args ? args.instanceTypes : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["nodeGroupName"] = args ? args.nodeGroupName : undefined;
            inputs["nodeRoleArn"] = args ? args.nodeRoleArn : undefined;
            inputs["releaseVersion"] = args ? args.releaseVersion : undefined;
            inputs["remoteAccess"] = args ? args.remoteAccess : undefined;
            inputs["scalingConfig"] = args ? args.scalingConfig : undefined;
            inputs["subnetIds"] = args ? args.subnetIds : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["resources"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NodeGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodeGroup resources.
 */
export interface NodeGroupState {
    readonly amiType?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the EKS Node Group.
     */
    readonly arn?: pulumi.Input<string>;
    /**
     * Name of the EKS Cluster.
     */
    readonly clusterName?: pulumi.Input<string>;
    readonly diskSize?: pulumi.Input<number>;
    readonly instanceTypes?: pulumi.Input<string>;
    /**
     * Key-value mapping of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     */
    readonly labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the EKS Node Group.
     */
    readonly nodeGroupName?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     */
    readonly nodeRoleArn?: pulumi.Input<string>;
    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     */
    readonly releaseVersion?: pulumi.Input<string>;
    /**
     * Configuration block with remote access settings. Detailed below.
     */
    readonly remoteAccess?: pulumi.Input<inputs.eks.NodeGroupRemoteAccess>;
    /**
     * List of objects containing information about underlying resources.
     */
    readonly resources?: pulumi.Input<pulumi.Input<inputs.eks.NodeGroupResource>[]>;
    /**
     * Configuration block with scaling settings. Detailed below.
     */
    readonly scalingConfig?: pulumi.Input<inputs.eks.NodeGroupScalingConfig>;
    /**
     * Status of the EKS Node Group.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     */
    readonly subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value mapping of resource tags.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    readonly version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NodeGroup resource.
 */
export interface NodeGroupArgs {
    readonly amiType?: pulumi.Input<string>;
    /**
     * Name of the EKS Cluster.
     */
    readonly clusterName: pulumi.Input<string>;
    readonly diskSize?: pulumi.Input<number>;
    readonly instanceTypes?: pulumi.Input<string>;
    /**
     * Key-value mapping of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     */
    readonly labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the EKS Node Group.
     */
    readonly nodeGroupName?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     */
    readonly nodeRoleArn: pulumi.Input<string>;
    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     */
    readonly releaseVersion?: pulumi.Input<string>;
    /**
     * Configuration block with remote access settings. Detailed below.
     */
    readonly remoteAccess?: pulumi.Input<inputs.eks.NodeGroupRemoteAccess>;
    /**
     * Configuration block with scaling settings. Detailed below.
     */
    readonly scalingConfig: pulumi.Input<inputs.eks.NodeGroupScalingConfig>;
    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     */
    readonly subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value mapping of resource tags.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    readonly version?: pulumi.Input<string>;
}