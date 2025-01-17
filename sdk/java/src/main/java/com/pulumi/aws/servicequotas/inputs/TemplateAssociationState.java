// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicequotas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final TemplateAssociationState Empty = new TemplateAssociationState();

    @Import(name="skipDestroy")
    private @Nullable Output<Boolean> skipDestroy;

    public Optional<Output<Boolean>> skipDestroy() {
        return Optional.ofNullable(this.skipDestroy);
    }

    /**
     * Association status. Creating this resource will result in an `ASSOCIATED` status, and quota increase requests in the template are automatically applied to new AWS accounts in the organization.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Association status. Creating this resource will result in an `ASSOCIATED` status, and quota increase requests in the template are automatically applied to new AWS accounts in the organization.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private TemplateAssociationState() {}

    private TemplateAssociationState(TemplateAssociationState $) {
        this.skipDestroy = $.skipDestroy;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateAssociationState $;

        public Builder() {
            $ = new TemplateAssociationState();
        }

        public Builder(TemplateAssociationState defaults) {
            $ = new TemplateAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder skipDestroy(@Nullable Output<Boolean> skipDestroy) {
            $.skipDestroy = skipDestroy;
            return this;
        }

        public Builder skipDestroy(Boolean skipDestroy) {
            return skipDestroy(Output.of(skipDestroy));
        }

        /**
         * @param status Association status. Creating this resource will result in an `ASSOCIATED` status, and quota increase requests in the template are automatically applied to new AWS accounts in the organization.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Association status. Creating this resource will result in an `ASSOCIATED` status, and quota increase requests in the template are automatically applied to new AWS accounts in the organization.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public TemplateAssociationState build() {
            return $;
        }
    }

}
