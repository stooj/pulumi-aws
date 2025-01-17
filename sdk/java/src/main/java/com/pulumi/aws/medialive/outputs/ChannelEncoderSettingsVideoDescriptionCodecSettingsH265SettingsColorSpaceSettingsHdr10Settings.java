// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10Settings {
    private @Nullable Integer maxCll;
    private @Nullable Integer maxFall;

    private ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10Settings() {}
    public Optional<Integer> maxCll() {
        return Optional.ofNullable(this.maxCll);
    }
    public Optional<Integer> maxFall() {
        return Optional.ofNullable(this.maxFall);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10Settings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxCll;
        private @Nullable Integer maxFall;
        public Builder() {}
        public Builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10Settings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCll = defaults.maxCll;
    	      this.maxFall = defaults.maxFall;
        }

        @CustomType.Setter
        public Builder maxCll(@Nullable Integer maxCll) {

            this.maxCll = maxCll;
            return this;
        }
        @CustomType.Setter
        public Builder maxFall(@Nullable Integer maxFall) {

            this.maxFall = maxFall;
            return this;
        }
        public ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10Settings build() {
            final var _resultValue = new ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10Settings();
            _resultValue.maxCll = maxCll;
            _resultValue.maxFall = maxFall;
            return _resultValue;
        }
    }
}
