// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeGroupResourceAutoscalingGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupResourceAutoscalingGroupArgs Empty = new NodeGroupResourceAutoscalingGroupArgs();

    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NodeGroupResourceAutoscalingGroupArgs() {}

    private NodeGroupResourceAutoscalingGroupArgs(NodeGroupResourceAutoscalingGroupArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupResourceAutoscalingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupResourceAutoscalingGroupArgs $;

        public Builder() {
            $ = new NodeGroupResourceAutoscalingGroupArgs();
        }

        public Builder(NodeGroupResourceAutoscalingGroupArgs defaults) {
            $ = new NodeGroupResourceAutoscalingGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the EC2 Launch Template. Conflicts with `id`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the EC2 Launch Template. Conflicts with `id`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NodeGroupResourceAutoscalingGroupArgs build() {
            return $;
        }
    }

}