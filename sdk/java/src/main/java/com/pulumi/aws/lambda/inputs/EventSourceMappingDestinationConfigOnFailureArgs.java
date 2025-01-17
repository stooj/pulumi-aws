// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EventSourceMappingDestinationConfigOnFailureArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingDestinationConfigOnFailureArgs Empty = new EventSourceMappingDestinationConfigOnFailureArgs();

    @Import(name="destinationArn", required=true)
    private Output<String> destinationArn;

    public Output<String> destinationArn() {
        return this.destinationArn;
    }

    private EventSourceMappingDestinationConfigOnFailureArgs() {}

    private EventSourceMappingDestinationConfigOnFailureArgs(EventSourceMappingDestinationConfigOnFailureArgs $) {
        this.destinationArn = $.destinationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingDestinationConfigOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingDestinationConfigOnFailureArgs $;

        public Builder() {
            $ = new EventSourceMappingDestinationConfigOnFailureArgs();
        }

        public Builder(EventSourceMappingDestinationConfigOnFailureArgs defaults) {
            $ = new EventSourceMappingDestinationConfigOnFailureArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationArn(Output<String> destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        public Builder destinationArn(String destinationArn) {
            return destinationArn(Output.of(destinationArn));
        }

        public EventSourceMappingDestinationConfigOnFailureArgs build() {
            if ($.destinationArn == null) {
                throw new MissingRequiredPropertyException("EventSourceMappingDestinationConfigOnFailureArgs", "destinationArn");
            }
            return $;
        }
    }

}
