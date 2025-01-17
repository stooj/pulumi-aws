// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecatalyst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class DevEnvironmentPersistentStorage {
    private Integer size;

    private DevEnvironmentPersistentStorage() {}
    public Integer size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevEnvironmentPersistentStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer size;
        public Builder() {}
        public Builder(DevEnvironmentPersistentStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("DevEnvironmentPersistentStorage", "size");
            }
            this.size = size;
            return this;
        }
        public DevEnvironmentPersistentStorage build() {
            final var _resultValue = new DevEnvironmentPersistentStorage();
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
