// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTls;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicy {
    /**
     * @return Transport Layer Security (TLS) client policy.
     * 
     */
    private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls;

    private VirtualGatewaySpecBackendDefaultsClientPolicy() {}
    /**
     * @return Transport Layer Security (TLS) client policy.
     * 
     */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTls> tls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls;
        public Builder() {}
        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder tls(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls) {
            this.tls = tls;
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicy build() {
            final var o = new VirtualGatewaySpecBackendDefaultsClientPolicy();
            o.tls = tls;
            return o;
        }
    }
}