// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleDynamodb {
    /**
     * @return The hash key name.
     * 
     */
    private String hashKeyField;
    /**
     * @return The hash key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    private @Nullable String hashKeyType;
    /**
     * @return The hash key value.
     * 
     */
    private String hashKeyValue;
    /**
     * @return The operation. Valid values are &#34;INSERT&#34;, &#34;UPDATE&#34;, or &#34;DELETE&#34;.
     * 
     */
    private @Nullable String operation;
    /**
     * @return The action payload.
     * 
     */
    private @Nullable String payloadField;
    /**
     * @return The range key name.
     * 
     */
    private @Nullable String rangeKeyField;
    /**
     * @return The range key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    private @Nullable String rangeKeyType;
    /**
     * @return The range key value.
     * 
     */
    private @Nullable String rangeKeyValue;
    /**
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    private String roleArn;
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    private String tableName;

    private TopicRuleDynamodb() {}
    /**
     * @return The hash key name.
     * 
     */
    public String hashKeyField() {
        return this.hashKeyField;
    }
    /**
     * @return The hash key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    public Optional<String> hashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }
    /**
     * @return The hash key value.
     * 
     */
    public String hashKeyValue() {
        return this.hashKeyValue;
    }
    /**
     * @return The operation. Valid values are &#34;INSERT&#34;, &#34;UPDATE&#34;, or &#34;DELETE&#34;.
     * 
     */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * @return The action payload.
     * 
     */
    public Optional<String> payloadField() {
        return Optional.ofNullable(this.payloadField);
    }
    /**
     * @return The range key name.
     * 
     */
    public Optional<String> rangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }
    /**
     * @return The range key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    public Optional<String> rangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }
    /**
     * @return The range key value.
     * 
     */
    public Optional<String> rangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }
    /**
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String operation;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String roleArn;
        private String tableName;
        public Builder() {}
        public Builder(TopicRuleDynamodb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }
        @CustomType.Setter
        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }
        @CustomType.Setter
        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }
        @CustomType.Setter
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }
        @CustomType.Setter
        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }
        @CustomType.Setter
        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }
        @CustomType.Setter
        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public TopicRuleDynamodb build() {
            final var o = new TopicRuleDynamodb();
            o.hashKeyField = hashKeyField;
            o.hashKeyType = hashKeyType;
            o.hashKeyValue = hashKeyValue;
            o.operation = operation;
            o.payloadField = payloadField;
            o.rangeKeyField = rangeKeyField;
            o.rangeKeyType = rangeKeyType;
            o.rangeKeyValue = rangeKeyValue;
            o.roleArn = roleArn;
            o.tableName = tableName;
            return o;
        }
    }
}