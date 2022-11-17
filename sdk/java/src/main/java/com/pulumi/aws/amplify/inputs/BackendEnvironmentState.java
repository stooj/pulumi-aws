// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendEnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final BackendEnvironmentState Empty = new BackendEnvironmentState();

    /**
     * Unique ID for an Amplify app.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return Unique ID for an Amplify app.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * ARN for a backend environment that is part of an Amplify app.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN for a backend environment that is part of an Amplify app.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of deployment artifacts.
     * 
     */
    @Import(name="deploymentArtifacts")
    private @Nullable Output<String> deploymentArtifacts;

    /**
     * @return Name of deployment artifacts.
     * 
     */
    public Optional<Output<String>> deploymentArtifacts() {
        return Optional.ofNullable(this.deploymentArtifacts);
    }

    /**
     * Name for the backend environment.
     * 
     */
    @Import(name="environmentName")
    private @Nullable Output<String> environmentName;

    /**
     * @return Name for the backend environment.
     * 
     */
    public Optional<Output<String>> environmentName() {
        return Optional.ofNullable(this.environmentName);
    }

    /**
     * AWS CloudFormation stack name of a backend environment.
     * 
     */
    @Import(name="stackName")
    private @Nullable Output<String> stackName;

    /**
     * @return AWS CloudFormation stack name of a backend environment.
     * 
     */
    public Optional<Output<String>> stackName() {
        return Optional.ofNullable(this.stackName);
    }

    private BackendEnvironmentState() {}

    private BackendEnvironmentState(BackendEnvironmentState $) {
        this.appId = $.appId;
        this.arn = $.arn;
        this.deploymentArtifacts = $.deploymentArtifacts;
        this.environmentName = $.environmentName;
        this.stackName = $.stackName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendEnvironmentState $;

        public Builder() {
            $ = new BackendEnvironmentState();
        }

        public Builder(BackendEnvironmentState defaults) {
            $ = new BackendEnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Unique ID for an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId Unique ID for an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param arn ARN for a backend environment that is part of an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN for a backend environment that is part of an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param deploymentArtifacts Name of deployment artifacts.
         * 
         * @return builder
         * 
         */
        public Builder deploymentArtifacts(@Nullable Output<String> deploymentArtifacts) {
            $.deploymentArtifacts = deploymentArtifacts;
            return this;
        }

        /**
         * @param deploymentArtifacts Name of deployment artifacts.
         * 
         * @return builder
         * 
         */
        public Builder deploymentArtifacts(String deploymentArtifacts) {
            return deploymentArtifacts(Output.of(deploymentArtifacts));
        }

        /**
         * @param environmentName Name for the backend environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(@Nullable Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName Name for the backend environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        /**
         * @param stackName AWS CloudFormation stack name of a backend environment.
         * 
         * @return builder
         * 
         */
        public Builder stackName(@Nullable Output<String> stackName) {
            $.stackName = stackName;
            return this;
        }

        /**
         * @param stackName AWS CloudFormation stack name of a backend environment.
         * 
         * @return builder
         * 
         */
        public Builder stackName(String stackName) {
            return stackName(Output.of(stackName));
        }

        public BackendEnvironmentState build() {
            return $;
        }
    }

}