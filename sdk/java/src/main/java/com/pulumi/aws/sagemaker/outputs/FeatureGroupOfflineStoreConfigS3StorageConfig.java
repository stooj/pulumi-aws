// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureGroupOfflineStoreConfigS3StorageConfig {
    /**
     * @return The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    private @Nullable String kmsKeyId;
    /**
     * @return The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    private String s3Uri;

    private FeatureGroupOfflineStoreConfigS3StorageConfig() {}
    /**
     * @return The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    public String s3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigS3StorageConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kmsKeyId;
        private String s3Uri;
        public Builder() {}
        public Builder(FeatureGroupOfflineStoreConfigS3StorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3Uri = defaults.s3Uri;
        }

        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }
        public FeatureGroupOfflineStoreConfigS3StorageConfig build() {
            final var o = new FeatureGroupOfflineStoreConfigS3StorageConfig();
            o.kmsKeyId = kmsKeyId;
            o.s3Uri = s3Uri;
            return o;
        }
    }
}