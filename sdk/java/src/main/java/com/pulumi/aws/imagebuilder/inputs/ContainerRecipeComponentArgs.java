// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.ContainerRecipeComponentParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerRecipeComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeComponentArgs Empty = new ContainerRecipeComponentArgs();

    /**
     * Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    @Import(name="componentArn", required=true)
    private Output<String> componentArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    public Output<String> componentArn() {
        return this.componentArn;
    }

    /**
     * Configuration block(s) for parameters to configure the component. Detailed below.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ContainerRecipeComponentParameterArgs>> parameters;

    /**
     * @return Configuration block(s) for parameters to configure the component. Detailed below.
     * 
     */
    public Optional<Output<List<ContainerRecipeComponentParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private ContainerRecipeComponentArgs() {}

    private ContainerRecipeComponentArgs(ContainerRecipeComponentArgs $) {
        this.componentArn = $.componentArn;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerRecipeComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerRecipeComponentArgs $;

        public Builder() {
            $ = new ContainerRecipeComponentArgs();
        }

        public Builder(ContainerRecipeComponentArgs defaults) {
            $ = new ContainerRecipeComponentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentArn Amazon Resource Name (ARN) of the Image Builder Component to associate.
         * 
         * @return builder
         * 
         */
        public Builder componentArn(Output<String> componentArn) {
            $.componentArn = componentArn;
            return this;
        }

        /**
         * @param componentArn Amazon Resource Name (ARN) of the Image Builder Component to associate.
         * 
         * @return builder
         * 
         */
        public Builder componentArn(String componentArn) {
            return componentArn(Output.of(componentArn));
        }

        /**
         * @param parameters Configuration block(s) for parameters to configure the component. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<ContainerRecipeComponentParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Configuration block(s) for parameters to configure the component. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ContainerRecipeComponentParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Configuration block(s) for parameters to configure the component. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(ContainerRecipeComponentParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public ContainerRecipeComponentArgs build() {
            $.componentArn = Objects.requireNonNull($.componentArn, "expected parameter 'componentArn' to be non-null");
            return $;
        }
    }

}