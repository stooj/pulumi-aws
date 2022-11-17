// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyStepScalingPolicyConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyStepScalingPolicyConfigurationArgs Empty = new PolicyStepScalingPolicyConfigurationArgs();

    /**
     * Whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
     * 
     */
    @Import(name="adjustmentType")
    private @Nullable Output<String> adjustmentType;

    /**
     * @return Whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
     * 
     */
    public Optional<Output<String>> adjustmentType() {
        return Optional.ofNullable(this.adjustmentType);
    }

    /**
     * Amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
     * 
     */
    @Import(name="cooldown")
    private @Nullable Output<Integer> cooldown;

    /**
     * @return Amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
     * 
     */
    public Optional<Output<Integer>> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }

    /**
     * Aggregation type for the policy&#39;s metrics. Valid values are &#34;Minimum&#34;, &#34;Maximum&#34;, and &#34;Average&#34;. Without a value, AWS will treat the aggregation type as &#34;Average&#34;.
     * 
     */
    @Import(name="metricAggregationType")
    private @Nullable Output<String> metricAggregationType;

    /**
     * @return Aggregation type for the policy&#39;s metrics. Valid values are &#34;Minimum&#34;, &#34;Maximum&#34;, and &#34;Average&#34;. Without a value, AWS will treat the aggregation type as &#34;Average&#34;.
     * 
     */
    public Optional<Output<String>> metricAggregationType() {
        return Optional.ofNullable(this.metricAggregationType);
    }

    /**
     * Minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
     * 
     */
    @Import(name="minAdjustmentMagnitude")
    private @Nullable Output<Integer> minAdjustmentMagnitude;

    /**
     * @return Minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
     * 
     */
    public Optional<Output<Integer>> minAdjustmentMagnitude() {
        return Optional.ofNullable(this.minAdjustmentMagnitude);
    }

    /**
     * Set of adjustments that manage scaling. These have the following structure:
     * 
     */
    @Import(name="stepAdjustments")
    private @Nullable Output<List<PolicyStepScalingPolicyConfigurationStepAdjustmentArgs>> stepAdjustments;

    /**
     * @return Set of adjustments that manage scaling. These have the following structure:
     * 
     */
    public Optional<Output<List<PolicyStepScalingPolicyConfigurationStepAdjustmentArgs>>> stepAdjustments() {
        return Optional.ofNullable(this.stepAdjustments);
    }

    private PolicyStepScalingPolicyConfigurationArgs() {}

    private PolicyStepScalingPolicyConfigurationArgs(PolicyStepScalingPolicyConfigurationArgs $) {
        this.adjustmentType = $.adjustmentType;
        this.cooldown = $.cooldown;
        this.metricAggregationType = $.metricAggregationType;
        this.minAdjustmentMagnitude = $.minAdjustmentMagnitude;
        this.stepAdjustments = $.stepAdjustments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyStepScalingPolicyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyStepScalingPolicyConfigurationArgs $;

        public Builder() {
            $ = new PolicyStepScalingPolicyConfigurationArgs();
        }

        public Builder(PolicyStepScalingPolicyConfigurationArgs defaults) {
            $ = new PolicyStepScalingPolicyConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adjustmentType Whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
         * 
         * @return builder
         * 
         */
        public Builder adjustmentType(@Nullable Output<String> adjustmentType) {
            $.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * @param adjustmentType Whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
         * 
         * @return builder
         * 
         */
        public Builder adjustmentType(String adjustmentType) {
            return adjustmentType(Output.of(adjustmentType));
        }

        /**
         * @param cooldown Amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(@Nullable Output<Integer> cooldown) {
            $.cooldown = cooldown;
            return this;
        }

        /**
         * @param cooldown Amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(Integer cooldown) {
            return cooldown(Output.of(cooldown));
        }

        /**
         * @param metricAggregationType Aggregation type for the policy&#39;s metrics. Valid values are &#34;Minimum&#34;, &#34;Maximum&#34;, and &#34;Average&#34;. Without a value, AWS will treat the aggregation type as &#34;Average&#34;.
         * 
         * @return builder
         * 
         */
        public Builder metricAggregationType(@Nullable Output<String> metricAggregationType) {
            $.metricAggregationType = metricAggregationType;
            return this;
        }

        /**
         * @param metricAggregationType Aggregation type for the policy&#39;s metrics. Valid values are &#34;Minimum&#34;, &#34;Maximum&#34;, and &#34;Average&#34;. Without a value, AWS will treat the aggregation type as &#34;Average&#34;.
         * 
         * @return builder
         * 
         */
        public Builder metricAggregationType(String metricAggregationType) {
            return metricAggregationType(Output.of(metricAggregationType));
        }

        /**
         * @param minAdjustmentMagnitude Minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
         * 
         * @return builder
         * 
         */
        public Builder minAdjustmentMagnitude(@Nullable Output<Integer> minAdjustmentMagnitude) {
            $.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        /**
         * @param minAdjustmentMagnitude Minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
         * 
         * @return builder
         * 
         */
        public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            return minAdjustmentMagnitude(Output.of(minAdjustmentMagnitude));
        }

        /**
         * @param stepAdjustments Set of adjustments that manage scaling. These have the following structure:
         * 
         * @return builder
         * 
         */
        public Builder stepAdjustments(@Nullable Output<List<PolicyStepScalingPolicyConfigurationStepAdjustmentArgs>> stepAdjustments) {
            $.stepAdjustments = stepAdjustments;
            return this;
        }

        /**
         * @param stepAdjustments Set of adjustments that manage scaling. These have the following structure:
         * 
         * @return builder
         * 
         */
        public Builder stepAdjustments(List<PolicyStepScalingPolicyConfigurationStepAdjustmentArgs> stepAdjustments) {
            return stepAdjustments(Output.of(stepAdjustments));
        }

        /**
         * @param stepAdjustments Set of adjustments that manage scaling. These have the following structure:
         * 
         * @return builder
         * 
         */
        public Builder stepAdjustments(PolicyStepScalingPolicyConfigurationStepAdjustmentArgs... stepAdjustments) {
            return stepAdjustments(List.of(stepAdjustments));
        }

        public PolicyStepScalingPolicyConfigurationArgs build() {
            return $;
        }
    }

}