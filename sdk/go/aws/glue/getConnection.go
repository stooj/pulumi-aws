// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package glue

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can be used to fetch information about a specific Glue Connection.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/glue"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := glue.LookupConnection(ctx, &glue.LookupConnectionArgs{
// 			Id: "123456789123:connection",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	var rv LookupConnectionResult
	err := ctx.Invoke("aws:glue/getConnection:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnection.
type LookupConnectionArgs struct {
	// A concatenation of the catalog ID and connection name. For example, if your account ID is
	// `123456789123` and the connection name is `conn` then the ID is `123456789123:conn`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getConnection.
type LookupConnectionResult struct {
	// The ARN of the Glue Connection.
	Arn string `pulumi:"arn"`
	// The catalog ID of the Glue Connection.
	CatalogId            string            `pulumi:"catalogId"`
	ConnectionProperties map[string]string `pulumi:"connectionProperties"`
	// The type of Glue Connection.
	ConnectionType string `pulumi:"connectionType"`
	// Description of the connection.
	Description string `pulumi:"description"`
	Id          string `pulumi:"id"`
	// A list of criteria that can be used in selecting this connection.
	MatchCriterias []string `pulumi:"matchCriterias"`
	// The name of the Glue Connection.
	Name string `pulumi:"name"`
	// A map of physical connection requirements, such as VPC and SecurityGroup.
	PhysicalConnectionRequirements []GetConnectionPhysicalConnectionRequirement `pulumi:"physicalConnectionRequirements"`
}

func LookupConnectionOutput(ctx *pulumi.Context, args LookupConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupConnectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectionResult, error) {
			args := v.(LookupConnectionArgs)
			r, err := LookupConnection(ctx, &args, opts...)
			return *r, err
		}).(LookupConnectionResultOutput)
}

// A collection of arguments for invoking getConnection.
type LookupConnectionOutputArgs struct {
	// A concatenation of the catalog ID and connection name. For example, if your account ID is
	// `123456789123` and the connection name is `conn` then the ID is `123456789123:conn`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getConnection.
type LookupConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionResult)(nil)).Elem()
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutput() LookupConnectionResultOutput {
	return o
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutputWithContext(ctx context.Context) LookupConnectionResultOutput {
	return o
}

// The ARN of the Glue Connection.
func (o LookupConnectionResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The catalog ID of the Glue Connection.
func (o LookupConnectionResultOutput) CatalogId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.CatalogId }).(pulumi.StringOutput)
}

func (o LookupConnectionResultOutput) ConnectionProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupConnectionResult) map[string]string { return v.ConnectionProperties }).(pulumi.StringMapOutput)
}

// The type of Glue Connection.
func (o LookupConnectionResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

// Description of the connection.
func (o LookupConnectionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of criteria that can be used in selecting this connection.
func (o LookupConnectionResultOutput) MatchCriterias() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectionResult) []string { return v.MatchCriterias }).(pulumi.StringArrayOutput)
}

// The name of the Glue Connection.
func (o LookupConnectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// A map of physical connection requirements, such as VPC and SecurityGroup.
func (o LookupConnectionResultOutput) PhysicalConnectionRequirements() GetConnectionPhysicalConnectionRequirementArrayOutput {
	return o.ApplyT(func(v LookupConnectionResult) []GetConnectionPhysicalConnectionRequirement {
		return v.PhysicalConnectionRequirements
	}).(GetConnectionPhysicalConnectionRequirementArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectionResultOutput{})
}