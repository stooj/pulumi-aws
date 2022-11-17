// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettingsCaptionSelector {
    private @Nullable String deblockFilter;
    private @Nullable String denoiseFilter;
    private @Nullable Integer filterStrength;
    private @Nullable String inputFilter;
    private @Nullable String languageCode;
    /**
     * @return Custom output group name defined by the user.
     * 
     */
    private String name;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings networkInputSettings;
    private @Nullable Integer scte35Pid;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings selectorSettings;
    private @Nullable String smpte2038DataPreference;
    private @Nullable String sourceEndBehavior;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector videoSelector;

    private ChannelInputAttachmentInputSettingsCaptionSelector() {}
    public Optional<String> deblockFilter() {
        return Optional.ofNullable(this.deblockFilter);
    }
    public Optional<String> denoiseFilter() {
        return Optional.ofNullable(this.denoiseFilter);
    }
    public Optional<Integer> filterStrength() {
        return Optional.ofNullable(this.filterStrength);
    }
    public Optional<String> inputFilter() {
        return Optional.ofNullable(this.inputFilter);
    }
    public Optional<String> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }
    /**
     * @return Custom output group name defined by the user.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings> networkInputSettings() {
        return Optional.ofNullable(this.networkInputSettings);
    }
    public Optional<Integer> scte35Pid() {
        return Optional.ofNullable(this.scte35Pid);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings> selectorSettings() {
        return Optional.ofNullable(this.selectorSettings);
    }
    public Optional<String> smpte2038DataPreference() {
        return Optional.ofNullable(this.smpte2038DataPreference);
    }
    public Optional<String> sourceEndBehavior() {
        return Optional.ofNullable(this.sourceEndBehavior);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector> videoSelector() {
        return Optional.ofNullable(this.videoSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deblockFilter;
        private @Nullable String denoiseFilter;
        private @Nullable Integer filterStrength;
        private @Nullable String inputFilter;
        private @Nullable String languageCode;
        private String name;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings networkInputSettings;
        private @Nullable Integer scte35Pid;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings selectorSettings;
        private @Nullable String smpte2038DataPreference;
        private @Nullable String sourceEndBehavior;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector videoSelector;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettingsCaptionSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deblockFilter = defaults.deblockFilter;
    	      this.denoiseFilter = defaults.denoiseFilter;
    	      this.filterStrength = defaults.filterStrength;
    	      this.inputFilter = defaults.inputFilter;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
    	      this.networkInputSettings = defaults.networkInputSettings;
    	      this.scte35Pid = defaults.scte35Pid;
    	      this.selectorSettings = defaults.selectorSettings;
    	      this.smpte2038DataPreference = defaults.smpte2038DataPreference;
    	      this.sourceEndBehavior = defaults.sourceEndBehavior;
    	      this.videoSelector = defaults.videoSelector;
        }

        @CustomType.Setter
        public Builder deblockFilter(@Nullable String deblockFilter) {
            this.deblockFilter = deblockFilter;
            return this;
        }
        @CustomType.Setter
        public Builder denoiseFilter(@Nullable String denoiseFilter) {
            this.denoiseFilter = denoiseFilter;
            return this;
        }
        @CustomType.Setter
        public Builder filterStrength(@Nullable Integer filterStrength) {
            this.filterStrength = filterStrength;
            return this;
        }
        @CustomType.Setter
        public Builder inputFilter(@Nullable String inputFilter) {
            this.inputFilter = inputFilter;
            return this;
        }
        @CustomType.Setter
        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkInputSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorNetworkInputSettings networkInputSettings) {
            this.networkInputSettings = networkInputSettings;
            return this;
        }
        @CustomType.Setter
        public Builder scte35Pid(@Nullable Integer scte35Pid) {
            this.scte35Pid = scte35Pid;
            return this;
        }
        @CustomType.Setter
        public Builder selectorSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings selectorSettings) {
            this.selectorSettings = selectorSettings;
            return this;
        }
        @CustomType.Setter
        public Builder smpte2038DataPreference(@Nullable String smpte2038DataPreference) {
            this.smpte2038DataPreference = smpte2038DataPreference;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndBehavior(@Nullable String sourceEndBehavior) {
            this.sourceEndBehavior = sourceEndBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder videoSelector(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorVideoSelector videoSelector) {
            this.videoSelector = videoSelector;
            return this;
        }
        public ChannelInputAttachmentInputSettingsCaptionSelector build() {
            final var o = new ChannelInputAttachmentInputSettingsCaptionSelector();
            o.deblockFilter = deblockFilter;
            o.denoiseFilter = denoiseFilter;
            o.filterStrength = filterStrength;
            o.inputFilter = inputFilter;
            o.languageCode = languageCode;
            o.name = name;
            o.networkInputSettings = networkInputSettings;
            o.scte35Pid = scte35Pid;
            o.selectorSettings = selectorSettings;
            o.smpte2038DataPreference = smpte2038DataPreference;
            o.sourceEndBehavior = sourceEndBehavior;
            o.videoSelector = videoSelector;
            return o;
        }
    }
}