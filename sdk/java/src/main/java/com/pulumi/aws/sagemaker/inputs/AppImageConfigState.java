// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppImageConfigState extends com.pulumi.resources.ResourceArgs {

    public static final AppImageConfigState Empty = new AppImageConfigState();

    /**
     * The name of the App Image Config.
     * 
     */
    @Import(name="appImageConfigName")
    private @Nullable Output<String> appImageConfigName;

    /**
     * @return The name of the App Image Config.
     * 
     */
    public Optional<Output<String>> appImageConfigName() {
        return Optional.ofNullable(this.appImageConfigName);
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this App Image Config.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this App Image Config.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * 
     */
    @Import(name="kernelGatewayImageConfig")
    private @Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;

    /**
     * @return The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * 
     */
    public Optional<Output<AppImageConfigKernelGatewayImageConfigArgs>> kernelGatewayImageConfig() {
        return Optional.ofNullable(this.kernelGatewayImageConfig);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private AppImageConfigState() {}

    private AppImageConfigState(AppImageConfigState $) {
        this.appImageConfigName = $.appImageConfigName;
        this.arn = $.arn;
        this.kernelGatewayImageConfig = $.kernelGatewayImageConfig;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppImageConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppImageConfigState $;

        public Builder() {
            $ = new AppImageConfigState();
        }

        public Builder(AppImageConfigState defaults) {
            $ = new AppImageConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appImageConfigName The name of the App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(@Nullable Output<String> appImageConfigName) {
            $.appImageConfigName = appImageConfigName;
            return this;
        }

        /**
         * @param appImageConfigName The name of the App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(String appImageConfigName) {
            return appImageConfigName(Output.of(appImageConfigName));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayImageConfig(@Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig) {
            $.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }

        /**
         * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayImageConfig(AppImageConfigKernelGatewayImageConfigArgs kernelGatewayImageConfig) {
            return kernelGatewayImageConfig(Output.of(kernelGatewayImageConfig));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public AppImageConfigState build() {
            return $;
        }
    }

}