// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.BotAliasConversationLogsLogSetting;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BotAliasConversationLogs {
    /**
     * @return The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket. Must be between 20 and 2048 characters in length.
     * 
     */
    private String iamRoleArn;
    /**
     * @return The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
     * 
     */
    private @Nullable List<BotAliasConversationLogsLogSetting> logSettings;

    private BotAliasConversationLogs() {}
    /**
     * @return The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket. Must be between 20 and 2048 characters in length.
     * 
     */
    public String iamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * @return The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
     * 
     */
    public List<BotAliasConversationLogsLogSetting> logSettings() {
        return this.logSettings == null ? List.of() : this.logSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasConversationLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String iamRoleArn;
        private @Nullable List<BotAliasConversationLogsLogSetting> logSettings;
        public Builder() {}
        public Builder(BotAliasConversationLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.logSettings = defaults.logSettings;
        }

        @CustomType.Setter
        public Builder iamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder logSettings(@Nullable List<BotAliasConversationLogsLogSetting> logSettings) {
            this.logSettings = logSettings;
            return this;
        }
        public Builder logSettings(BotAliasConversationLogsLogSetting... logSettings) {
            return logSettings(List.of(logSettings));
        }
        public BotAliasConversationLogs build() {
            final var o = new BotAliasConversationLogs();
            o.iamRoleArn = iamRoleArn;
            o.logSettings = logSettings;
            return o;
        }
    }
}