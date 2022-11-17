// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleAssociationArgs Empty = new RoleAssociationArgs();

    /**
     * The AWS SSO group ids to be assigned the role given in `role`.
     * 
     */
    @Import(name="groupIds")
    private @Nullable Output<List<String>> groupIds;

    /**
     * @return The AWS SSO group ids to be assigned the role given in `role`.
     * 
     */
    public Optional<Output<List<String>>> groupIds() {
        return Optional.ofNullable(this.groupIds);
    }

    /**
     * The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The AWS SSO user ids to be assigned the role given in `role`.
     * 
     */
    @Import(name="userIds")
    private @Nullable Output<List<String>> userIds;

    /**
     * @return The AWS SSO user ids to be assigned the role given in `role`.
     * 
     */
    public Optional<Output<List<String>>> userIds() {
        return Optional.ofNullable(this.userIds);
    }

    /**
     * The workspace id.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The workspace id.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private RoleAssociationArgs() {}

    private RoleAssociationArgs(RoleAssociationArgs $) {
        this.groupIds = $.groupIds;
        this.role = $.role;
        this.userIds = $.userIds;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleAssociationArgs $;

        public Builder() {
            $ = new RoleAssociationArgs();
        }

        public Builder(RoleAssociationArgs defaults) {
            $ = new RoleAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupIds The AWS SSO group ids to be assigned the role given in `role`.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        /**
         * @param groupIds The AWS SSO group ids to be assigned the role given in `role`.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        /**
         * @param groupIds The AWS SSO group ids to be assigned the role given in `role`.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        /**
         * @param role The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param userIds The AWS SSO user ids to be assigned the role given in `role`.
         * 
         * @return builder
         * 
         */
        public Builder userIds(@Nullable Output<List<String>> userIds) {
            $.userIds = userIds;
            return this;
        }

        /**
         * @param userIds The AWS SSO user ids to be assigned the role given in `role`.
         * 
         * @return builder
         * 
         */
        public Builder userIds(List<String> userIds) {
            return userIds(Output.of(userIds));
        }

        /**
         * @param userIds The AWS SSO user ids to be assigned the role given in `role`.
         * 
         * @return builder
         * 
         */
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }

        /**
         * @param workspaceId The workspace id.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The workspace id.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public RoleAssociationArgs build() {
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}