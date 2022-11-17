// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategorySplitChargeRuleParameter {
    /**
     * @return Parameter type.
     * 
     */
    private String type;
    /**
     * @return Parameter values.
     * 
     */
    private List<String> values;

    private GetCostCategorySplitChargeRuleParameter() {}
    /**
     * @return Parameter type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Parameter values.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategorySplitChargeRuleParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private List<String> values;
        public Builder() {}
        public Builder(GetCostCategorySplitChargeRuleParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetCostCategorySplitChargeRuleParameter build() {
            final var o = new GetCostCategorySplitChargeRuleParameter();
            o.type = type;
            o.values = values;
            return o;
        }
    }
}