// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride {
    /**
     * @return A list of strings. The list of edges associated with the network function group.
     * 
     */
    private @Nullable List<String> edgeSets;
    /**
     * @return The preferred edge to use.
     * 
     */
    private @Nullable String useEdge;

    private GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride() {}
    /**
     * @return A list of strings. The list of edges associated with the network function group.
     * 
     */
    public List<String> edgeSets() {
        return this.edgeSets == null ? List.of() : this.edgeSets;
    }
    /**
     * @return The preferred edge to use.
     * 
     */
    public Optional<String> useEdge() {
        return Optional.ofNullable(this.useEdge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> edgeSets;
        private @Nullable String useEdge;
        public Builder() {}
        public Builder(GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeSets = defaults.edgeSets;
    	      this.useEdge = defaults.useEdge;
        }

        @CustomType.Setter
        public Builder edgeSets(@Nullable List<String> edgeSets) {

            this.edgeSets = edgeSets;
            return this;
        }
        public Builder edgeSets(String... edgeSets) {
            return edgeSets(List.of(edgeSets));
        }
        @CustomType.Setter
        public Builder useEdge(@Nullable String useEdge) {

            this.useEdge = useEdge;
            return this;
        }
        public GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride build() {
            final var _resultValue = new GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride();
            _resultValue.edgeSets = edgeSets;
            _resultValue.useEdge = useEdge;
            return _resultValue;
        }
    }
}
