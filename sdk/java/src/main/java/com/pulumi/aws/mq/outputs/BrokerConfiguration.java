// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrokerConfiguration {
    /**
     * @return The Configuration ID.
     * 
     */
    private @Nullable String id;
    /**
     * @return Revision of the Configuration.
     * 
     */
    private @Nullable Integer revision;

    private BrokerConfiguration() {}
    /**
     * @return The Configuration ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Revision of the Configuration.
     * 
     */
    public Optional<Integer> revision() {
        return Optional.ofNullable(this.revision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable Integer revision;
        public Builder() {}
        public Builder(BrokerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.revision = defaults.revision;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder revision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }
        public BrokerConfiguration build() {
            final var o = new BrokerConfiguration();
            o.id = id;
            o.revision = revision;
            return o;
        }
    }
}