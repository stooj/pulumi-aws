// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StageAccessLogSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageAccessLogSettingsArgs Empty = new StageAccessLogSettingsArgs();

    /**
     * ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
     * 
     */
    @Import(name="destinationArn", required=true)
    private Output<String> destinationArn;

    /**
     * @return ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }

    /**
     * Single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return Single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    private StageAccessLogSettingsArgs() {}

    private StageAccessLogSettingsArgs(StageAccessLogSettingsArgs $) {
        this.destinationArn = $.destinationArn;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageAccessLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageAccessLogSettingsArgs $;

        public Builder() {
            $ = new StageAccessLogSettingsArgs();
        }

        public Builder(StageAccessLogSettingsArgs defaults) {
            $ = new StageAccessLogSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationArn ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(Output<String> destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        /**
         * @param destinationArn ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(String destinationArn) {
            return destinationArn(Output.of(destinationArn));
        }

        /**
         * @param format Single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        public StageAccessLogSettingsArgs build() {
            $.destinationArn = Objects.requireNonNull($.destinationArn, "expected parameter 'destinationArn' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}