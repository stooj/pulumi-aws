// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNameState extends com.pulumi.resources.ResourceArgs {

    public static final DomainNameState Empty = new DomainNameState();

    /**
     * Domain name that AppSync provides.
     * 
     */
    @Import(name="appsyncDomainName")
    private @Nullable Output<String> appsyncDomainName;

    /**
     * @return Domain name that AppSync provides.
     * 
     */
    public Optional<Output<String>> appsyncDomainName() {
        return Optional.ofNullable(this.appsyncDomainName);
    }

    /**
     * ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    /**
     * @return ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
     * 
     */
    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * A description of the Domain Name.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Domain Name.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Domain name.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Domain name.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * ID of your Amazon Route 53 hosted zone.
     * 
     */
    @Import(name="hostedZoneId")
    private @Nullable Output<String> hostedZoneId;

    /**
     * @return ID of your Amazon Route 53 hosted zone.
     * 
     */
    public Optional<Output<String>> hostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }

    private DomainNameState() {}

    private DomainNameState(DomainNameState $) {
        this.appsyncDomainName = $.appsyncDomainName;
        this.certificateArn = $.certificateArn;
        this.description = $.description;
        this.domainName = $.domainName;
        this.hostedZoneId = $.hostedZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainNameState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainNameState $;

        public Builder() {
            $ = new DomainNameState();
        }

        public Builder(DomainNameState defaults) {
            $ = new DomainNameState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appsyncDomainName Domain name that AppSync provides.
         * 
         * @return builder
         * 
         */
        public Builder appsyncDomainName(@Nullable Output<String> appsyncDomainName) {
            $.appsyncDomainName = appsyncDomainName;
            return this;
        }

        /**
         * @param appsyncDomainName Domain name that AppSync provides.
         * 
         * @return builder
         * 
         */
        public Builder appsyncDomainName(String appsyncDomainName) {
            return appsyncDomainName(Output.of(appsyncDomainName));
        }

        /**
         * @param certificateArn ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        /**
         * @param certificateArn ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        /**
         * @param description A description of the Domain Name.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Domain Name.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domainName Domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param hostedZoneId ID of your Amazon Route 53 hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        /**
         * @param hostedZoneId ID of your Amazon Route 53 hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        public DomainNameState build() {
            return $;
        }
    }

}