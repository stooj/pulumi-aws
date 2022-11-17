// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cur.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportDefinitionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportDefinitionPlainArgs Empty = new GetReportDefinitionPlainArgs();

    /**
     * Name of the report definition to match.
     * 
     */
    @Import(name="reportName", required=true)
    private String reportName;

    /**
     * @return Name of the report definition to match.
     * 
     */
    public String reportName() {
        return this.reportName;
    }

    private GetReportDefinitionPlainArgs() {}

    private GetReportDefinitionPlainArgs(GetReportDefinitionPlainArgs $) {
        this.reportName = $.reportName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportDefinitionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportDefinitionPlainArgs $;

        public Builder() {
            $ = new GetReportDefinitionPlainArgs();
        }

        public Builder(GetReportDefinitionPlainArgs defaults) {
            $ = new GetReportDefinitionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reportName Name of the report definition to match.
         * 
         * @return builder
         * 
         */
        public Builder reportName(String reportName) {
            $.reportName = reportName;
            return this;
        }

        public GetReportDefinitionPlainArgs build() {
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            return $;
        }
    }

}