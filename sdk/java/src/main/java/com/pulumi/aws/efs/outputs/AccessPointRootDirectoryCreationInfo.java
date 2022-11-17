// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessPointRootDirectoryCreationInfo {
    /**
     * @return POSIX group ID to apply to the `root_directory`.
     * 
     */
    private Integer ownerGid;
    /**
     * @return POSIX user ID to apply to the `root_directory`.
     * 
     */
    private Integer ownerUid;
    /**
     * @return POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file&#39;s mode bits.
     * 
     */
    private String permissions;

    private AccessPointRootDirectoryCreationInfo() {}
    /**
     * @return POSIX group ID to apply to the `root_directory`.
     * 
     */
    public Integer ownerGid() {
        return this.ownerGid;
    }
    /**
     * @return POSIX user ID to apply to the `root_directory`.
     * 
     */
    public Integer ownerUid() {
        return this.ownerUid;
    }
    /**
     * @return POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file&#39;s mode bits.
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointRootDirectoryCreationInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer ownerGid;
        private Integer ownerUid;
        private String permissions;
        public Builder() {}
        public Builder(AccessPointRootDirectoryCreationInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder ownerGid(Integer ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }
        @CustomType.Setter
        public Builder ownerUid(Integer ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public AccessPointRootDirectoryCreationInfo build() {
            final var o = new AccessPointRootDirectoryCreationInfo();
            o.ownerGid = ownerGid;
            o.ownerUid = ownerUid;
            o.permissions = permissions;
            return o;
        }
    }
}