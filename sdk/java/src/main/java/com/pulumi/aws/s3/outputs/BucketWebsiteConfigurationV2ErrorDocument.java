// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketWebsiteConfigurationV2ErrorDocument {
    /**
     * @return Object key name to use when a 4XX class error occurs.
     * 
     */
    private String key;

    private BucketWebsiteConfigurationV2ErrorDocument() {}
    /**
     * @return Object key name to use when a 4XX class error occurs.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteConfigurationV2ErrorDocument defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        public Builder() {}
        public Builder(BucketWebsiteConfigurationV2ErrorDocument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("BucketWebsiteConfigurationV2ErrorDocument", "key");
            }
            this.key = key;
            return this;
        }
        public BucketWebsiteConfigurationV2ErrorDocument build() {
            final var _resultValue = new BucketWebsiteConfigurationV2ErrorDocument();
            _resultValue.key = key;
            return _resultValue;
        }
    }
}
