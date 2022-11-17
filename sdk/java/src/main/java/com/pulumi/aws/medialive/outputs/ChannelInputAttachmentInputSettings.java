// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsAudioSelector;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelector;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettings {
    private @Nullable List<ChannelInputAttachmentInputSettingsAudioSelector> audioSelectors;
    private @Nullable List<ChannelInputAttachmentInputSettingsCaptionSelector> captionSelectors;

    private ChannelInputAttachmentInputSettings() {}
    public List<ChannelInputAttachmentInputSettingsAudioSelector> audioSelectors() {
        return this.audioSelectors == null ? List.of() : this.audioSelectors;
    }
    public List<ChannelInputAttachmentInputSettingsCaptionSelector> captionSelectors() {
        return this.captionSelectors == null ? List.of() : this.captionSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ChannelInputAttachmentInputSettingsAudioSelector> audioSelectors;
        private @Nullable List<ChannelInputAttachmentInputSettingsCaptionSelector> captionSelectors;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioSelectors = defaults.audioSelectors;
    	      this.captionSelectors = defaults.captionSelectors;
        }

        @CustomType.Setter
        public Builder audioSelectors(@Nullable List<ChannelInputAttachmentInputSettingsAudioSelector> audioSelectors) {
            this.audioSelectors = audioSelectors;
            return this;
        }
        public Builder audioSelectors(ChannelInputAttachmentInputSettingsAudioSelector... audioSelectors) {
            return audioSelectors(List.of(audioSelectors));
        }
        @CustomType.Setter
        public Builder captionSelectors(@Nullable List<ChannelInputAttachmentInputSettingsCaptionSelector> captionSelectors) {
            this.captionSelectors = captionSelectors;
            return this;
        }
        public Builder captionSelectors(ChannelInputAttachmentInputSettingsCaptionSelector... captionSelectors) {
            return captionSelectors(List.of(captionSelectors));
        }
        public ChannelInputAttachmentInputSettings build() {
            final var o = new ChannelInputAttachmentInputSettings();
            o.audioSelectors = audioSelectors;
            o.captionSelectors = captionSelectors;
            return o;
        }
    }
}