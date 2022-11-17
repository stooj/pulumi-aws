// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs Empty = new ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs();

    /**
     * Used to insert watermarks of type Nielsen CBET. See Nielsen CBET Settings for more details.
     * 
     */
    @Import(name="nielsenCbetSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs> nielsenCbetSettings;

    /**
     * @return Used to insert watermarks of type Nielsen CBET. See Nielsen CBET Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs>> nielsenCbetSettings() {
        return Optional.ofNullable(this.nielsenCbetSettings);
    }

    /**
     * Distribution types to assign to the watermarks. Options are `PROGRAM_CONTENT` and `FINAL_DISTRIBUTOR`.
     * 
     */
    @Import(name="nielsenDistributionType")
    private @Nullable Output<String> nielsenDistributionType;

    /**
     * @return Distribution types to assign to the watermarks. Options are `PROGRAM_CONTENT` and `FINAL_DISTRIBUTOR`.
     * 
     */
    public Optional<Output<String>> nielsenDistributionType() {
        return Optional.ofNullable(this.nielsenDistributionType);
    }

    /**
     * Used to insert watermarks of type Nielsen NAES, II (N2) and Nielsen NAES VI (NW). See Nielsen NAES II NW Settings for more details.
     * 
     */
    @Import(name="nielsenNaesIiNwSettings")
    private @Nullable Output<List<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs>> nielsenNaesIiNwSettings;

    /**
     * @return Used to insert watermarks of type Nielsen NAES, II (N2) and Nielsen NAES VI (NW). See Nielsen NAES II NW Settings for more details.
     * 
     */
    public Optional<Output<List<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs>>> nielsenNaesIiNwSettings() {
        return Optional.ofNullable(this.nielsenNaesIiNwSettings);
    }

    private ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs() {}

    private ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs $) {
        this.nielsenCbetSettings = $.nielsenCbetSettings;
        this.nielsenDistributionType = $.nielsenDistributionType;
        this.nielsenNaesIiNwSettings = $.nielsenNaesIiNwSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nielsenCbetSettings Used to insert watermarks of type Nielsen CBET. See Nielsen CBET Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder nielsenCbetSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs> nielsenCbetSettings) {
            $.nielsenCbetSettings = nielsenCbetSettings;
            return this;
        }

        /**
         * @param nielsenCbetSettings Used to insert watermarks of type Nielsen CBET. See Nielsen CBET Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder nielsenCbetSettings(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs nielsenCbetSettings) {
            return nielsenCbetSettings(Output.of(nielsenCbetSettings));
        }

        /**
         * @param nielsenDistributionType Distribution types to assign to the watermarks. Options are `PROGRAM_CONTENT` and `FINAL_DISTRIBUTOR`.
         * 
         * @return builder
         * 
         */
        public Builder nielsenDistributionType(@Nullable Output<String> nielsenDistributionType) {
            $.nielsenDistributionType = nielsenDistributionType;
            return this;
        }

        /**
         * @param nielsenDistributionType Distribution types to assign to the watermarks. Options are `PROGRAM_CONTENT` and `FINAL_DISTRIBUTOR`.
         * 
         * @return builder
         * 
         */
        public Builder nielsenDistributionType(String nielsenDistributionType) {
            return nielsenDistributionType(Output.of(nielsenDistributionType));
        }

        /**
         * @param nielsenNaesIiNwSettings Used to insert watermarks of type Nielsen NAES, II (N2) and Nielsen NAES VI (NW). See Nielsen NAES II NW Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder nielsenNaesIiNwSettings(@Nullable Output<List<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs>> nielsenNaesIiNwSettings) {
            $.nielsenNaesIiNwSettings = nielsenNaesIiNwSettings;
            return this;
        }

        /**
         * @param nielsenNaesIiNwSettings Used to insert watermarks of type Nielsen NAES, II (N2) and Nielsen NAES VI (NW). See Nielsen NAES II NW Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder nielsenNaesIiNwSettings(List<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs> nielsenNaesIiNwSettings) {
            return nielsenNaesIiNwSettings(Output.of(nielsenNaesIiNwSettings));
        }

        /**
         * @param nielsenNaesIiNwSettings Used to insert watermarks of type Nielsen NAES, II (N2) and Nielsen NAES VI (NW). See Nielsen NAES II NW Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder nielsenNaesIiNwSettings(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs... nielsenNaesIiNwSettings) {
            return nielsenNaesIiNwSettings(List.of(nielsenNaesIiNwSettings));
        }

        public ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs build() {
            return $;
        }
    }

}