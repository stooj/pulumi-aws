// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationProfileState extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationProfileState Empty = new AuthenticationProfileState();

    /**
     * The content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
     * 
     */
    @Import(name="authenticationProfileContent")
    private @Nullable Output<String> authenticationProfileContent;

    /**
     * @return The content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
     * 
     */
    public Optional<Output<String>> authenticationProfileContent() {
        return Optional.ofNullable(this.authenticationProfileContent);
    }

    /**
     * The name of the authentication profile.
     * 
     */
    @Import(name="authenticationProfileName")
    private @Nullable Output<String> authenticationProfileName;

    /**
     * @return The name of the authentication profile.
     * 
     */
    public Optional<Output<String>> authenticationProfileName() {
        return Optional.ofNullable(this.authenticationProfileName);
    }

    private AuthenticationProfileState() {}

    private AuthenticationProfileState(AuthenticationProfileState $) {
        this.authenticationProfileContent = $.authenticationProfileContent;
        this.authenticationProfileName = $.authenticationProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationProfileState $;

        public Builder() {
            $ = new AuthenticationProfileState();
        }

        public Builder(AuthenticationProfileState defaults) {
            $ = new AuthenticationProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationProfileContent The content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProfileContent(@Nullable Output<String> authenticationProfileContent) {
            $.authenticationProfileContent = authenticationProfileContent;
            return this;
        }

        /**
         * @param authenticationProfileContent The content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProfileContent(String authenticationProfileContent) {
            return authenticationProfileContent(Output.of(authenticationProfileContent));
        }

        /**
         * @param authenticationProfileName The name of the authentication profile.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProfileName(@Nullable Output<String> authenticationProfileName) {
            $.authenticationProfileName = authenticationProfileName;
            return this;
        }

        /**
         * @param authenticationProfileName The name of the authentication profile.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProfileName(String authenticationProfileName) {
            return authenticationProfileName(Output.of(authenticationProfileName));
        }

        public AuthenticationProfileState build() {
            return $;
        }
    }

}
