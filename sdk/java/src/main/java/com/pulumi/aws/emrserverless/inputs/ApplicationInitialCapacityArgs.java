// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrserverless.inputs;

import com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationInitialCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationInitialCapacityArgs Empty = new ApplicationInitialCapacityArgs();

    /**
     * The initial capacity configuration per worker.
     * 
     */
    @Import(name="initialCapacityConfig")
    private @Nullable Output<ApplicationInitialCapacityInitialCapacityConfigArgs> initialCapacityConfig;

    /**
     * @return The initial capacity configuration per worker.
     * 
     */
    public Optional<Output<ApplicationInitialCapacityInitialCapacityConfigArgs>> initialCapacityConfig() {
        return Optional.ofNullable(this.initialCapacityConfig);
    }

    /**
     * The worker type for an analytics framework. For Spark applications, the key can either be set to `Driver` or `Executor`. For Hive applications, it can be set to `HiveDriver` or `TezTask`.
     * 
     */
    @Import(name="initialCapacityType", required=true)
    private Output<String> initialCapacityType;

    /**
     * @return The worker type for an analytics framework. For Spark applications, the key can either be set to `Driver` or `Executor`. For Hive applications, it can be set to `HiveDriver` or `TezTask`.
     * 
     */
    public Output<String> initialCapacityType() {
        return this.initialCapacityType;
    }

    private ApplicationInitialCapacityArgs() {}

    private ApplicationInitialCapacityArgs(ApplicationInitialCapacityArgs $) {
        this.initialCapacityConfig = $.initialCapacityConfig;
        this.initialCapacityType = $.initialCapacityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationInitialCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationInitialCapacityArgs $;

        public Builder() {
            $ = new ApplicationInitialCapacityArgs();
        }

        public Builder(ApplicationInitialCapacityArgs defaults) {
            $ = new ApplicationInitialCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param initialCapacityConfig The initial capacity configuration per worker.
         * 
         * @return builder
         * 
         */
        public Builder initialCapacityConfig(@Nullable Output<ApplicationInitialCapacityInitialCapacityConfigArgs> initialCapacityConfig) {
            $.initialCapacityConfig = initialCapacityConfig;
            return this;
        }

        /**
         * @param initialCapacityConfig The initial capacity configuration per worker.
         * 
         * @return builder
         * 
         */
        public Builder initialCapacityConfig(ApplicationInitialCapacityInitialCapacityConfigArgs initialCapacityConfig) {
            return initialCapacityConfig(Output.of(initialCapacityConfig));
        }

        /**
         * @param initialCapacityType The worker type for an analytics framework. For Spark applications, the key can either be set to `Driver` or `Executor`. For Hive applications, it can be set to `HiveDriver` or `TezTask`.
         * 
         * @return builder
         * 
         */
        public Builder initialCapacityType(Output<String> initialCapacityType) {
            $.initialCapacityType = initialCapacityType;
            return this;
        }

        /**
         * @param initialCapacityType The worker type for an analytics framework. For Spark applications, the key can either be set to `Driver` or `Executor`. For Hive applications, it can be set to `HiveDriver` or `TezTask`.
         * 
         * @return builder
         * 
         */
        public Builder initialCapacityType(String initialCapacityType) {
            return initialCapacityType(Output.of(initialCapacityType));
        }

        public ApplicationInitialCapacityArgs build() {
            $.initialCapacityType = Objects.requireNonNull($.initialCapacityType, "expected parameter 'initialCapacityType' to be non-null");
            return $;
        }
    }

}