// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs Empty = new ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs();

    /**
     * Public access type. Valida values: `DISABLED`, `SERVICE_PROVIDED_EIPS`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Public access type. Valida values: `DISABLED`, `SERVICE_PROVIDED_EIPS`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs() {}

    private ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs(ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs $;

        public Builder() {
            $ = new ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs();
        }

        public Builder(ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs defaults) {
            $ = new ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Public access type. Valida values: `DISABLED`, `SERVICE_PROVIDED_EIPS`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Public access type. Valida values: `DISABLED`, `SERVICE_PROVIDED_EIPS`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs build() {
            return $;
        }
    }

}