// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceEnclaveOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceEnclaveOptionsArgs Empty = new InstanceEnclaveOptionsArgs();

    /**
     * Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private InstanceEnclaveOptionsArgs() {}

    private InstanceEnclaveOptionsArgs(InstanceEnclaveOptionsArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceEnclaveOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceEnclaveOptionsArgs $;

        public Builder() {
            $ = new InstanceEnclaveOptionsArgs();
        }

        public Builder(InstanceEnclaveOptionsArgs defaults) {
            $ = new InstanceEnclaveOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public InstanceEnclaveOptionsArgs build() {
            return $;
        }
    }

}