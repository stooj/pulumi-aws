// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomPluginLocationS3Args extends com.pulumi.resources.ResourceArgs {

    public static final CustomPluginLocationS3Args Empty = new CustomPluginLocationS3Args();

    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    @Import(name="fileKey", required=true)
    private Output<String> fileKey;

    public Output<String> fileKey() {
        return this.fileKey;
    }

    @Import(name="objectVersion")
    private @Nullable Output<String> objectVersion;

    public Optional<Output<String>> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    private CustomPluginLocationS3Args() {}

    private CustomPluginLocationS3Args(CustomPluginLocationS3Args $) {
        this.bucketArn = $.bucketArn;
        this.fileKey = $.fileKey;
        this.objectVersion = $.objectVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomPluginLocationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPluginLocationS3Args $;

        public Builder() {
            $ = new CustomPluginLocationS3Args();
        }

        public Builder(CustomPluginLocationS3Args defaults) {
            $ = new CustomPluginLocationS3Args(Objects.requireNonNull(defaults));
        }

        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        public Builder fileKey(Output<String> fileKey) {
            $.fileKey = fileKey;
            return this;
        }

        public Builder fileKey(String fileKey) {
            return fileKey(Output.of(fileKey));
        }

        public Builder objectVersion(@Nullable Output<String> objectVersion) {
            $.objectVersion = objectVersion;
            return this;
        }

        public Builder objectVersion(String objectVersion) {
            return objectVersion(Output.of(objectVersion));
        }

        public CustomPluginLocationS3Args build() {
            if ($.bucketArn == null) {
                throw new MissingRequiredPropertyException("CustomPluginLocationS3Args", "bucketArn");
            }
            if ($.fileKey == null) {
                throw new MissingRequiredPropertyException("CustomPluginLocationS3Args", "fileKey");
            }
            return $;
        }
    }

}
