// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorCapacityProvisionedCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorCapacityProvisionedCapacityArgs Empty = new ConnectorCapacityProvisionedCapacityArgs();

    /**
     * The number of microcontroller units (MCUs) allocated to each connector worker. Valid values: `1`, `2`, `4`, `8`. The default value is `1`.
     * 
     */
    @Import(name="mcuCount")
    private @Nullable Output<Integer> mcuCount;

    /**
     * @return The number of microcontroller units (MCUs) allocated to each connector worker. Valid values: `1`, `2`, `4`, `8`. The default value is `1`.
     * 
     */
    public Optional<Output<Integer>> mcuCount() {
        return Optional.ofNullable(this.mcuCount);
    }

    /**
     * The number of workers that are allocated to the connector.
     * 
     */
    @Import(name="workerCount", required=true)
    private Output<Integer> workerCount;

    /**
     * @return The number of workers that are allocated to the connector.
     * 
     */
    public Output<Integer> workerCount() {
        return this.workerCount;
    }

    private ConnectorCapacityProvisionedCapacityArgs() {}

    private ConnectorCapacityProvisionedCapacityArgs(ConnectorCapacityProvisionedCapacityArgs $) {
        this.mcuCount = $.mcuCount;
        this.workerCount = $.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorCapacityProvisionedCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorCapacityProvisionedCapacityArgs $;

        public Builder() {
            $ = new ConnectorCapacityProvisionedCapacityArgs();
        }

        public Builder(ConnectorCapacityProvisionedCapacityArgs defaults) {
            $ = new ConnectorCapacityProvisionedCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector worker. Valid values: `1`, `2`, `4`, `8`. The default value is `1`.
         * 
         * @return builder
         * 
         */
        public Builder mcuCount(@Nullable Output<Integer> mcuCount) {
            $.mcuCount = mcuCount;
            return this;
        }

        /**
         * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector worker. Valid values: `1`, `2`, `4`, `8`. The default value is `1`.
         * 
         * @return builder
         * 
         */
        public Builder mcuCount(Integer mcuCount) {
            return mcuCount(Output.of(mcuCount));
        }

        /**
         * @param workerCount The number of workers that are allocated to the connector.
         * 
         * @return builder
         * 
         */
        public Builder workerCount(Output<Integer> workerCount) {
            $.workerCount = workerCount;
            return this;
        }

        /**
         * @param workerCount The number of workers that are allocated to the connector.
         * 
         * @return builder
         * 
         */
        public Builder workerCount(Integer workerCount) {
            return workerCount(Output.of(workerCount));
        }

        public ConnectorCapacityProvisionedCapacityArgs build() {
            $.workerCount = Objects.requireNonNull($.workerCount, "expected parameter 'workerCount' to be non-null");
            return $;
        }
    }

}