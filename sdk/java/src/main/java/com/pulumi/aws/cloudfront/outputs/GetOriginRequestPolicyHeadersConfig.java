// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyHeadersConfigHeader;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOriginRequestPolicyHeadersConfig {
    private String headerBehavior;
    private List<GetOriginRequestPolicyHeadersConfigHeader> headers;

    private GetOriginRequestPolicyHeadersConfig() {}
    public String headerBehavior() {
        return this.headerBehavior;
    }
    public List<GetOriginRequestPolicyHeadersConfigHeader> headers() {
        return this.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyHeadersConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerBehavior;
        private List<GetOriginRequestPolicyHeadersConfigHeader> headers;
        public Builder() {}
        public Builder(GetOriginRequestPolicyHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        @CustomType.Setter
        public Builder headerBehavior(String headerBehavior) {
            if (headerBehavior == null) {
              throw new MissingRequiredPropertyException("GetOriginRequestPolicyHeadersConfig", "headerBehavior");
            }
            this.headerBehavior = headerBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder headers(List<GetOriginRequestPolicyHeadersConfigHeader> headers) {
            if (headers == null) {
              throw new MissingRequiredPropertyException("GetOriginRequestPolicyHeadersConfig", "headers");
            }
            this.headers = headers;
            return this;
        }
        public Builder headers(GetOriginRequestPolicyHeadersConfigHeader... headers) {
            return headers(List.of(headers));
        }
        public GetOriginRequestPolicyHeadersConfig build() {
            final var _resultValue = new GetOriginRequestPolicyHeadersConfig();
            _resultValue.headerBehavior = headerBehavior;
            _resultValue.headers = headers;
            return _resultValue;
        }
    }
}
