// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionDefaultCacheBehaviorLambdaFunctionAssociation {
    /**
     * @return The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    private String eventType;
    /**
     * @return When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
     * 
     */
    private @Nullable Boolean includeBody;
    /**
     * @return ARN of the Lambda function.
     * 
     */
    private String lambdaArn;

    private DistributionDefaultCacheBehaviorLambdaFunctionAssociation() {}
    /**
     * @return The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> includeBody() {
        return Optional.ofNullable(this.includeBody);
    }
    /**
     * @return ARN of the Lambda function.
     * 
     */
    public String lambdaArn() {
        return this.lambdaArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehaviorLambdaFunctionAssociation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventType;
        private @Nullable Boolean includeBody;
        private String lambdaArn;
        public Builder() {}
        public Builder(DistributionDefaultCacheBehaviorLambdaFunctionAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.includeBody = defaults.includeBody;
    	      this.lambdaArn = defaults.lambdaArn;
        }

        @CustomType.Setter
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        @CustomType.Setter
        public Builder includeBody(@Nullable Boolean includeBody) {
            this.includeBody = includeBody;
            return this;
        }
        @CustomType.Setter
        public Builder lambdaArn(String lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }
        public DistributionDefaultCacheBehaviorLambdaFunctionAssociation build() {
            final var o = new DistributionDefaultCacheBehaviorLambdaFunctionAssociation();
            o.eventType = eventType;
            o.includeBody = includeBody;
            o.lambdaArn = lambdaArn;
            return o;
        }
    }
}