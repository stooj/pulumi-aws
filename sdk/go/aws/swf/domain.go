// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package swf

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides an SWF Domain resource.
type Domain struct {
	s *pulumi.ResourceState
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOpt) (*Domain, error) {
	if args == nil || args.WorkflowExecutionRetentionPeriodInDays == nil {
		return nil, errors.New("missing required argument 'WorkflowExecutionRetentionPeriodInDays'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["name"] = nil
		inputs["namePrefix"] = nil
		inputs["workflowExecutionRetentionPeriodInDays"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["name"] = args.Name
		inputs["namePrefix"] = args.NamePrefix
		inputs["workflowExecutionRetentionPeriodInDays"] = args.WorkflowExecutionRetentionPeriodInDays
	}
	s, err := ctx.RegisterResource("aws:swf/domain:Domain", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Domain{s: s}, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.ID, state *DomainState, opts ...pulumi.ResourceOpt) (*Domain, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["name"] = state.Name
		inputs["namePrefix"] = state.NamePrefix
		inputs["workflowExecutionRetentionPeriodInDays"] = state.WorkflowExecutionRetentionPeriodInDays
	}
	s, err := ctx.ReadResource("aws:swf/domain:Domain", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Domain{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Domain) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Domain) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The domain description.
func (r *Domain) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// The name of the domain. If omitted, Terraform will assign a random, unique name.
func (r *Domain) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
func (r *Domain) NamePrefix() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["namePrefix"])
}

// Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
func (r *Domain) WorkflowExecutionRetentionPeriodInDays() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["workflowExecutionRetentionPeriodInDays"])
}

// Input properties used for looking up and filtering Domain resources.
type DomainState struct {
	// The domain description.
	Description interface{}
	// The name of the domain. If omitted, Terraform will assign a random, unique name.
	Name interface{}
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix interface{}
	// Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
	WorkflowExecutionRetentionPeriodInDays interface{}
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The domain description.
	Description interface{}
	// The name of the domain. If omitted, Terraform will assign a random, unique name.
	Name interface{}
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix interface{}
	// Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
	WorkflowExecutionRetentionPeriodInDays interface{}
}