// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentDataSourceDataSourceConfigurationS3ConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentDataSourceDataSourceConfigurationS3ConfigurationArgs Empty = new AgentDataSourceDataSourceConfigurationS3ConfigurationArgs();

    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    @Import(name="bucketOwnerAccountId")
    private @Nullable Output<String> bucketOwnerAccountId;

    public Optional<Output<String>> bucketOwnerAccountId() {
        return Optional.ofNullable(this.bucketOwnerAccountId);
    }

    @Import(name="inclusionPrefixes")
    private @Nullable Output<List<String>> inclusionPrefixes;

    public Optional<Output<List<String>>> inclusionPrefixes() {
        return Optional.ofNullable(this.inclusionPrefixes);
    }

    private AgentDataSourceDataSourceConfigurationS3ConfigurationArgs() {}

    private AgentDataSourceDataSourceConfigurationS3ConfigurationArgs(AgentDataSourceDataSourceConfigurationS3ConfigurationArgs $) {
        this.bucketArn = $.bucketArn;
        this.bucketOwnerAccountId = $.bucketOwnerAccountId;
        this.inclusionPrefixes = $.inclusionPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentDataSourceDataSourceConfigurationS3ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentDataSourceDataSourceConfigurationS3ConfigurationArgs $;

        public Builder() {
            $ = new AgentDataSourceDataSourceConfigurationS3ConfigurationArgs();
        }

        public Builder(AgentDataSourceDataSourceConfigurationS3ConfigurationArgs defaults) {
            $ = new AgentDataSourceDataSourceConfigurationS3ConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        public Builder bucketOwnerAccountId(@Nullable Output<String> bucketOwnerAccountId) {
            $.bucketOwnerAccountId = bucketOwnerAccountId;
            return this;
        }

        public Builder bucketOwnerAccountId(String bucketOwnerAccountId) {
            return bucketOwnerAccountId(Output.of(bucketOwnerAccountId));
        }

        public Builder inclusionPrefixes(@Nullable Output<List<String>> inclusionPrefixes) {
            $.inclusionPrefixes = inclusionPrefixes;
            return this;
        }

        public Builder inclusionPrefixes(List<String> inclusionPrefixes) {
            return inclusionPrefixes(Output.of(inclusionPrefixes));
        }

        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }

        public AgentDataSourceDataSourceConfigurationS3ConfigurationArgs build() {
            if ($.bucketArn == null) {
                throw new MissingRequiredPropertyException("AgentDataSourceDataSourceConfigurationS3ConfigurationArgs", "bucketArn");
            }
            return $;
        }
    }

}
