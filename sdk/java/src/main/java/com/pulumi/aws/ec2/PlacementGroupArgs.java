// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.enums.PlacementStrategy;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlacementGroupArgs Empty = new PlacementGroupArgs();

    /**
     * The name of the placement group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the placement group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of partitions to create in the
     * placement group.  Can only be specified when the `strategy` is set to
     * `&#34;partition&#34;`.  Valid values are 1 - 7 (default is `2`).
     * 
     */
    @Import(name="partitionCount")
    private @Nullable Output<Integer> partitionCount;

    /**
     * @return The number of partitions to create in the
     * placement group.  Can only be specified when the `strategy` is set to
     * `&#34;partition&#34;`.  Valid values are 1 - 7 (default is `2`).
     * 
     */
    public Optional<Output<Integer>> partitionCount() {
        return Optional.ofNullable(this.partitionCount);
    }

    /**
     * Determines how placement groups spread instances. Can only be used
     * when the `strategy` is set to `&#34;spread&#34;`. Can be `&#34;host&#34;` or `&#34;rack&#34;`. `&#34;host&#34;` can only be used for Outpost placement groups.
     * 
     */
    @Import(name="spreadLevel")
    private @Nullable Output<String> spreadLevel;

    /**
     * @return Determines how placement groups spread instances. Can only be used
     * when the `strategy` is set to `&#34;spread&#34;`. Can be `&#34;host&#34;` or `&#34;rack&#34;`. `&#34;host&#34;` can only be used for Outpost placement groups.
     * 
     */
    public Optional<Output<String>> spreadLevel() {
        return Optional.ofNullable(this.spreadLevel);
    }

    /**
     * The placement strategy. Can be `&#34;cluster&#34;`, `&#34;partition&#34;` or `&#34;spread&#34;`.
     * 
     */
    @Import(name="strategy", required=true)
    private Output<Either<String,PlacementStrategy>> strategy;

    /**
     * @return The placement strategy. Can be `&#34;cluster&#34;`, `&#34;partition&#34;` or `&#34;spread&#34;`.
     * 
     */
    public Output<Either<String,PlacementStrategy>> strategy() {
        return this.strategy;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PlacementGroupArgs() {}

    private PlacementGroupArgs(PlacementGroupArgs $) {
        this.name = $.name;
        this.partitionCount = $.partitionCount;
        this.spreadLevel = $.spreadLevel;
        this.strategy = $.strategy;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlacementGroupArgs $;

        public Builder() {
            $ = new PlacementGroupArgs();
        }

        public Builder(PlacementGroupArgs defaults) {
            $ = new PlacementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partitionCount The number of partitions to create in the
         * placement group.  Can only be specified when the `strategy` is set to
         * `&#34;partition&#34;`.  Valid values are 1 - 7 (default is `2`).
         * 
         * @return builder
         * 
         */
        public Builder partitionCount(@Nullable Output<Integer> partitionCount) {
            $.partitionCount = partitionCount;
            return this;
        }

        /**
         * @param partitionCount The number of partitions to create in the
         * placement group.  Can only be specified when the `strategy` is set to
         * `&#34;partition&#34;`.  Valid values are 1 - 7 (default is `2`).
         * 
         * @return builder
         * 
         */
        public Builder partitionCount(Integer partitionCount) {
            return partitionCount(Output.of(partitionCount));
        }

        /**
         * @param spreadLevel Determines how placement groups spread instances. Can only be used
         * when the `strategy` is set to `&#34;spread&#34;`. Can be `&#34;host&#34;` or `&#34;rack&#34;`. `&#34;host&#34;` can only be used for Outpost placement groups.
         * 
         * @return builder
         * 
         */
        public Builder spreadLevel(@Nullable Output<String> spreadLevel) {
            $.spreadLevel = spreadLevel;
            return this;
        }

        /**
         * @param spreadLevel Determines how placement groups spread instances. Can only be used
         * when the `strategy` is set to `&#34;spread&#34;`. Can be `&#34;host&#34;` or `&#34;rack&#34;`. `&#34;host&#34;` can only be used for Outpost placement groups.
         * 
         * @return builder
         * 
         */
        public Builder spreadLevel(String spreadLevel) {
            return spreadLevel(Output.of(spreadLevel));
        }

        /**
         * @param strategy The placement strategy. Can be `&#34;cluster&#34;`, `&#34;partition&#34;` or `&#34;spread&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder strategy(Output<Either<String,PlacementStrategy>> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy The placement strategy. Can be `&#34;cluster&#34;`, `&#34;partition&#34;` or `&#34;spread&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder strategy(Either<String,PlacementStrategy> strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param strategy The placement strategy. Can be `&#34;cluster&#34;`, `&#34;partition&#34;` or `&#34;spread&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Either.ofLeft(strategy));
        }

        /**
         * @param strategy The placement strategy. Can be `&#34;cluster&#34;`, `&#34;partition&#34;` or `&#34;spread&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder strategy(PlacementStrategy strategy) {
            return strategy(Either.ofRight(strategy));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PlacementGroupArgs build() {
            $.strategy = Objects.requireNonNull($.strategy, "expected parameter 'strategy' to be non-null");
            return $;
        }
    }

}