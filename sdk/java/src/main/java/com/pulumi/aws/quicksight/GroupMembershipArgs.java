// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * The name of the group in which the member will be added.
     * 
     */
    @Import(name="groupName", required=true)
    private Output<String> groupName;

    /**
     * @return The name of the group in which the member will be added.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }

    /**
     * The name of the member to add to the group.
     * 
     */
    @Import(name="memberName", required=true)
    private Output<String> memberName;

    /**
     * @return The name of the member to add to the group.
     * 
     */
    public Output<String> memberName() {
        return this.memberName;
    }

    /**
     * The namespace. Defaults to `default`. Currently only `default` is supported.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace. Defaults to `default`. Currently only `default` is supported.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GroupMembershipArgs() {}

    private GroupMembershipArgs(GroupMembershipArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.groupName = $.groupName;
        this.memberName = $.memberName;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMembershipArgs $;

        public Builder() {
            $ = new GroupMembershipArgs();
        }

        public Builder(GroupMembershipArgs defaults) {
            $ = new GroupMembershipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param groupName The name of the group in which the member will be added.
         * 
         * @return builder
         * 
         */
        public Builder groupName(Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName The name of the group in which the member will be added.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param memberName The name of the member to add to the group.
         * 
         * @return builder
         * 
         */
        public Builder memberName(Output<String> memberName) {
            $.memberName = memberName;
            return this;
        }

        /**
         * @param memberName The name of the member to add to the group.
         * 
         * @return builder
         * 
         */
        public Builder memberName(String memberName) {
            return memberName(Output.of(memberName));
        }

        /**
         * @param namespace The namespace. Defaults to `default`. Currently only `default` is supported.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace. Defaults to `default`. Currently only `default` is supported.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GroupMembershipArgs build() {
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.memberName = Objects.requireNonNull($.memberName, "expected parameter 'memberName' to be non-null");
            return $;
        }
    }

}