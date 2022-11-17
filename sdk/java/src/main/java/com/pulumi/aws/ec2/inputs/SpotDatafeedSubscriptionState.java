// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotDatafeedSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final SpotDatafeedSubscriptionState Empty = new SpotDatafeedSubscriptionState();

    /**
     * The Amazon S3 bucket in which to store the Spot instance data feed.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The Amazon S3 bucket in which to store the Spot instance data feed.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Path of folder inside bucket to place spot pricing data.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Path of folder inside bucket to place spot pricing data.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private SpotDatafeedSubscriptionState() {}

    private SpotDatafeedSubscriptionState(SpotDatafeedSubscriptionState $) {
        this.bucket = $.bucket;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotDatafeedSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotDatafeedSubscriptionState $;

        public Builder() {
            $ = new SpotDatafeedSubscriptionState();
        }

        public Builder(SpotDatafeedSubscriptionState defaults) {
            $ = new SpotDatafeedSubscriptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The Amazon S3 bucket in which to store the Spot instance data feed.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The Amazon S3 bucket in which to store the Spot instance data feed.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param prefix Path of folder inside bucket to place spot pricing data.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Path of folder inside bucket to place spot pricing data.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public SpotDatafeedSubscriptionState build() {
            return $;
        }
    }

}