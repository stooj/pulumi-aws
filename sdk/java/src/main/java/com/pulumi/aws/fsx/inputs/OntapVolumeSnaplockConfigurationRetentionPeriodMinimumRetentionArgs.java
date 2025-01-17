// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs Empty = new OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs();

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="value")
    private @Nullable Output<Integer> value;

    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    private OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs() {}

    private OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs(OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs $;

        public Builder() {
            $ = new OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs();
        }

        public Builder(OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs defaults) {
            $ = new OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public OntapVolumeSnaplockConfigurationRetentionPeriodMinimumRetentionArgs build() {
            return $;
        }
    }

}
