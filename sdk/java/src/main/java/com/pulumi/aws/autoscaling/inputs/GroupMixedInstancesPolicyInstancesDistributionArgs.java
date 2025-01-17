// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyInstancesDistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyInstancesDistributionArgs Empty = new GroupMixedInstancesPolicyInstancesDistributionArgs();

    @Import(name="onDemandAllocationStrategy")
    private @Nullable Output<String> onDemandAllocationStrategy;

    public Optional<Output<String>> onDemandAllocationStrategy() {
        return Optional.ofNullable(this.onDemandAllocationStrategy);
    }

    @Import(name="onDemandBaseCapacity")
    private @Nullable Output<Integer> onDemandBaseCapacity;

    public Optional<Output<Integer>> onDemandBaseCapacity() {
        return Optional.ofNullable(this.onDemandBaseCapacity);
    }

    @Import(name="onDemandPercentageAboveBaseCapacity")
    private @Nullable Output<Integer> onDemandPercentageAboveBaseCapacity;

    public Optional<Output<Integer>> onDemandPercentageAboveBaseCapacity() {
        return Optional.ofNullable(this.onDemandPercentageAboveBaseCapacity);
    }

    @Import(name="spotAllocationStrategy")
    private @Nullable Output<String> spotAllocationStrategy;

    public Optional<Output<String>> spotAllocationStrategy() {
        return Optional.ofNullable(this.spotAllocationStrategy);
    }

    @Import(name="spotInstancePools")
    private @Nullable Output<Integer> spotInstancePools;

    public Optional<Output<Integer>> spotInstancePools() {
        return Optional.ofNullable(this.spotInstancePools);
    }

    @Import(name="spotMaxPrice")
    private @Nullable Output<String> spotMaxPrice;

    public Optional<Output<String>> spotMaxPrice() {
        return Optional.ofNullable(this.spotMaxPrice);
    }

    private GroupMixedInstancesPolicyInstancesDistributionArgs() {}

    private GroupMixedInstancesPolicyInstancesDistributionArgs(GroupMixedInstancesPolicyInstancesDistributionArgs $) {
        this.onDemandAllocationStrategy = $.onDemandAllocationStrategy;
        this.onDemandBaseCapacity = $.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = $.onDemandPercentageAboveBaseCapacity;
        this.spotAllocationStrategy = $.spotAllocationStrategy;
        this.spotInstancePools = $.spotInstancePools;
        this.spotMaxPrice = $.spotMaxPrice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMixedInstancesPolicyInstancesDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMixedInstancesPolicyInstancesDistributionArgs $;

        public Builder() {
            $ = new GroupMixedInstancesPolicyInstancesDistributionArgs();
        }

        public Builder(GroupMixedInstancesPolicyInstancesDistributionArgs defaults) {
            $ = new GroupMixedInstancesPolicyInstancesDistributionArgs(Objects.requireNonNull(defaults));
        }

        public Builder onDemandAllocationStrategy(@Nullable Output<String> onDemandAllocationStrategy) {
            $.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }

        public Builder onDemandAllocationStrategy(String onDemandAllocationStrategy) {
            return onDemandAllocationStrategy(Output.of(onDemandAllocationStrategy));
        }

        public Builder onDemandBaseCapacity(@Nullable Output<Integer> onDemandBaseCapacity) {
            $.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            return onDemandBaseCapacity(Output.of(onDemandBaseCapacity));
        }

        public Builder onDemandPercentageAboveBaseCapacity(@Nullable Output<Integer> onDemandPercentageAboveBaseCapacity) {
            $.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }

        public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            return onDemandPercentageAboveBaseCapacity(Output.of(onDemandPercentageAboveBaseCapacity));
        }

        public Builder spotAllocationStrategy(@Nullable Output<String> spotAllocationStrategy) {
            $.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        public Builder spotAllocationStrategy(String spotAllocationStrategy) {
            return spotAllocationStrategy(Output.of(spotAllocationStrategy));
        }

        public Builder spotInstancePools(@Nullable Output<Integer> spotInstancePools) {
            $.spotInstancePools = spotInstancePools;
            return this;
        }

        public Builder spotInstancePools(Integer spotInstancePools) {
            return spotInstancePools(Output.of(spotInstancePools));
        }

        public Builder spotMaxPrice(@Nullable Output<String> spotMaxPrice) {
            $.spotMaxPrice = spotMaxPrice;
            return this;
        }

        public Builder spotMaxPrice(String spotMaxPrice) {
            return spotMaxPrice(Output.of(spotMaxPrice));
        }

        public GroupMixedInstancesPolicyInstancesDistributionArgs build() {
            return $;
        }
    }

}
