// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dynamodb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Enables a [Kinesis streaming destination](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/kds.html) for data replication of a DynamoDB table.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/dynamodb"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/kinesis"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleTable, err := dynamodb.NewTable(ctx, "exampleTable", &dynamodb.TableArgs{
// 			HashKey: pulumi.String("id"),
// 			Attributes: dynamodb.TableAttributeArray{
// 				&dynamodb.TableAttributeArgs{
// 					Name: pulumi.String("id"),
// 					Type: pulumi.String("S"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleStream, err := kinesis.NewStream(ctx, "exampleStream", &kinesis.StreamArgs{
// 			ShardCount: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = dynamodb.NewKinesisStreamingDestination(ctx, "exampleKinesisStreamingDestination", &dynamodb.KinesisStreamingDestinationArgs{
// 			StreamArn: exampleStream.Arn,
// 			TableName: exampleTable.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// DynamoDB Kinesis Streaming Destinations can be imported using the `table_name` and `stream_arn` separated by `,`, e.g.
//
// ```sh
//  $ pulumi import aws:dynamodb/kinesisStreamingDestination:KinesisStreamingDestination example example,arn:aws:kinesis:us-east-1:111122223333:exampleStreamName
// ```
type KinesisStreamingDestination struct {
	pulumi.CustomResourceState

	// The ARN for a Kinesis data stream. This must exist in the same account and region as the DynamoDB table.
	StreamArn pulumi.StringOutput `pulumi:"streamArn"`
	// The name of the DynamoDB table. There
	// can only be one Kinesis streaming destination for a given DynamoDB table.
	TableName pulumi.StringOutput `pulumi:"tableName"`
}

// NewKinesisStreamingDestination registers a new resource with the given unique name, arguments, and options.
func NewKinesisStreamingDestination(ctx *pulumi.Context,
	name string, args *KinesisStreamingDestinationArgs, opts ...pulumi.ResourceOption) (*KinesisStreamingDestination, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StreamArn == nil {
		return nil, errors.New("invalid value for required argument 'StreamArn'")
	}
	if args.TableName == nil {
		return nil, errors.New("invalid value for required argument 'TableName'")
	}
	var resource KinesisStreamingDestination
	err := ctx.RegisterResource("aws:dynamodb/kinesisStreamingDestination:KinesisStreamingDestination", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKinesisStreamingDestination gets an existing KinesisStreamingDestination resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKinesisStreamingDestination(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KinesisStreamingDestinationState, opts ...pulumi.ResourceOption) (*KinesisStreamingDestination, error) {
	var resource KinesisStreamingDestination
	err := ctx.ReadResource("aws:dynamodb/kinesisStreamingDestination:KinesisStreamingDestination", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KinesisStreamingDestination resources.
type kinesisStreamingDestinationState struct {
	// The ARN for a Kinesis data stream. This must exist in the same account and region as the DynamoDB table.
	StreamArn *string `pulumi:"streamArn"`
	// The name of the DynamoDB table. There
	// can only be one Kinesis streaming destination for a given DynamoDB table.
	TableName *string `pulumi:"tableName"`
}

type KinesisStreamingDestinationState struct {
	// The ARN for a Kinesis data stream. This must exist in the same account and region as the DynamoDB table.
	StreamArn pulumi.StringPtrInput
	// The name of the DynamoDB table. There
	// can only be one Kinesis streaming destination for a given DynamoDB table.
	TableName pulumi.StringPtrInput
}

func (KinesisStreamingDestinationState) ElementType() reflect.Type {
	return reflect.TypeOf((*kinesisStreamingDestinationState)(nil)).Elem()
}

type kinesisStreamingDestinationArgs struct {
	// The ARN for a Kinesis data stream. This must exist in the same account and region as the DynamoDB table.
	StreamArn string `pulumi:"streamArn"`
	// The name of the DynamoDB table. There
	// can only be one Kinesis streaming destination for a given DynamoDB table.
	TableName string `pulumi:"tableName"`
}

// The set of arguments for constructing a KinesisStreamingDestination resource.
type KinesisStreamingDestinationArgs struct {
	// The ARN for a Kinesis data stream. This must exist in the same account and region as the DynamoDB table.
	StreamArn pulumi.StringInput
	// The name of the DynamoDB table. There
	// can only be one Kinesis streaming destination for a given DynamoDB table.
	TableName pulumi.StringInput
}

func (KinesisStreamingDestinationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kinesisStreamingDestinationArgs)(nil)).Elem()
}

type KinesisStreamingDestinationInput interface {
	pulumi.Input

	ToKinesisStreamingDestinationOutput() KinesisStreamingDestinationOutput
	ToKinesisStreamingDestinationOutputWithContext(ctx context.Context) KinesisStreamingDestinationOutput
}

func (*KinesisStreamingDestination) ElementType() reflect.Type {
	return reflect.TypeOf((*KinesisStreamingDestination)(nil))
}

func (i *KinesisStreamingDestination) ToKinesisStreamingDestinationOutput() KinesisStreamingDestinationOutput {
	return i.ToKinesisStreamingDestinationOutputWithContext(context.Background())
}

func (i *KinesisStreamingDestination) ToKinesisStreamingDestinationOutputWithContext(ctx context.Context) KinesisStreamingDestinationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KinesisStreamingDestinationOutput)
}

