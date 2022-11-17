// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoveryreadiness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs Empty = new ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs();

    /**
     * NLB resource ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return NLB resource ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    private ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs() {}

    private ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs(ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs $;

        public Builder() {
            $ = new ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs();
        }

        public Builder(ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs defaults) {
            $ = new ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn NLB resource ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn NLB resource ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs build() {
            return $;
        }
    }

}