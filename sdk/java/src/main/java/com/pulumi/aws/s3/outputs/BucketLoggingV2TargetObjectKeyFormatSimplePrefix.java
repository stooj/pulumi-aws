// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BucketLoggingV2TargetObjectKeyFormatSimplePrefix {
    private BucketLoggingV2TargetObjectKeyFormatSimplePrefix() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingV2TargetObjectKeyFormatSimplePrefix defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(BucketLoggingV2TargetObjectKeyFormatSimplePrefix defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public BucketLoggingV2TargetObjectKeyFormatSimplePrefix build() {
            final var _resultValue = new BucketLoggingV2TargetObjectKeyFormatSimplePrefix();
            return _resultValue;
        }
    }
}
