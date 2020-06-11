// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package efs

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides an Elastic File System (EFS) File System Policy resource.
type FileSystemPolicy struct {
	pulumi.CustomResourceState

	// The ID of the EFS file system.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
	Policy pulumi.StringOutput `pulumi:"policy"`
}

// NewFileSystemPolicy registers a new resource with the given unique name, arguments, and options.
func NewFileSystemPolicy(ctx *pulumi.Context,
	name string, args *FileSystemPolicyArgs, opts ...pulumi.ResourceOption) (*FileSystemPolicy, error) {
	if args == nil || args.FileSystemId == nil {
		return nil, errors.New("missing required argument 'FileSystemId'")
	}
	if args == nil || args.Policy == nil {
		return nil, errors.New("missing required argument 'Policy'")
	}
	if args == nil {
		args = &FileSystemPolicyArgs{}
	}
	var resource FileSystemPolicy
	err := ctx.RegisterResource("aws:efs/fileSystemPolicy:FileSystemPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileSystemPolicy gets an existing FileSystemPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileSystemPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileSystemPolicyState, opts ...pulumi.ResourceOption) (*FileSystemPolicy, error) {
	var resource FileSystemPolicy
	err := ctx.ReadResource("aws:efs/fileSystemPolicy:FileSystemPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileSystemPolicy resources.
type fileSystemPolicyState struct {
	// The ID of the EFS file system.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
	Policy *string `pulumi:"policy"`
}

type FileSystemPolicyState struct {
	// The ID of the EFS file system.
	FileSystemId pulumi.StringPtrInput
	// The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
	Policy pulumi.StringPtrInput
}

func (FileSystemPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileSystemPolicyState)(nil)).Elem()
}

type fileSystemPolicyArgs struct {
	// The ID of the EFS file system.
	FileSystemId string `pulumi:"fileSystemId"`
	// The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
	Policy string `pulumi:"policy"`
}

// The set of arguments for constructing a FileSystemPolicy resource.
type FileSystemPolicyArgs struct {
	// The ID of the EFS file system.
	FileSystemId pulumi.StringInput
	// The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
	Policy pulumi.StringInput
}

func (FileSystemPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileSystemPolicyArgs)(nil)).Elem()
}