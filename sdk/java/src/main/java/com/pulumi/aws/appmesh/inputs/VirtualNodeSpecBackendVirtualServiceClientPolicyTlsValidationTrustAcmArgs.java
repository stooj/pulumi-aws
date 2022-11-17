// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs();

    /**
     * One or more ACM ARNs.
     * 
     */
    @Import(name="certificateAuthorityArns", required=true)
    private Output<List<String>> certificateAuthorityArns;

    /**
     * @return One or more ACM ARNs.
     * 
     */
    public Output<List<String>> certificateAuthorityArns() {
        return this.certificateAuthorityArns;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs() {}

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs $) {
        this.certificateAuthorityArns = $.certificateAuthorityArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs();
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs defaults) {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthorityArns One or more ACM ARNs.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArns(Output<List<String>> certificateAuthorityArns) {
            $.certificateAuthorityArns = certificateAuthorityArns;
            return this;
        }

        /**
         * @param certificateAuthorityArns One or more ACM ARNs.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArns(List<String> certificateAuthorityArns) {
            return certificateAuthorityArns(Output.of(certificateAuthorityArns));
        }

        /**
         * @param certificateAuthorityArns One or more ACM ARNs.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArns(String... certificateAuthorityArns) {
            return certificateAuthorityArns(List.of(certificateAuthorityArns));
        }

        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs build() {
            $.certificateAuthorityArns = Objects.requireNonNull($.certificateAuthorityArns, "expected parameter 'certificateAuthorityArns' to be non-null");
            return $;
        }
    }

}