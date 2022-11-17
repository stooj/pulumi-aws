// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProxyDefaultTargetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProxyDefaultTargetGroupArgs Empty = new ProxyDefaultTargetGroupArgs();

    /**
     * The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    @Import(name="connectionPoolConfig")
    private @Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> connectionPoolConfig;

    /**
     * @return The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    public Optional<Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs>> connectionPoolConfig() {
        return Optional.ofNullable(this.connectionPoolConfig);
    }

    /**
     * Name of the RDS DB Proxy.
     * 
     */
    @Import(name="dbProxyName", required=true)
    private Output<String> dbProxyName;

    /**
     * @return Name of the RDS DB Proxy.
     * 
     */
    public Output<String> dbProxyName() {
        return this.dbProxyName;
    }

    private ProxyDefaultTargetGroupArgs() {}

    private ProxyDefaultTargetGroupArgs(ProxyDefaultTargetGroupArgs $) {
        this.connectionPoolConfig = $.connectionPoolConfig;
        this.dbProxyName = $.dbProxyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProxyDefaultTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProxyDefaultTargetGroupArgs $;

        public Builder() {
            $ = new ProxyDefaultTargetGroupArgs();
        }

        public Builder(ProxyDefaultTargetGroupArgs defaults) {
            $ = new ProxyDefaultTargetGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPoolConfig The settings that determine the size and behavior of the connection pool for the target group.
         * 
         * @return builder
         * 
         */
        public Builder connectionPoolConfig(@Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> connectionPoolConfig) {
            $.connectionPoolConfig = connectionPoolConfig;
            return this;
        }

        /**
         * @param connectionPoolConfig The settings that determine the size and behavior of the connection pool for the target group.
         * 
         * @return builder
         * 
         */
        public Builder connectionPoolConfig(ProxyDefaultTargetGroupConnectionPoolConfigArgs connectionPoolConfig) {
            return connectionPoolConfig(Output.of(connectionPoolConfig));
        }

        /**
         * @param dbProxyName Name of the RDS DB Proxy.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyName(Output<String> dbProxyName) {
            $.dbProxyName = dbProxyName;
            return this;
        }

        /**
         * @param dbProxyName Name of the RDS DB Proxy.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyName(String dbProxyName) {
            return dbProxyName(Output.of(dbProxyName));
        }

        public ProxyDefaultTargetGroupArgs build() {
            $.dbProxyName = Objects.requireNonNull($.dbProxyName, "expected parameter 'dbProxyName' to be non-null");
            return $;
        }
    }

}