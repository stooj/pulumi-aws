// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEventConnectionResult {
    /**
     * @return ARN (Amazon Resource Name) for the connection.
     * 
     */
    private String arn;
    /**
     * @return Type of authorization to use to connect. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    private String authorizationType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Name of the connection.
     * 
     */
    private String name;
    /**
     * @return ARN (Amazon Resource Name) for the secret created from the authorization parameters specified for the connection.
     * 
     */
    private String secretArn;

    private GetEventConnectionResult() {}
    /**
     * @return ARN (Amazon Resource Name) for the connection.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Type of authorization to use to connect. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    public String authorizationType() {
        return this.authorizationType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the connection.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ARN (Amazon Resource Name) for the secret created from the authorization parameters specified for the connection.
     * 
     */
    public String secretArn() {
        return this.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String authorizationType;
        private String id;
        private String name;
        private String secretArn;
        public Builder() {}
        public Builder(GetEventConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authorizationType = defaults.authorizationType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.secretArn = defaults.secretArn;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }
        public GetEventConnectionResult build() {
            final var o = new GetEventConnectionResult();
            o.arn = arn;
            o.authorizationType = authorizationType;
            o.id = id;
            o.name = name;
            o.secretArn = secretArn;
            return o;
        }
    }
}