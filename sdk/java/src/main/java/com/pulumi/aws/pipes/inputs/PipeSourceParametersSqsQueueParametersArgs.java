// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeSourceParametersSqsQueueParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeSourceParametersSqsQueueParametersArgs Empty = new PipeSourceParametersSqsQueueParametersArgs();

    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    @Import(name="maximumBatchingWindowInSeconds")
    private @Nullable Output<Integer> maximumBatchingWindowInSeconds;

    public Optional<Output<Integer>> maximumBatchingWindowInSeconds() {
        return Optional.ofNullable(this.maximumBatchingWindowInSeconds);
    }

    private PipeSourceParametersSqsQueueParametersArgs() {}

    private PipeSourceParametersSqsQueueParametersArgs(PipeSourceParametersSqsQueueParametersArgs $) {
        this.batchSize = $.batchSize;
        this.maximumBatchingWindowInSeconds = $.maximumBatchingWindowInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeSourceParametersSqsQueueParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeSourceParametersSqsQueueParametersArgs $;

        public Builder() {
            $ = new PipeSourceParametersSqsQueueParametersArgs();
        }

        public Builder(PipeSourceParametersSqsQueueParametersArgs defaults) {
            $ = new PipeSourceParametersSqsQueueParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        public Builder maximumBatchingWindowInSeconds(@Nullable Output<Integer> maximumBatchingWindowInSeconds) {
            $.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            return this;
        }

        public Builder maximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
            return maximumBatchingWindowInSeconds(Output.of(maximumBatchingWindowInSeconds));
        }

        public PipeSourceParametersSqsQueueParametersArgs build() {
            return $;
        }
    }

}
