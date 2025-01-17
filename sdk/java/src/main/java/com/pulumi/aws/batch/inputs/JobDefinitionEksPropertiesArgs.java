// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class JobDefinitionEksPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobDefinitionEksPropertiesArgs Empty = new JobDefinitionEksPropertiesArgs();

    /**
     * The properties for the Kubernetes pod resources of a job. See `pod_properties` below.
     * 
     */
    @Import(name="podProperties", required=true)
    private Output<JobDefinitionEksPropertiesPodPropertiesArgs> podProperties;

    /**
     * @return The properties for the Kubernetes pod resources of a job. See `pod_properties` below.
     * 
     */
    public Output<JobDefinitionEksPropertiesPodPropertiesArgs> podProperties() {
        return this.podProperties;
    }

    private JobDefinitionEksPropertiesArgs() {}

    private JobDefinitionEksPropertiesArgs(JobDefinitionEksPropertiesArgs $) {
        this.podProperties = $.podProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDefinitionEksPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDefinitionEksPropertiesArgs $;

        public Builder() {
            $ = new JobDefinitionEksPropertiesArgs();
        }

        public Builder(JobDefinitionEksPropertiesArgs defaults) {
            $ = new JobDefinitionEksPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param podProperties The properties for the Kubernetes pod resources of a job. See `pod_properties` below.
         * 
         * @return builder
         * 
         */
        public Builder podProperties(Output<JobDefinitionEksPropertiesPodPropertiesArgs> podProperties) {
            $.podProperties = podProperties;
            return this;
        }

        /**
         * @param podProperties The properties for the Kubernetes pod resources of a job. See `pod_properties` below.
         * 
         * @return builder
         * 
         */
        public Builder podProperties(JobDefinitionEksPropertiesPodPropertiesArgs podProperties) {
            return podProperties(Output.of(podProperties));
        }

        public JobDefinitionEksPropertiesArgs build() {
            if ($.podProperties == null) {
                throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesArgs", "podProperties");
            }
            return $;
        }
    }

}
