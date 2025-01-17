// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AgentAgentAliasRoutingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentAgentAliasRoutingConfigurationArgs Empty = new AgentAgentAliasRoutingConfigurationArgs();

    /**
     * Version of the agent with which the alias is associated.
     * 
     */
    @Import(name="agentVersion", required=true)
    private Output<String> agentVersion;

    /**
     * @return Version of the agent with which the alias is associated.
     * 
     */
    public Output<String> agentVersion() {
        return this.agentVersion;
    }

    private AgentAgentAliasRoutingConfigurationArgs() {}

    private AgentAgentAliasRoutingConfigurationArgs(AgentAgentAliasRoutingConfigurationArgs $) {
        this.agentVersion = $.agentVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentAgentAliasRoutingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentAgentAliasRoutingConfigurationArgs $;

        public Builder() {
            $ = new AgentAgentAliasRoutingConfigurationArgs();
        }

        public Builder(AgentAgentAliasRoutingConfigurationArgs defaults) {
            $ = new AgentAgentAliasRoutingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentVersion Version of the agent with which the alias is associated.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(Output<String> agentVersion) {
            $.agentVersion = agentVersion;
            return this;
        }

        /**
         * @param agentVersion Version of the agent with which the alias is associated.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(String agentVersion) {
            return agentVersion(Output.of(agentVersion));
        }

        public AgentAgentAliasRoutingConfigurationArgs build() {
            if ($.agentVersion == null) {
                throw new MissingRequiredPropertyException("AgentAgentAliasRoutingConfigurationArgs", "agentVersion");
            }
            return $;
        }
    }

}
