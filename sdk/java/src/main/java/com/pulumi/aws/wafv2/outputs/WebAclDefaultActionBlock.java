// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclDefaultActionBlockCustomResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclDefaultActionBlock {
    /**
     * @return Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    private @Nullable WebAclDefaultActionBlockCustomResponse customResponse;

    private WebAclDefaultActionBlock() {}
    /**
     * @return Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    public Optional<WebAclDefaultActionBlockCustomResponse> customResponse() {
        return Optional.ofNullable(this.customResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionBlock defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclDefaultActionBlockCustomResponse customResponse;
        public Builder() {}
        public Builder(WebAclDefaultActionBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        @CustomType.Setter
        public Builder customResponse(@Nullable WebAclDefaultActionBlockCustomResponse customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public WebAclDefaultActionBlock build() {
            final var o = new WebAclDefaultActionBlock();
            o.customResponse = customResponse;
            return o;
        }
    }
}