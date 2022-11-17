// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceEphemeralBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceEphemeralBlockDeviceArgs Empty = new InstanceEphemeralBlockDeviceArgs();

    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    @Import(name="virtualName", required=true)
    private Output<String> virtualName;

    public Output<String> virtualName() {
        return this.virtualName;
    }

    private InstanceEphemeralBlockDeviceArgs() {}

    private InstanceEphemeralBlockDeviceArgs(InstanceEphemeralBlockDeviceArgs $) {
        this.deviceName = $.deviceName;
        this.virtualName = $.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceEphemeralBlockDeviceArgs $;

        public Builder() {
            $ = new InstanceEphemeralBlockDeviceArgs();
        }

        public Builder(InstanceEphemeralBlockDeviceArgs defaults) {
            $ = new InstanceEphemeralBlockDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder virtualName(Output<String> virtualName) {
            $.virtualName = virtualName;
            return this;
        }

        public Builder virtualName(String virtualName) {
            return virtualName(Output.of(virtualName));
        }

        public InstanceEphemeralBlockDeviceArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.virtualName = Objects.requireNonNull($.virtualName, "expected parameter 'virtualName' to be non-null");
            return $;
        }
    }

}