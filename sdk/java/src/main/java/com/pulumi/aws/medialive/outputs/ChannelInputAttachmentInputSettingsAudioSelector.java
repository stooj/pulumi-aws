// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettingsAudioSelector {
    /**
     * @return Custom output group name defined by the user.
     * 
     */
    private String name;
    private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings selectorSettings;

    private ChannelInputAttachmentInputSettingsAudioSelector() {}
    /**
     * @return Custom output group name defined by the user.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings> selectorSettings() {
        return Optional.ofNullable(this.selectorSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettingsAudioSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings selectorSettings;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettingsAudioSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selectorSettings = defaults.selectorSettings;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder selectorSettings(@Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings selectorSettings) {
            this.selectorSettings = selectorSettings;
            return this;
        }
        public ChannelInputAttachmentInputSettingsAudioSelector build() {
            final var o = new ChannelInputAttachmentInputSettingsAudioSelector();
            o.name = name;
            o.selectorSettings = selectorSettings;
            return o;
        }
    }
}