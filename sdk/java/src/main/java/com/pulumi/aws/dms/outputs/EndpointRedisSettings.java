// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointRedisSettings {
    /**
     * @return The password provided with the auth-role and auth-token options of the AuthType setting for a Redis target endpoint.
     * 
     */
    private @Nullable String authPassword;
    /**
     * @return The type of authentication to perform when connecting to a Redis target. Options include `none`, `auth-token`, and `auth-role`. The `auth-token` option requires an `auth_password` value to be provided. The `auth-role` option requires `auth_user_name` and `auth_password` values to be provided.
     * 
     */
    private String authType;
    /**
     * @return The username provided with the `auth-role` option of the AuthType setting for a Redis target endpoint.
     * 
     */
    private @Nullable String authUserName;
    /**
     * @return Transmission Control Protocol (TCP) port for the endpoint.
     * 
     */
    private Integer port;
    /**
     * @return Fully qualified domain name of the endpoint.
     * 
     */
    private String serverName;
    /**
     * @return The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target endpoint.
     * 
     */
    private @Nullable String sslCaCertificateArn;
    /**
     * @return The plaintext option doesn&#39;t provide Transport Layer Security (TLS) encryption for traffic between endpoint and database. Options include `plaintext`, `ssl-encryption`. The default is `ssl-encryption`.
     * 
     */
    private @Nullable String sslSecurityProtocol;

    private EndpointRedisSettings() {}
    /**
     * @return The password provided with the auth-role and auth-token options of the AuthType setting for a Redis target endpoint.
     * 
     */
    public Optional<String> authPassword() {
        return Optional.ofNullable(this.authPassword);
    }
    /**
     * @return The type of authentication to perform when connecting to a Redis target. Options include `none`, `auth-token`, and `auth-role`. The `auth-token` option requires an `auth_password` value to be provided. The `auth-role` option requires `auth_user_name` and `auth_password` values to be provided.
     * 
     */
    public String authType() {
        return this.authType;
    }
    /**
     * @return The username provided with the `auth-role` option of the AuthType setting for a Redis target endpoint.
     * 
     */
    public Optional<String> authUserName() {
        return Optional.ofNullable(this.authUserName);
    }
    /**
     * @return Transmission Control Protocol (TCP) port for the endpoint.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Fully qualified domain name of the endpoint.
     * 
     */
    public String serverName() {
        return this.serverName;
    }
    /**
     * @return The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target endpoint.
     * 
     */
    public Optional<String> sslCaCertificateArn() {
        return Optional.ofNullable(this.sslCaCertificateArn);
    }
    /**
     * @return The plaintext option doesn&#39;t provide Transport Layer Security (TLS) encryption for traffic between endpoint and database. Options include `plaintext`, `ssl-encryption`. The default is `ssl-encryption`.
     * 
     */
    public Optional<String> sslSecurityProtocol() {
        return Optional.ofNullable(this.sslSecurityProtocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointRedisSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authPassword;
        private String authType;
        private @Nullable String authUserName;
        private Integer port;
        private String serverName;
        private @Nullable String sslCaCertificateArn;
        private @Nullable String sslSecurityProtocol;
        public Builder() {}
        public Builder(EndpointRedisSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authPassword = defaults.authPassword;
    	      this.authType = defaults.authType;
    	      this.authUserName = defaults.authUserName;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.sslCaCertificateArn = defaults.sslCaCertificateArn;
    	      this.sslSecurityProtocol = defaults.sslSecurityProtocol;
        }

        @CustomType.Setter
        public Builder authPassword(@Nullable String authPassword) {
            this.authPassword = authPassword;
            return this;
        }
        @CustomType.Setter
        public Builder authType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        @CustomType.Setter
        public Builder authUserName(@Nullable String authUserName) {
            this.authUserName = authUserName;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        @CustomType.Setter
        public Builder sslCaCertificateArn(@Nullable String sslCaCertificateArn) {
            this.sslCaCertificateArn = sslCaCertificateArn;
            return this;
        }
        @CustomType.Setter
        public Builder sslSecurityProtocol(@Nullable String sslSecurityProtocol) {
            this.sslSecurityProtocol = sslSecurityProtocol;
            return this;
        }
        public EndpointRedisSettings build() {
            final var o = new EndpointRedisSettings();
            o.authPassword = authPassword;
            o.authType = authType;
            o.authUserName = authUserName;
            o.port = port;
            o.serverName = serverName;
            o.sslCaCertificateArn = sslCaCertificateArn;
            o.sslSecurityProtocol = sslSecurityProtocol;
            return o;
        }
    }
}