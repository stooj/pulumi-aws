// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs Empty = new PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs();

    @Import(name="basicAuth")
    private @Nullable Output<String> basicAuth;

    public Optional<Output<String>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    @Import(name="clientCertificateTlsAuth")
    private @Nullable Output<String> clientCertificateTlsAuth;

    public Optional<Output<String>> clientCertificateTlsAuth() {
        return Optional.ofNullable(this.clientCertificateTlsAuth);
    }

    @Import(name="saslScram256Auth")
    private @Nullable Output<String> saslScram256Auth;

    public Optional<Output<String>> saslScram256Auth() {
        return Optional.ofNullable(this.saslScram256Auth);
    }

    @Import(name="saslScram512Auth")
    private @Nullable Output<String> saslScram512Auth;

    public Optional<Output<String>> saslScram512Auth() {
        return Optional.ofNullable(this.saslScram512Auth);
    }

    private PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs() {}

    private PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs(PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs $) {
        this.basicAuth = $.basicAuth;
        this.clientCertificateTlsAuth = $.clientCertificateTlsAuth;
        this.saslScram256Auth = $.saslScram256Auth;
        this.saslScram512Auth = $.saslScram512Auth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs $;

        public Builder() {
            $ = new PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs();
        }

        public Builder(PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs defaults) {
            $ = new PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable Output<String> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder basicAuth(String basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        public Builder clientCertificateTlsAuth(@Nullable Output<String> clientCertificateTlsAuth) {
            $.clientCertificateTlsAuth = clientCertificateTlsAuth;
            return this;
        }

        public Builder clientCertificateTlsAuth(String clientCertificateTlsAuth) {
            return clientCertificateTlsAuth(Output.of(clientCertificateTlsAuth));
        }

        public Builder saslScram256Auth(@Nullable Output<String> saslScram256Auth) {
            $.saslScram256Auth = saslScram256Auth;
            return this;
        }

        public Builder saslScram256Auth(String saslScram256Auth) {
            return saslScram256Auth(Output.of(saslScram256Auth));
        }

        public Builder saslScram512Auth(@Nullable Output<String> saslScram512Auth) {
            $.saslScram512Auth = saslScram512Auth;
            return this;
        }

        public Builder saslScram512Auth(String saslScram512Auth) {
            return saslScram512Auth(Output.of(saslScram512Auth));
        }

        public PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs build() {
            return $;
        }
    }

}
