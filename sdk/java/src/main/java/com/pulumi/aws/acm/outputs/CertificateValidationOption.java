// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateValidationOption {
    /**
     * @return Fully qualified domain name (FQDN) in the certificate.
     * 
     */
    private String domainName;
    /**
     * @return Domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the email addresses that you want ACM to use. This must be the same as the `domain_name` value or a superdomain of the `domain_name` value. For example, if you request a certificate for `&#34;testing.example.com&#34;`, you can specify `&#34;example.com&#34;` for this value.
     * 
     */
    private String validationDomain;

    private CertificateValidationOption() {}
    /**
     * @return Fully qualified domain name (FQDN) in the certificate.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return Domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the email addresses that you want ACM to use. This must be the same as the `domain_name` value or a superdomain of the `domain_name` value. For example, if you request a certificate for `&#34;testing.example.com&#34;`, you can specify `&#34;example.com&#34;` for this value.
     * 
     */
    public String validationDomain() {
        return this.validationDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateValidationOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainName;
        private String validationDomain;
        public Builder() {}
        public Builder(CertificateValidationOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.validationDomain = defaults.validationDomain;
        }

        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder validationDomain(String validationDomain) {
            this.validationDomain = Objects.requireNonNull(validationDomain);
            return this;
        }
        public CertificateValidationOption build() {
            final var o = new CertificateValidationOption();
            o.domainName = domainName;
            o.validationDomain = validationDomain;
            return o;
        }
    }
}