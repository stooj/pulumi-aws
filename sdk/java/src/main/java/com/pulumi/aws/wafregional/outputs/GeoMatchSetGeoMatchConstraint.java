// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GeoMatchSetGeoMatchConstraint {
    private String type;
    private String value;

    private GeoMatchSetGeoMatchConstraint() {}
    public String type() {
        return this.type;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetGeoMatchConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private String value;
        public Builder() {}
        public Builder(GeoMatchSetGeoMatchConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GeoMatchSetGeoMatchConstraint", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GeoMatchSetGeoMatchConstraint", "value");
            }
            this.value = value;
            return this;
        }
        public GeoMatchSetGeoMatchConstraint build() {
            final var _resultValue = new GeoMatchSetGeoMatchConstraint();
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
