// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.aws.msk.outputs.ClusterOpenMonitoringPrometheus;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ClusterOpenMonitoring {
    /**
     * @return Configuration block for Prometheus settings for open monitoring. See below.
     * 
     */
    private ClusterOpenMonitoringPrometheus prometheus;

    private ClusterOpenMonitoring() {}
    /**
     * @return Configuration block for Prometheus settings for open monitoring. See below.
     * 
     */
    public ClusterOpenMonitoringPrometheus prometheus() {
        return this.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ClusterOpenMonitoringPrometheus prometheus;
        public Builder() {}
        public Builder(ClusterOpenMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheus = defaults.prometheus;
        }

        @CustomType.Setter
        public Builder prometheus(ClusterOpenMonitoringPrometheus prometheus) {
            this.prometheus = Objects.requireNonNull(prometheus);
            return this;
        }
        public ClusterOpenMonitoring build() {
            final var o = new ClusterOpenMonitoring();
            o.prometheus = prometheus;
            return o;
        }
    }
}