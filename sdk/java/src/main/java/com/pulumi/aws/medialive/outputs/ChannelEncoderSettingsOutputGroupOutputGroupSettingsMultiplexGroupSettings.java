// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettings {
    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettings() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettings defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettings();
            return o;
        }
    }
}