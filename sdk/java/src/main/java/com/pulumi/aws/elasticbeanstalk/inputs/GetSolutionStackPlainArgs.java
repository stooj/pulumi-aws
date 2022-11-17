// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSolutionStackPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSolutionStackPlainArgs Empty = new GetSolutionStackPlainArgs();

    /**
     * If more than one result is returned, use the most
     * recent solution stack.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return If more than one result is returned, use the most
     * recent solution stack.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * Regex string to apply to the solution stack list returned
     * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
     * AWS documentation for reference solution stack names.
     * 
     */
    @Import(name="nameRegex", required=true)
    private String nameRegex;

    /**
     * @return Regex string to apply to the solution stack list returned
     * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
     * AWS documentation for reference solution stack names.
     * 
     */
    public String nameRegex() {
        return this.nameRegex;
    }

    private GetSolutionStackPlainArgs() {}

    private GetSolutionStackPlainArgs(GetSolutionStackPlainArgs $) {
        this.mostRecent = $.mostRecent;
        this.nameRegex = $.nameRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSolutionStackPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSolutionStackPlainArgs $;

        public Builder() {
            $ = new GetSolutionStackPlainArgs();
        }

        public Builder(GetSolutionStackPlainArgs defaults) {
            $ = new GetSolutionStackPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most
         * recent solution stack.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param nameRegex Regex string to apply to the solution stack list returned
         * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
         * AWS documentation for reference solution stack names.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public GetSolutionStackPlainArgs build() {
            $.nameRegex = Objects.requireNonNull($.nameRegex, "expected parameter 'nameRegex' to be non-null");
            return $;
        }
    }

}