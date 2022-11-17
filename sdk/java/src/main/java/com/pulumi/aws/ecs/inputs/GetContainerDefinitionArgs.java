// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContainerDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerDefinitionArgs Empty = new GetContainerDefinitionArgs();

    /**
     * Name of the container definition
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Name of the container definition
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * ARN of the task definition which contains the container
     * 
     */
    @Import(name="taskDefinition", required=true)
    private Output<String> taskDefinition;

    /**
     * @return ARN of the task definition which contains the container
     * 
     */
    public Output<String> taskDefinition() {
        return this.taskDefinition;
    }

    private GetContainerDefinitionArgs() {}

    private GetContainerDefinitionArgs(GetContainerDefinitionArgs $) {
        this.containerName = $.containerName;
        this.taskDefinition = $.taskDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerDefinitionArgs $;

        public Builder() {
            $ = new GetContainerDefinitionArgs();
        }

        public Builder(GetContainerDefinitionArgs defaults) {
            $ = new GetContainerDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Name of the container definition
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Name of the container definition
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param taskDefinition ARN of the task definition which contains the container
         * 
         * @return builder
         * 
         */
        public Builder taskDefinition(Output<String> taskDefinition) {
            $.taskDefinition = taskDefinition;
            return this;
        }

        /**
         * @param taskDefinition ARN of the task definition which contains the container
         * 
         * @return builder
         * 
         */
        public Builder taskDefinition(String taskDefinition) {
            return taskDefinition(Output.of(taskDefinition));
        }

        public GetContainerDefinitionArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.taskDefinition = Objects.requireNonNull($.taskDefinition, "expected parameter 'taskDefinition' to be non-null");
            return $;
        }
    }

}