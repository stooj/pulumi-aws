// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecLoggingAccessLog;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecLogging {
    /**
     * @return Access log configuration for a virtual node.
     * 
     */
    private @Nullable VirtualNodeSpecLoggingAccessLog accessLog;

    private VirtualNodeSpecLogging() {}
    /**
     * @return Access log configuration for a virtual node.
     * 
     */
    public Optional<VirtualNodeSpecLoggingAccessLog> accessLog() {
        return Optional.ofNullable(this.accessLog);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLogging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualNodeSpecLoggingAccessLog accessLog;
        public Builder() {}
        public Builder(VirtualNodeSpecLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        @CustomType.Setter
        public Builder accessLog(@Nullable VirtualNodeSpecLoggingAccessLog accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public VirtualNodeSpecLogging build() {
            final var o = new VirtualNodeSpecLogging();
            o.accessLog = accessLog;
            return o;
        }
    }
}