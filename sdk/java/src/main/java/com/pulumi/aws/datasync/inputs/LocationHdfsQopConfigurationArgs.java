// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationHdfsQopConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationHdfsQopConfigurationArgs Empty = new LocationHdfsQopConfigurationArgs();

    /**
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    @Import(name="dataTransferProtection")
    private @Nullable Output<String> dataTransferProtection;

    /**
     * @return The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    public Optional<Output<String>> dataTransferProtection() {
        return Optional.ofNullable(this.dataTransferProtection);
    }

    /**
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    @Import(name="rpcProtection")
    private @Nullable Output<String> rpcProtection;

    /**
     * @return The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    public Optional<Output<String>> rpcProtection() {
        return Optional.ofNullable(this.rpcProtection);
    }

    private LocationHdfsQopConfigurationArgs() {}

    private LocationHdfsQopConfigurationArgs(LocationHdfsQopConfigurationArgs $) {
        this.dataTransferProtection = $.dataTransferProtection;
        this.rpcProtection = $.rpcProtection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationHdfsQopConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationHdfsQopConfigurationArgs $;

        public Builder() {
            $ = new LocationHdfsQopConfigurationArgs();
        }

        public Builder(LocationHdfsQopConfigurationArgs defaults) {
            $ = new LocationHdfsQopConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataTransferProtection The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
         * 
         * @return builder
         * 
         */
        public Builder dataTransferProtection(@Nullable Output<String> dataTransferProtection) {
            $.dataTransferProtection = dataTransferProtection;
            return this;
        }

        /**
         * @param dataTransferProtection The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
         * 
         * @return builder
         * 
         */
        public Builder dataTransferProtection(String dataTransferProtection) {
            return dataTransferProtection(Output.of(dataTransferProtection));
        }

        /**
         * @param rpcProtection The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
         * 
         * @return builder
         * 
         */
        public Builder rpcProtection(@Nullable Output<String> rpcProtection) {
            $.rpcProtection = rpcProtection;
            return this;
        }

        /**
         * @param rpcProtection The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
         * 
         * @return builder
         * 
         */
        public Builder rpcProtection(String rpcProtection) {
            return rpcProtection(Output.of(rpcProtection));
        }

        public LocationHdfsQopConfigurationArgs build() {
            return $;
        }
    }

}