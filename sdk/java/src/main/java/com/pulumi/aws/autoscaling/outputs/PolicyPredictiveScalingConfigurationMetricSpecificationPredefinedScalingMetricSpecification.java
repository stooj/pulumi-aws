// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification {
    /**
     * @return Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
     */
    private String predefinedMetricType;
    /**
     * @return Label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
     */
    private String resourceLabel;

    private PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification() {}
    /**
     * @return Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
     */
    public String predefinedMetricType() {
        return this.predefinedMetricType;
    }
    /**
     * @return Label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
     */
    public String resourceLabel() {
        return this.resourceLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String predefinedMetricType;
        private String resourceLabel;
        public Builder() {}
        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        @CustomType.Setter
        public Builder predefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }
        @CustomType.Setter
        public Builder resourceLabel(String resourceLabel) {
            this.resourceLabel = Objects.requireNonNull(resourceLabel);
            return this;
        }
        public PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification build() {
            final var o = new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification();
            o.predefinedMetricType = predefinedMetricType;
            o.resourceLabel = resourceLabel;
            return o;
        }
    }
}