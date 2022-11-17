// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs;
import com.pulumi.aws.cognito.inputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class RiskConfigurationAccountTakeoverRiskConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RiskConfigurationAccountTakeoverRiskConfigurationArgs Empty = new RiskConfigurationAccountTakeoverRiskConfigurationArgs();

    /**
     * The compromised credentials risk configuration actions. See details below.
     * 
     */
    @Import(name="actions", required=true)
    private Output<RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs> actions;

    /**
     * @return The compromised credentials risk configuration actions. See details below.
     * 
     */
    public Output<RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs> actions() {
        return this.actions;
    }

    /**
     * The notify configuration used to construct email notifications. See details below.
     * 
     */
    @Import(name="notifyConfiguration", required=true)
    private Output<RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs> notifyConfiguration;

    /**
     * @return The notify configuration used to construct email notifications. See details below.
     * 
     */
    public Output<RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs> notifyConfiguration() {
        return this.notifyConfiguration;
    }

    private RiskConfigurationAccountTakeoverRiskConfigurationArgs() {}

    private RiskConfigurationAccountTakeoverRiskConfigurationArgs(RiskConfigurationAccountTakeoverRiskConfigurationArgs $) {
        this.actions = $.actions;
        this.notifyConfiguration = $.notifyConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RiskConfigurationAccountTakeoverRiskConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RiskConfigurationAccountTakeoverRiskConfigurationArgs $;

        public Builder() {
            $ = new RiskConfigurationAccountTakeoverRiskConfigurationArgs();
        }

        public Builder(RiskConfigurationAccountTakeoverRiskConfigurationArgs defaults) {
            $ = new RiskConfigurationAccountTakeoverRiskConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The compromised credentials risk configuration actions. See details below.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The compromised credentials risk configuration actions. See details below.
         * 
         * @return builder
         * 
         */
        public Builder actions(RiskConfigurationAccountTakeoverRiskConfigurationActionsArgs actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param notifyConfiguration The notify configuration used to construct email notifications. See details below.
         * 
         * @return builder
         * 
         */
        public Builder notifyConfiguration(Output<RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs> notifyConfiguration) {
            $.notifyConfiguration = notifyConfiguration;
            return this;
        }

        /**
         * @param notifyConfiguration The notify configuration used to construct email notifications. See details below.
         * 
         * @return builder
         * 
         */
        public Builder notifyConfiguration(RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationArgs notifyConfiguration) {
            return notifyConfiguration(Output.of(notifyConfiguration));
        }

        public RiskConfigurationAccountTakeoverRiskConfigurationArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.notifyConfiguration = Objects.requireNonNull($.notifyConfiguration, "expected parameter 'notifyConfiguration' to be non-null");
            return $;
        }
    }

}