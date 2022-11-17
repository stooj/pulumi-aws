// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscribedRuleGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscribedRuleGroupArgs Empty = new GetSubscribedRuleGroupArgs();

    /**
     * Name of the WAF rule group.
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    /**
     * @return Name of the WAF rule group.
     * 
     */
    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * Name of the WAF rule group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the WAF rule group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSubscribedRuleGroupArgs() {}

    private GetSubscribedRuleGroupArgs(GetSubscribedRuleGroupArgs $) {
        this.metricName = $.metricName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscribedRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscribedRuleGroupArgs $;

        public Builder() {
            $ = new GetSubscribedRuleGroupArgs();
        }

        public Builder(GetSubscribedRuleGroupArgs defaults) {
            $ = new GetSubscribedRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricName Name of the WAF rule group.
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName Name of the WAF rule group.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param name Name of the WAF rule group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the WAF rule group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetSubscribedRuleGroupArgs build() {
            return $;
        }
    }

}