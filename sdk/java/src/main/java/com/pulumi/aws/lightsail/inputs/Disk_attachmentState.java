// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Disk_attachmentState extends com.pulumi.resources.ResourceArgs {

    public static final Disk_attachmentState Empty = new Disk_attachmentState();

    /**
     * The name of the Lightsail Disk.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    /**
     * @return The name of the Lightsail Disk.
     * 
     */
    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * The disk path to expose to the instance.
     * 
     */
    @Import(name="diskPath")
    private @Nullable Output<String> diskPath;

    /**
     * @return The disk path to expose to the instance.
     * 
     */
    public Optional<Output<String>> diskPath() {
        return Optional.ofNullable(this.diskPath);
    }

    /**
     * The name of the Lightsail Instance to attach to.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the Lightsail Instance to attach to.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    private Disk_attachmentState() {}

    private Disk_attachmentState(Disk_attachmentState $) {
        this.diskName = $.diskName;
        this.diskPath = $.diskPath;
        this.instanceName = $.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Disk_attachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Disk_attachmentState $;

        public Builder() {
            $ = new Disk_attachmentState();
        }

        public Builder(Disk_attachmentState defaults) {
            $ = new Disk_attachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskName The name of the Lightsail Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        /**
         * @param diskName The name of the Lightsail Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        /**
         * @param diskPath The disk path to expose to the instance.
         * 
         * @return builder
         * 
         */
        public Builder diskPath(@Nullable Output<String> diskPath) {
            $.diskPath = diskPath;
            return this;
        }

        /**
         * @param diskPath The disk path to expose to the instance.
         * 
         * @return builder
         * 
         */
        public Builder diskPath(String diskPath) {
            return diskPath(Output.of(diskPath));
        }

        /**
         * @param instanceName The name of the Lightsail Instance to attach to.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the Lightsail Instance to attach to.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        public Disk_attachmentState build() {
            return $;
        }
    }

}