// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package lex

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides details about a specific Amazon Lex Slot Type.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/lex"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "1"
// 		_, err := lex.LookupSlotType(ctx, &lex.LookupSlotTypeArgs{
// 			Name:    "FlowerTypes",
// 			Version: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupSlotType(ctx *pulumi.Context, args *LookupSlotTypeArgs, opts ...pulumi.InvokeOption) (*LookupSlotTypeResult, error) {
	var rv LookupSlotTypeResult
	err := ctx.Invoke("aws:lex/getSlotType:getSlotType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSlotType.
type LookupSlotTypeArgs struct {
	// The name of the slot type. The name is case sensitive.
	Name string `pulumi:"name"`
	// The version of the slot type.
	Version *string `pulumi:"version"`
}

// A collection of values returned by getSlotType.
type LookupSlotTypeResult struct {
	// Checksum identifying the version of the slot type that was created. The checksum is
	// not included as an argument because the resource will add it automatically when updating the slot type.
	Checksum string `pulumi:"checksum"`
	// The date when the slot type version was created.
	CreatedDate string `pulumi:"createdDate"`
	// A description of the slot type.
	Description string `pulumi:"description"`
	// A set of EnumerationValue objects that defines the values that
	// the slot type can take. Each value can have a set of synonyms, which are additional values that help
	// train the machine learning model about the values that it resolves for a slot.
	EnumerationValues []GetSlotTypeEnumerationValue `pulumi:"enumerationValues"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The date when the $LATEST version of this slot type was updated.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	// The name of the slot type. The name is not case sensitive.
	Name string `pulumi:"name"`
	// Determines the slot resolution strategy that Amazon Lex
	// uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
	// value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
	// if there is a resolution list for the slot, otherwise null is returned.
	ValueSelectionStrategy string `pulumi:"valueSelectionStrategy"`
	// The version of the slot type.
	Version *string `pulumi:"version"`
}