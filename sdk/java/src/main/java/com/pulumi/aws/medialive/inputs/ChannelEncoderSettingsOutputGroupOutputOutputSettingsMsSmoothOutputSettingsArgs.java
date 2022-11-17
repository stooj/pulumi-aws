// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs Empty = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs();

    @Import(name="h265PackagingType")
    private @Nullable Output<String> h265PackagingType;

    public Optional<Output<String>> h265PackagingType() {
        return Optional.ofNullable(this.h265PackagingType);
    }

    /**
     * String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
     * 
     */
    @Import(name="nameModifier")
    private @Nullable Output<String> nameModifier;

    /**
     * @return String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
     * 
     */
    public Optional<Output<String>> nameModifier() {
        return Optional.ofNullable(this.nameModifier);
    }

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs() {}

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs(ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs $) {
        this.h265PackagingType = $.h265PackagingType;
        this.nameModifier = $.nameModifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder h265PackagingType(@Nullable Output<String> h265PackagingType) {
            $.h265PackagingType = h265PackagingType;
            return this;
        }

        public Builder h265PackagingType(String h265PackagingType) {
            return h265PackagingType(Output.of(h265PackagingType));
        }

        /**
         * @param nameModifier String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
         * 
         * @return builder
         * 
         */
        public Builder nameModifier(@Nullable Output<String> nameModifier) {
            $.nameModifier = nameModifier;
            return this;
        }

        /**
         * @param nameModifier String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
         * 
         * @return builder
         * 
         */
        public Builder nameModifier(String nameModifier) {
            return nameModifier(Output.of(nameModifier));
        }

        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs build() {
            return $;
        }
    }

}