// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCallerIdentityResult {
    /**
     * @return AWS Account ID number of the account that owns or contains the calling entity.
     * 
     */
    private String accountId;
    /**
     * @return ARN associated with the calling entity.
     * 
     */
    private String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the calling entity.
     * 
     */
    private String userId;

    private GetCallerIdentityResult() {}
    /**
     * @return AWS Account ID number of the account that owns or contains the calling entity.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return ARN associated with the calling entity.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the calling entity.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCallerIdentityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String arn;
        private String id;
        private String userId;
        public Builder() {}
        public Builder(GetCallerIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetCallerIdentityResult build() {
            final var o = new GetCallerIdentityResult();
            o.accountId = accountId;
            o.arn = arn;
            o.id = id;
            o.userId = userId;
            return o;
        }
    }
}