// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.aws.backup.inputs.PlanRuleCopyActionLifecycleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanRuleCopyActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlanRuleCopyActionArgs Empty = new PlanRuleCopyActionArgs();

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * 
     */
    @Import(name="destinationVaultArn", required=true)
    private Output<String> destinationVaultArn;

    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * 
     */
    public Output<String> destinationVaultArn() {
        return this.destinationVaultArn;
    }

    /**
     * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    @Import(name="lifecycle")
    private @Nullable Output<PlanRuleCopyActionLifecycleArgs> lifecycle;

    /**
     * @return The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    public Optional<Output<PlanRuleCopyActionLifecycleArgs>> lifecycle() {
        return Optional.ofNullable(this.lifecycle);
    }

    private PlanRuleCopyActionArgs() {}

    private PlanRuleCopyActionArgs(PlanRuleCopyActionArgs $) {
        this.destinationVaultArn = $.destinationVaultArn;
        this.lifecycle = $.lifecycle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanRuleCopyActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanRuleCopyActionArgs $;

        public Builder() {
            $ = new PlanRuleCopyActionArgs();
        }

        public Builder(PlanRuleCopyActionArgs defaults) {
            $ = new PlanRuleCopyActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationVaultArn An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
         * 
         * @return builder
         * 
         */
        public Builder destinationVaultArn(Output<String> destinationVaultArn) {
            $.destinationVaultArn = destinationVaultArn;
            return this;
        }

        /**
         * @param destinationVaultArn An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
         * 
         * @return builder
         * 
         */
        public Builder destinationVaultArn(String destinationVaultArn) {
            return destinationVaultArn(Output.of(destinationVaultArn));
        }

        /**
         * @param lifecycle The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
         * 
         * @return builder
         * 
         */
        public Builder lifecycle(@Nullable Output<PlanRuleCopyActionLifecycleArgs> lifecycle) {
            $.lifecycle = lifecycle;
            return this;
        }

        /**
         * @param lifecycle The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
         * 
         * @return builder
         * 
         */
        public Builder lifecycle(PlanRuleCopyActionLifecycleArgs lifecycle) {
            return lifecycle(Output.of(lifecycle));
        }

        public PlanRuleCopyActionArgs build() {
            $.destinationVaultArn = Objects.requireNonNull($.destinationVaultArn, "expected parameter 'destinationVaultArn' to be non-null");
            return $;
        }
    }

}