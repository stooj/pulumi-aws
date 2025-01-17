// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPermissionsTableWithColumns {
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private String catalogId;
    /**
     * @return Set of column names for the table. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    private @Nullable List<String> columnNames;
    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private String databaseName;
    /**
     * @return Set of column names for the table to exclude. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    private @Nullable List<String> excludedColumnNames;
    /**
     * @return Name of the table resource.
     * 
     * The following arguments are optional:
     * 
     */
    private String name;
    private @Nullable Boolean wildcard;

    private GetPermissionsTableWithColumns() {}
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * @return Set of column names for the table. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    public List<String> columnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return Set of column names for the table to exclude. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    public List<String> excludedColumnNames() {
        return this.excludedColumnNames == null ? List.of() : this.excludedColumnNames;
    }
    /**
     * @return Name of the table resource.
     * 
     * The following arguments are optional:
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsTableWithColumns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String catalogId;
        private @Nullable List<String> columnNames;
        private String databaseName;
        private @Nullable List<String> excludedColumnNames;
        private String name;
        private @Nullable Boolean wildcard;
        public Builder() {}
        public Builder(GetPermissionsTableWithColumns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.columnNames = defaults.columnNames;
    	      this.databaseName = defaults.databaseName;
    	      this.excludedColumnNames = defaults.excludedColumnNames;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        @CustomType.Setter
        public Builder catalogId(String catalogId) {
            if (catalogId == null) {
              throw new MissingRequiredPropertyException("GetPermissionsTableWithColumns", "catalogId");
            }
            this.catalogId = catalogId;
            return this;
        }
        @CustomType.Setter
        public Builder columnNames(@Nullable List<String> columnNames) {

            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetPermissionsTableWithColumns", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder excludedColumnNames(@Nullable List<String> excludedColumnNames) {

            this.excludedColumnNames = excludedColumnNames;
            return this;
        }
        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPermissionsTableWithColumns", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder wildcard(@Nullable Boolean wildcard) {

            this.wildcard = wildcard;
            return this;
        }
        public GetPermissionsTableWithColumns build() {
            final var _resultValue = new GetPermissionsTableWithColumns();
            _resultValue.catalogId = catalogId;
            _resultValue.columnNames = columnNames;
            _resultValue.databaseName = databaseName;
            _resultValue.excludedColumnNames = excludedColumnNames;
            _resultValue.name = name;
            _resultValue.wildcard = wildcard;
            return _resultValue;
        }
    }
}
