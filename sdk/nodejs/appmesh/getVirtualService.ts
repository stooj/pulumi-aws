// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = pulumi.output(aws.appmesh.getVirtualService({
 *     meshName: "example-mesh",
 *     name: "example.mesh.local",
 * }));
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const test = current.then(current => aws.appmesh.getVirtualService({
 *     name: "example.mesh.local",
 *     meshName: "example-mesh",
 *     meshOwner: current.accountId,
 * }));
 * ```
 */
export function getVirtualService(args: GetVirtualServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualServiceResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aws:appmesh/getVirtualService:getVirtualService", {
        "meshName": args.meshName,
        "meshOwner": args.meshOwner,
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualService.
 */
export interface GetVirtualServiceArgs {
    /**
     * The name of the service mesh in which the virtual service exists.
     */
    meshName: string;
    /**
     * The AWS account ID of the service mesh's owner.
     */
    meshOwner?: string;
    /**
     * The name of the virtual service.
     */
    name: string;
    /**
     * A map of tags.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getVirtualService.
 */
export interface GetVirtualServiceResult {
    /**
     * The ARN of the virtual service.
     */
    readonly arn: string;
    /**
     * The creation date of the virtual service.
     */
    readonly createdDate: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The last update date of the virtual service.
     */
    readonly lastUpdatedDate: string;
    readonly meshName: string;
    readonly meshOwner: string;
    readonly name: string;
    /**
     * The resource owner's AWS account ID.
     */
    readonly resourceOwner: string;
    /**
     * The virtual service specification
     */
    readonly specs: outputs.appmesh.GetVirtualServiceSpec[];
    /**
     * A map of tags.
     */
    readonly tags?: {[key: string]: string};
}