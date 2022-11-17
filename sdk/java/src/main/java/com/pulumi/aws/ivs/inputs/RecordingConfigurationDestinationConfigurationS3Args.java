// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ivs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RecordingConfigurationDestinationConfigurationS3Args extends com.pulumi.resources.ResourceArgs {

    public static final RecordingConfigurationDestinationConfigurationS3Args Empty = new RecordingConfigurationDestinationConfigurationS3Args();

    /**
     * S3 bucket name where recorded videos will be stored.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return S3 bucket name where recorded videos will be stored.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    private RecordingConfigurationDestinationConfigurationS3Args() {}

    private RecordingConfigurationDestinationConfigurationS3Args(RecordingConfigurationDestinationConfigurationS3Args $) {
        this.bucketName = $.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordingConfigurationDestinationConfigurationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordingConfigurationDestinationConfigurationS3Args $;

        public Builder() {
            $ = new RecordingConfigurationDestinationConfigurationS3Args();
        }

        public Builder(RecordingConfigurationDestinationConfigurationS3Args defaults) {
            $ = new RecordingConfigurationDestinationConfigurationS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName S3 bucket name where recorded videos will be stored.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName S3 bucket name where recorded videos will be stored.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public RecordingConfigurationDestinationConfigurationS3Args build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}