// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs;
import com.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs;
import com.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs;
import com.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SelectionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SelectionConditionArgs Empty = new SelectionConditionArgs();

    @Import(name="stringEquals")
    private @Nullable Output<List<SelectionConditionStringEqualArgs>> stringEquals;

    public Optional<Output<List<SelectionConditionStringEqualArgs>>> stringEquals() {
        return Optional.ofNullable(this.stringEquals);
    }

    @Import(name="stringLikes")
    private @Nullable Output<List<SelectionConditionStringLikeArgs>> stringLikes;

    public Optional<Output<List<SelectionConditionStringLikeArgs>>> stringLikes() {
        return Optional.ofNullable(this.stringLikes);
    }

    @Import(name="stringNotEquals")
    private @Nullable Output<List<SelectionConditionStringNotEqualArgs>> stringNotEquals;

    public Optional<Output<List<SelectionConditionStringNotEqualArgs>>> stringNotEquals() {
        return Optional.ofNullable(this.stringNotEquals);
    }

    @Import(name="stringNotLikes")
    private @Nullable Output<List<SelectionConditionStringNotLikeArgs>> stringNotLikes;

    public Optional<Output<List<SelectionConditionStringNotLikeArgs>>> stringNotLikes() {
        return Optional.ofNullable(this.stringNotLikes);
    }

    private SelectionConditionArgs() {}

    private SelectionConditionArgs(SelectionConditionArgs $) {
        this.stringEquals = $.stringEquals;
        this.stringLikes = $.stringLikes;
        this.stringNotEquals = $.stringNotEquals;
        this.stringNotLikes = $.stringNotLikes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelectionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelectionConditionArgs $;

        public Builder() {
            $ = new SelectionConditionArgs();
        }

        public Builder(SelectionConditionArgs defaults) {
            $ = new SelectionConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder stringEquals(@Nullable Output<List<SelectionConditionStringEqualArgs>> stringEquals) {
            $.stringEquals = stringEquals;
            return this;
        }

        public Builder stringEquals(List<SelectionConditionStringEqualArgs> stringEquals) {
            return stringEquals(Output.of(stringEquals));
        }

        public Builder stringEquals(SelectionConditionStringEqualArgs... stringEquals) {
            return stringEquals(List.of(stringEquals));
        }

        public Builder stringLikes(@Nullable Output<List<SelectionConditionStringLikeArgs>> stringLikes) {
            $.stringLikes = stringLikes;
            return this;
        }

        public Builder stringLikes(List<SelectionConditionStringLikeArgs> stringLikes) {
            return stringLikes(Output.of(stringLikes));
        }

        public Builder stringLikes(SelectionConditionStringLikeArgs... stringLikes) {
            return stringLikes(List.of(stringLikes));
        }

        public Builder stringNotEquals(@Nullable Output<List<SelectionConditionStringNotEqualArgs>> stringNotEquals) {
            $.stringNotEquals = stringNotEquals;
            return this;
        }

        public Builder stringNotEquals(List<SelectionConditionStringNotEqualArgs> stringNotEquals) {
            return stringNotEquals(Output.of(stringNotEquals));
        }

        public Builder stringNotEquals(SelectionConditionStringNotEqualArgs... stringNotEquals) {
            return stringNotEquals(List.of(stringNotEquals));
        }

        public Builder stringNotLikes(@Nullable Output<List<SelectionConditionStringNotLikeArgs>> stringNotLikes) {
            $.stringNotLikes = stringNotLikes;
            return this;
        }

        public Builder stringNotLikes(List<SelectionConditionStringNotLikeArgs> stringNotLikes) {
            return stringNotLikes(Output.of(stringNotLikes));
        }

        public Builder stringNotLikes(SelectionConditionStringNotLikeArgs... stringNotLikes) {
            return stringNotLikes(List.of(stringNotLikes));
        }

        public SelectionConditionArgs build() {
            return $;
        }
    }

}