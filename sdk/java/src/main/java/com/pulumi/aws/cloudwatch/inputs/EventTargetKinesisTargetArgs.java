// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetKinesisTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetKinesisTargetArgs Empty = new EventTargetKinesisTargetArgs();

    /**
     * The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    @Import(name="partitionKeyPath")
    private @Nullable Output<String> partitionKeyPath;

    /**
     * @return The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    public Optional<Output<String>> partitionKeyPath() {
        return Optional.ofNullable(this.partitionKeyPath);
    }

    private EventTargetKinesisTargetArgs() {}

    private EventTargetKinesisTargetArgs(EventTargetKinesisTargetArgs $) {
        this.partitionKeyPath = $.partitionKeyPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetKinesisTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetKinesisTargetArgs $;

        public Builder() {
            $ = new EventTargetKinesisTargetArgs();
        }

        public Builder(EventTargetKinesisTargetArgs defaults) {
            $ = new EventTargetKinesisTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionKeyPath The JSON path to be extracted from the event and used as the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyPath(@Nullable Output<String> partitionKeyPath) {
            $.partitionKeyPath = partitionKeyPath;
            return this;
        }

        /**
         * @param partitionKeyPath The JSON path to be extracted from the event and used as the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyPath(String partitionKeyPath) {
            return partitionKeyPath(Output.of(partitionKeyPath));
        }

        public EventTargetKinesisTargetArgs build() {
            return $;
        }
    }

}