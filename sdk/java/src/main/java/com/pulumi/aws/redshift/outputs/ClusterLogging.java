// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLogging {
    /**
     * @return The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
     */
    private @Nullable String bucketName;
    /**
     * @return Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
     */
    private Boolean enable;
    /**
     * @return The log destination type. An enum with possible values of `s3` and `cloudwatch`.
     * 
     */
    private @Nullable String logDestinationType;
    /**
     * @return The collection of exported log types. Log types include the connection log, user log and user activity log. Required when `log_destination_type` is `cloudwatch`. Valid log types are `connectionlog`, `userlog`, and `useractivitylog`.
     * 
     */
    private @Nullable List<String> logExports;
    /**
     * @return The prefix applied to the log file names.
     * 
     */
    private @Nullable String s3KeyPrefix;

    private ClusterLogging() {}
    /**
     * @return The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
     */
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * @return Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The log destination type. An enum with possible values of `s3` and `cloudwatch`.
     * 
     */
    public Optional<String> logDestinationType() {
        return Optional.ofNullable(this.logDestinationType);
    }
    /**
     * @return The collection of exported log types. Log types include the connection log, user log and user activity log. Required when `log_destination_type` is `cloudwatch`. Valid log types are `connectionlog`, `userlog`, and `useractivitylog`.
     * 
     */
    public List<String> logExports() {
        return this.logExports == null ? List.of() : this.logExports;
    }
    /**
     * @return The prefix applied to the log file names.
     * 
     */
    public Optional<String> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLogging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketName;
        private Boolean enable;
        private @Nullable String logDestinationType;
        private @Nullable List<String> logExports;
        private @Nullable String s3KeyPrefix;
        public Builder() {}
        public Builder(ClusterLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.enable = defaults.enable;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logExports = defaults.logExports;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        @CustomType.Setter
        public Builder logDestinationType(@Nullable String logDestinationType) {
            this.logDestinationType = logDestinationType;
            return this;
        }
        @CustomType.Setter
        public Builder logExports(@Nullable List<String> logExports) {
            this.logExports = logExports;
            return this;
        }
        public Builder logExports(String... logExports) {
            return logExports(List.of(logExports));
        }
        @CustomType.Setter
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public ClusterLogging build() {
            final var o = new ClusterLogging();
            o.bucketName = bucketName;
            o.enable = enable;
            o.logDestinationType = logDestinationType;
            o.logExports = logExports;
            o.s3KeyPrefix = s3KeyPrefix;
            return o;
        }
    }
}