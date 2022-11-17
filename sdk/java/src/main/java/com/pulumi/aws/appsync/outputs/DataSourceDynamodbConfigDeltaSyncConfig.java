// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceDynamodbConfigDeltaSyncConfig {
    private @Nullable Integer baseTableTtl;
    private String deltaSyncTableName;
    private @Nullable Integer deltaSyncTableTtl;

    private DataSourceDynamodbConfigDeltaSyncConfig() {}
    public Optional<Integer> baseTableTtl() {
        return Optional.ofNullable(this.baseTableTtl);
    }
    public String deltaSyncTableName() {
        return this.deltaSyncTableName;
    }
    public Optional<Integer> deltaSyncTableTtl() {
        return Optional.ofNullable(this.deltaSyncTableTtl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfigDeltaSyncConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer baseTableTtl;
        private String deltaSyncTableName;
        private @Nullable Integer deltaSyncTableTtl;
        public Builder() {}
        public Builder(DataSourceDynamodbConfigDeltaSyncConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseTableTtl = defaults.baseTableTtl;
    	      this.deltaSyncTableName = defaults.deltaSyncTableName;
    	      this.deltaSyncTableTtl = defaults.deltaSyncTableTtl;
        }

        @CustomType.Setter
        public Builder baseTableTtl(@Nullable Integer baseTableTtl) {
            this.baseTableTtl = baseTableTtl;
            return this;
        }
        @CustomType.Setter
        public Builder deltaSyncTableName(String deltaSyncTableName) {
            this.deltaSyncTableName = Objects.requireNonNull(deltaSyncTableName);
            return this;
        }
        @CustomType.Setter
        public Builder deltaSyncTableTtl(@Nullable Integer deltaSyncTableTtl) {
            this.deltaSyncTableTtl = deltaSyncTableTtl;
            return this;
        }
        public DataSourceDynamodbConfigDeltaSyncConfig build() {
            final var o = new DataSourceDynamodbConfigDeltaSyncConfig();
            o.baseTableTtl = baseTableTtl;
            o.deltaSyncTableName = deltaSyncTableName;
            o.deltaSyncTableTtl = deltaSyncTableTtl;
            return o;
        }
    }
}