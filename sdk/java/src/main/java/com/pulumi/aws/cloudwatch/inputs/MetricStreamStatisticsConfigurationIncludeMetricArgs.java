// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MetricStreamStatisticsConfigurationIncludeMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricStreamStatisticsConfigurationIncludeMetricArgs Empty = new MetricStreamStatisticsConfigurationIncludeMetricArgs();

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    private MetricStreamStatisticsConfigurationIncludeMetricArgs() {}

    private MetricStreamStatisticsConfigurationIncludeMetricArgs(MetricStreamStatisticsConfigurationIncludeMetricArgs $) {
        this.metricName = $.metricName;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStreamStatisticsConfigurationIncludeMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStreamStatisticsConfigurationIncludeMetricArgs $;

        public Builder() {
            $ = new MetricStreamStatisticsConfigurationIncludeMetricArgs();
        }

        public Builder(MetricStreamStatisticsConfigurationIncludeMetricArgs defaults) {
            $ = new MetricStreamStatisticsConfigurationIncludeMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public MetricStreamStatisticsConfigurationIncludeMetricArgs build() {
            if ($.metricName == null) {
                throw new MissingRequiredPropertyException("MetricStreamStatisticsConfigurationIncludeMetricArgs", "metricName");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("MetricStreamStatisticsConfigurationIncludeMetricArgs", "namespace");
            }
            return $;
        }
    }

}