func (i *KinesisStreamingDestination) ToKinesisStreamingDestinationPtrOutput() KinesisStreamingDestinationPtrOutput {
	return i.ToKinesisStreamingDestinationPtrOutputWithContext(context.Background())
}

func (i *KinesisStreamingDestination) ToKinesisStreamingDestinationPtrOutputWithContext(ctx context.Context) KinesisStreamingDestinationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KinesisStreamingDestinationPtrOutput)
}

type KinesisStreamingDestinationPtrInput interface {
	pulumi.Input

	ToKinesisStreamingDestinationPtrOutput() KinesisStreamingDestinationPtrOutput
	ToKinesisStreamingDestinationPtrOutputWithContext(ctx context.Context) KinesisStreamingDestinationPtrOutput
}

type kinesisStreamingDestinationPtrType KinesisStreamingDestinationArgs

func (*kinesisStreamingDestinationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**KinesisStreamingDestination)(nil))
}

func (i *kinesisStreamingDestinationPtrType) ToKinesisStreamingDestinationPtrOutput() KinesisStreamingDestinationPtrOutput {
	return i.ToKinesisStreamingDestinationPtrOutputWithContext(context.Background())
}

func (i *kinesisStreamingDestinationPtrType) ToKinesisStreamingDestinationPtrOutputWithContext(ctx context.Context) KinesisStreamingDestinationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KinesisStreamingDestinationPtrOutput)
}

// KinesisStreamingDestinationArrayInput is an input type that accepts KinesisStreamingDestinationArray and KinesisStreamingDestinationArrayOutput values.
// You can construct a concrete instance of `KinesisStreamingDestinationArrayInput` via:
//
//          KinesisStreamingDestinationArray{ KinesisStreamingDestinationArgs{...} }
type KinesisStreamingDestinationArrayInput interface {
	pulumi.Input

	ToKinesisStreamingDestinationArrayOutput() KinesisStreamingDestinationArrayOutput
	ToKinesisStreamingDestinationArrayOutputWithContext(context.Context) KinesisStreamingDestinationArrayOutput
}

type KinesisStreamingDestinationArray []KinesisStreamingDestinationInput

func (KinesisStreamingDestinationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KinesisStreamingDestination)(nil)).Elem()
}

func (i KinesisStreamingDestinationArray) ToKinesisStreamingDestinationArrayOutput() KinesisStreamingDestinationArrayOutput {
	return i.ToKinesisStreamingDestinationArrayOutputWithContext(context.Background())
}

func (i KinesisStreamingDestinationArray) ToKinesisStreamingDestinationArrayOutputWithContext(ctx context.Context) KinesisStreamingDestinationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KinesisStreamingDestinationArrayOutput)
}

// KinesisStreamingDestinationMapInput is an input type that accepts KinesisStreamingDestinationMap and KinesisStreamingDestinationMapOutput values.
// You can construct a concrete instance of `KinesisStreamingDestinationMapInput` via:
//
//          KinesisStreamingDestinationMap{ "key": KinesisStreamingDestinationArgs{...} }
type KinesisStreamingDestinationMapInput interface {
	pulumi.Input

	ToKinesisStreamingDestinationMapOutput() KinesisStreamingDestinationMapOutput
	ToKinesisStreamingDestinationMapOutputWithContext(context.Context) KinesisStreamingDestinationMapOutput
}

type KinesisStreamingDestinationMap map[string]KinesisStreamingDestinationInput

func (KinesisStreamingDestinationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KinesisStreamingDestination)(nil)).Elem()
}

