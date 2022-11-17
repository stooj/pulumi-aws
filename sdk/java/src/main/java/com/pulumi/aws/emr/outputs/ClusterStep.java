// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.aws.emr.outputs.ClusterStepHadoopJarStep;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterStep {
    /**
     * @return Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    private String actionOnFailure;
    /**
     * @return JAR file used for the step. See below.
     * 
     */
    private ClusterStepHadoopJarStep hadoopJarStep;
    /**
     * @return Name of the step.
     * 
     */
    private String name;

    private ClusterStep() {}
    /**
     * @return Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    public String actionOnFailure() {
        return this.actionOnFailure;
    }
    /**
     * @return JAR file used for the step. See below.
     * 
     */
    public ClusterStepHadoopJarStep hadoopJarStep() {
        return this.hadoopJarStep;
    }
    /**
     * @return Name of the step.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionOnFailure;
        private ClusterStepHadoopJarStep hadoopJarStep;
        private String name;
        public Builder() {}
        public Builder(ClusterStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnFailure = defaults.actionOnFailure;
    	      this.hadoopJarStep = defaults.hadoopJarStep;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder actionOnFailure(String actionOnFailure) {
            this.actionOnFailure = Objects.requireNonNull(actionOnFailure);
            return this;
        }
        @CustomType.Setter
        public Builder hadoopJarStep(ClusterStepHadoopJarStep hadoopJarStep) {
            this.hadoopJarStep = Objects.requireNonNull(hadoopJarStep);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ClusterStep build() {
            final var o = new ClusterStep();
            o.actionOnFailure = actionOnFailure;
            o.hadoopJarStep = hadoopJarStep;
            o.name = name;
            return o;
        }
    }
}