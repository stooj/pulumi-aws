// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfigurationSetDeliveryOption {
    /**
     * @return The name of the dedicated IP pool to associate with the configuration set.
     * 
     */
    private String sendingPoolName;
    /**
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
     * 
     */
    private String tlsPolicy;

    private GetConfigurationSetDeliveryOption() {}
    /**
     * @return The name of the dedicated IP pool to associate with the configuration set.
     * 
     */
    public String sendingPoolName() {
        return this.sendingPoolName;
    }
    /**
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
     * 
     */
    public String tlsPolicy() {
        return this.tlsPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationSetDeliveryOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sendingPoolName;
        private String tlsPolicy;
        public Builder() {}
        public Builder(GetConfigurationSetDeliveryOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sendingPoolName = defaults.sendingPoolName;
    	      this.tlsPolicy = defaults.tlsPolicy;
        }

        @CustomType.Setter
        public Builder sendingPoolName(String sendingPoolName) {
            if (sendingPoolName == null) {
              throw new MissingRequiredPropertyException("GetConfigurationSetDeliveryOption", "sendingPoolName");
            }
            this.sendingPoolName = sendingPoolName;
            return this;
        }
        @CustomType.Setter
        public Builder tlsPolicy(String tlsPolicy) {
            if (tlsPolicy == null) {
              throw new MissingRequiredPropertyException("GetConfigurationSetDeliveryOption", "tlsPolicy");
            }
            this.tlsPolicy = tlsPolicy;
            return this;
        }
        public GetConfigurationSetDeliveryOption build() {
            final var _resultValue = new GetConfigurationSetDeliveryOption();
            _resultValue.sendingPoolName = sendingPoolName;
            _resultValue.tlsPolicy = tlsPolicy;
            return _resultValue;
        }
    }
}
