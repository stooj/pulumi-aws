// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FilterFindingCriteriaCriterion {
    /**
     * @return List of string values to be evaluated.
     * 
     */
    private @Nullable List<String> equals;
    /**
     * @return The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
     */
    private String field;
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private @Nullable String greaterThan;
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private @Nullable String greaterThanOrEqual;
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private @Nullable String lessThan;
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private @Nullable String lessThanOrEqual;
    /**
     * @return List of string values to be evaluated.
     * 
     */
    private @Nullable List<String> notEquals;

    private FilterFindingCriteriaCriterion() {}
    /**
     * @return List of string values to be evaluated.
     * 
     */
    public List<String> equals_() {
        return this.equals == null ? List.of() : this.equals;
    }
    /**
     * @return The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<String> greaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<String> greaterThanOrEqual() {
        return Optional.ofNullable(this.greaterThanOrEqual);
    }
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<String> lessThan() {
        return Optional.ofNullable(this.lessThan);
    }
    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<String> lessThanOrEqual() {
        return Optional.ofNullable(this.lessThanOrEqual);
    }
    /**
     * @return List of string values to be evaluated.
     * 
     */
    public List<String> notEquals() {
        return this.notEquals == null ? List.of() : this.notEquals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteriaCriterion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> equals;
        private String field;
        private @Nullable String greaterThan;
        private @Nullable String greaterThanOrEqual;
        private @Nullable String lessThan;
        private @Nullable String lessThanOrEqual;
        private @Nullable List<String> notEquals;
        public Builder() {}
        public Builder(FilterFindingCriteriaCriterion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
    	      this.greaterThan = defaults.greaterThan;
    	      this.greaterThanOrEqual = defaults.greaterThanOrEqual;
    	      this.lessThan = defaults.lessThan;
    	      this.lessThanOrEqual = defaults.lessThanOrEqual;
    	      this.notEquals = defaults.notEquals;
        }

        @CustomType.Setter("equals")
        public Builder equals_(@Nullable List<String> equals) {
            this.equals = equals;
            return this;
        }
        public Builder equals_(String... equals) {
            return equals_(List.of(equals));
        }
        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder greaterThan(@Nullable String greaterThan) {
            this.greaterThan = greaterThan;
            return this;
        }
        @CustomType.Setter
        public Builder greaterThanOrEqual(@Nullable String greaterThanOrEqual) {
            this.greaterThanOrEqual = greaterThanOrEqual;
            return this;
        }
        @CustomType.Setter
        public Builder lessThan(@Nullable String lessThan) {
            this.lessThan = lessThan;
            return this;
        }
        @CustomType.Setter
        public Builder lessThanOrEqual(@Nullable String lessThanOrEqual) {
            this.lessThanOrEqual = lessThanOrEqual;
            return this;
        }
        @CustomType.Setter
        public Builder notEquals(@Nullable List<String> notEquals) {
            this.notEquals = notEquals;
            return this;
        }
        public Builder notEquals(String... notEquals) {
            return notEquals(List.of(notEquals));
        }
        public FilterFindingCriteriaCriterion build() {
            final var o = new FilterFindingCriteriaCriterion();
            o.equals = equals;
            o.field = field;
            o.greaterThan = greaterThan;
            o.greaterThanOrEqual = greaterThanOrEqual;
            o.lessThan = lessThan;
            o.lessThanOrEqual = lessThanOrEqual;
            o.notEquals = notEquals;
            return o;
        }
    }
}