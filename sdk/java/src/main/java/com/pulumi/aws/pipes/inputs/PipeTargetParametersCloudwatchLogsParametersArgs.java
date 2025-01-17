// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeTargetParametersCloudwatchLogsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeTargetParametersCloudwatchLogsParametersArgs Empty = new PipeTargetParametersCloudwatchLogsParametersArgs();

    @Import(name="logStreamName")
    private @Nullable Output<String> logStreamName;

    public Optional<Output<String>> logStreamName() {
        return Optional.ofNullable(this.logStreamName);
    }

    @Import(name="timestamp")
    private @Nullable Output<String> timestamp;

    public Optional<Output<String>> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    private PipeTargetParametersCloudwatchLogsParametersArgs() {}

    private PipeTargetParametersCloudwatchLogsParametersArgs(PipeTargetParametersCloudwatchLogsParametersArgs $) {
        this.logStreamName = $.logStreamName;
        this.timestamp = $.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeTargetParametersCloudwatchLogsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeTargetParametersCloudwatchLogsParametersArgs $;

        public Builder() {
            $ = new PipeTargetParametersCloudwatchLogsParametersArgs();
        }

        public Builder(PipeTargetParametersCloudwatchLogsParametersArgs defaults) {
            $ = new PipeTargetParametersCloudwatchLogsParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder logStreamName(@Nullable Output<String> logStreamName) {
            $.logStreamName = logStreamName;
            return this;
        }

        public Builder logStreamName(String logStreamName) {
            return logStreamName(Output.of(logStreamName));
        }

        public Builder timestamp(@Nullable Output<String> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        public Builder timestamp(String timestamp) {
            return timestamp(Output.of(timestamp));
        }

        public PipeTargetParametersCloudwatchLogsParametersArgs build() {
            return $;
        }
    }

}