func (i KinesisStreamingDestinationMap) ToKinesisStreamingDestinationMapOutput() KinesisStreamingDestinationMapOutput {
	return i.ToKinesisStreamingDestinationMapOutputWithContext(context.Background())
}

func (i KinesisStreamingDestinationMap) ToKinesisStreamingDestinationMapOutputWithContext(ctx context.Context) KinesisStreamingDestinationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KinesisStreamingDestinationMapOutput)
}

type KinesisStreamingDestinationOutput struct{ *pulumi.OutputState }

func (KinesisStreamingDestinationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*KinesisStreamingDestination)(nil))
}

func (o KinesisStreamingDestinationOutput) ToKinesisStreamingDestinationOutput() KinesisStreamingDestinationOutput {
	return o
}

func (o KinesisStreamingDestinationOutput) ToKinesisStreamingDestinationOutputWithContext(ctx context.Context) KinesisStreamingDestinationOutput {
	return o
}

func (o KinesisStreamingDestinationOutput) ToKinesisStreamingDestinationPtrOutput() KinesisStreamingDestinationPtrOutput {
	return o.ToKinesisStreamingDestinationPtrOutputWithContext(context.Background())
}

func (o KinesisStreamingDestinationOutput) ToKinesisStreamingDestinationPtrOutputWithContext(ctx context.Context) KinesisStreamingDestinationPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v KinesisStreamingDestination) *KinesisStreamingDestination {
		return &v
	}).(KinesisStreamingDestinationPtrOutput)
}

type KinesisStreamingDestinationPtrOutput struct{ *pulumi.OutputState }

func (KinesisStreamingDestinationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KinesisStreamingDestination)(nil))
}

func (o KinesisStreamingDestinationPtrOutput) ToKinesisStreamingDestinationPtrOutput() KinesisStreamingDestinationPtrOutput {
	return o
}

func (o KinesisStreamingDestinationPtrOutput) ToKinesisStreamingDestinationPtrOutputWithContext(ctx context.Context) KinesisStreamingDestinationPtrOutput {
	return o
}

func (o KinesisStreamingDestinationPtrOutput) Elem() KinesisStreamingDestinationOutput {
	return o.ApplyT(func(v *KinesisStreamingDestination) KinesisStreamingDestination {
		if v != nil {
			return *v
		}
		var ret KinesisStreamingDestination
		return ret
	}).(KinesisStreamingDestinationOutput)
}

type KinesisStreamingDestinationArrayOutput struct{ *pulumi.OutputState }

func (KinesisStreamingDestinationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]KinesisStreamingDestination)(nil))
}

func (o KinesisStreamingDestinationArrayOutput) ToKinesisStreamingDestinationArrayOutput() KinesisStreamingDestinationArrayOutput {
	return o
}

func (o KinesisStreamingDestinationArrayOutput) ToKinesisStreamingDestinationArrayOutputWithContext(ctx context.Context) KinesisStreamingDestinationArrayOutput {
	return o
}

func (o KinesisStreamingDestinationArrayOutput) Index(i pulumi.IntInput) KinesisStreamingDestinationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) KinesisStreamingDestination {
		return vs[0].([]KinesisStreamingDestination)[vs[1].(int)]
	}).(KinesisStreamingDestinationOutput)
}

type KinesisStreamingDestinationMapOutput struct{ *pulumi.OutputState }

func (KinesisStreamingDestinationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]KinesisStreamingDestination)(nil))
}

func (o KinesisStreamingDestinationMapOutput) ToKinesisStreamingDestinationMapOutput() KinesisStreamingDestinationMapOutput {
	return o
}

func (o KinesisStreamingDestinationMapOutput) ToKinesisStreamingDestinationMapOutputWithContext(ctx context.Context) KinesisStreamingDestinationMapOutput {
	return o
}

func (o KinesisStreamingDestinationMapOutput) MapIndex(k pulumi.StringInput) KinesisStreamingDestinationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) KinesisStreamingDestination {
		return vs[0].(map[string]KinesisStreamingDestination)[vs[1].(string)]
	}).(KinesisStreamingDestinationOutput)
}

func init() {
	pulumi.RegisterOutputType(KinesisStreamingDestinationOutput{})
	pulumi.RegisterOutputType(KinesisStreamingDestinationPtrOutput{})
	pulumi.RegisterOutputType(KinesisStreamingDestinationArrayOutput{})
	pulumi.RegisterOutputType(KinesisStreamingDestinationMapOutput{})
}