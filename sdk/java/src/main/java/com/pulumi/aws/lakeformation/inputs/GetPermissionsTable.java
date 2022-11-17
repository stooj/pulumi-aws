// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionsTable extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionsTable Empty = new GetPermissionsTable();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId", required=true)
    private String catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Name of the table resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the table resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    @Import(name="wildcard")
    private @Nullable Boolean wildcard;

    /**
     * @return Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    private GetPermissionsTable() {}

    private GetPermissionsTable(GetPermissionsTable $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
        this.name = $.name;
        this.wildcard = $.wildcard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionsTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionsTable $;

        public Builder() {
            $ = new GetPermissionsTable();
        }

        public Builder(GetPermissionsTable defaults) {
            $ = new GetPermissionsTable(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param databaseName Name of the database for the table with columns resource. Unique to the Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param name Name of the table resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param wildcard Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(@Nullable Boolean wildcard) {
            $.wildcard = wildcard;
            return this;
        }

        public GetPermissionsTable build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}