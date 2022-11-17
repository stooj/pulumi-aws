// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrokerInstance {
    private @Nullable String consoleUrl;
    private @Nullable List<String> endpoints;
    private @Nullable String ipAddress;

    private BrokerInstance() {}
    public Optional<String> consoleUrl() {
        return Optional.ofNullable(this.consoleUrl);
    }
    public List<String> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String consoleUrl;
        private @Nullable List<String> endpoints;
        private @Nullable String ipAddress;
        public Builder() {}
        public Builder(BrokerInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAddress = defaults.ipAddress;
        }

        @CustomType.Setter
        public Builder consoleUrl(@Nullable String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(@Nullable List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public BrokerInstance build() {
            final var o = new BrokerInstance();
            o.consoleUrl = consoleUrl;
            o.endpoints = endpoints;
            o.ipAddress = ipAddress;
            return o;
        }
    }
}