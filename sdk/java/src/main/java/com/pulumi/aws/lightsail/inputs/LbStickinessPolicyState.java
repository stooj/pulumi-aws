// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LbStickinessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final LbStickinessPolicyState Empty = new LbStickinessPolicyState();

    /**
     * The cookie duration in seconds. This determines the length of the session stickiness.
     * 
     */
    @Import(name="cookieDuration")
    private @Nullable Output<Integer> cookieDuration;

    /**
     * @return The cookie duration in seconds. This determines the length of the session stickiness.
     * 
     */
    public Optional<Output<Integer>> cookieDuration() {
        return Optional.ofNullable(this.cookieDuration);
    }

    /**
     * - The Session Stickiness state of the load balancer. `true` to activate session stickiness or `false` to deactivate session stickiness.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return - The Session Stickiness state of the load balancer. `true` to activate session stickiness or `false` to deactivate session stickiness.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the load balancer to which you want to enable session stickiness.
     * 
     */
    @Import(name="lbName")
    private @Nullable Output<String> lbName;

    /**
     * @return The name of the load balancer to which you want to enable session stickiness.
     * 
     */
    public Optional<Output<String>> lbName() {
        return Optional.ofNullable(this.lbName);
    }

    private LbStickinessPolicyState() {}

    private LbStickinessPolicyState(LbStickinessPolicyState $) {
        this.cookieDuration = $.cookieDuration;
        this.enabled = $.enabled;
        this.lbName = $.lbName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LbStickinessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LbStickinessPolicyState $;

        public Builder() {
            $ = new LbStickinessPolicyState();
        }

        public Builder(LbStickinessPolicyState defaults) {
            $ = new LbStickinessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookieDuration The cookie duration in seconds. This determines the length of the session stickiness.
         * 
         * @return builder
         * 
         */
        public Builder cookieDuration(@Nullable Output<Integer> cookieDuration) {
            $.cookieDuration = cookieDuration;
            return this;
        }

        /**
         * @param cookieDuration The cookie duration in seconds. This determines the length of the session stickiness.
         * 
         * @return builder
         * 
         */
        public Builder cookieDuration(Integer cookieDuration) {
            return cookieDuration(Output.of(cookieDuration));
        }

        /**
         * @param enabled - The Session Stickiness state of the load balancer. `true` to activate session stickiness or `false` to deactivate session stickiness.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled - The Session Stickiness state of the load balancer. `true` to activate session stickiness or `false` to deactivate session stickiness.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param lbName The name of the load balancer to which you want to enable session stickiness.
         * 
         * @return builder
         * 
         */
        public Builder lbName(@Nullable Output<String> lbName) {
            $.lbName = lbName;
            return this;
        }

        /**
         * @param lbName The name of the load balancer to which you want to enable session stickiness.
         * 
         * @return builder
         * 
         */
        public Builder lbName(String lbName) {
            return lbName(Output.of(lbName));
        }

        public LbStickinessPolicyState build() {
            return $;
        }
    }

}