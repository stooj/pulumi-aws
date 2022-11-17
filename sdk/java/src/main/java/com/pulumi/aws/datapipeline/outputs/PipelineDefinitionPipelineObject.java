// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.aws.datapipeline.outputs.PipelineDefinitionPipelineObjectField;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PipelineDefinitionPipelineObject {
    /**
     * @return Configuration block for Key-value pairs that define the properties of the object. See below
     * 
     */
    private @Nullable List<PipelineDefinitionPipelineObjectField> fields;
    /**
     * @return ID of the parameter value.
     * 
     */
    private String id;
    /**
     * @return ARN of the storage connector.
     * 
     */
    private String name;

    private PipelineDefinitionPipelineObject() {}
    /**
     * @return Configuration block for Key-value pairs that define the properties of the object. See below
     * 
     */
    public List<PipelineDefinitionPipelineObjectField> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * @return ID of the parameter value.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ARN of the storage connector.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionPipelineObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PipelineDefinitionPipelineObjectField> fields;
        private String id;
        private String name;
        public Builder() {}
        public Builder(PipelineDefinitionPipelineObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder fields(@Nullable List<PipelineDefinitionPipelineObjectField> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(PipelineDefinitionPipelineObjectField... fields) {
            return fields(List.of(fields));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PipelineDefinitionPipelineObject build() {
            final var o = new PipelineDefinitionPipelineObject();
            o.fields = fields;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}