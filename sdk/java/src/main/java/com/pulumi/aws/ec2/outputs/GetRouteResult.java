// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteResult {
    private String carrierGatewayId;
    private String coreNetworkArn;
    private String destinationCidrBlock;
    private String destinationIpv6CidrBlock;
    private String destinationPrefixListId;
    private String egressOnlyGatewayId;
    private String gatewayId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    private String localGatewayId;
    private String natGatewayId;
    private String networkInterfaceId;
    private String routeTableId;
    private String transitGatewayId;
    private String vpcPeeringConnectionId;

    private GetRouteResult() {}
    public String carrierGatewayId() {
        return this.carrierGatewayId;
    }
    public String coreNetworkArn() {
        return this.coreNetworkArn;
    }
    public String destinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    public String destinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock;
    }
    public String destinationPrefixListId() {
        return this.destinationPrefixListId;
    }
    public String egressOnlyGatewayId() {
        return this.egressOnlyGatewayId;
    }
    public String gatewayId() {
        return this.gatewayId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public String localGatewayId() {
        return this.localGatewayId;
    }
    public String natGatewayId() {
        return this.natGatewayId;
    }
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    public String routeTableId() {
        return this.routeTableId;
    }
    public String transitGatewayId() {
        return this.transitGatewayId;
    }
    public String vpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String carrierGatewayId;
        private String coreNetworkArn;
        private String destinationCidrBlock;
        private String destinationIpv6CidrBlock;
        private String destinationPrefixListId;
        private String egressOnlyGatewayId;
        private String gatewayId;
        private String id;
        private String instanceId;
        private String localGatewayId;
        private String natGatewayId;
        private String networkInterfaceId;
        private String routeTableId;
        private String transitGatewayId;
        private String vpcPeeringConnectionId;
        public Builder() {}
        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
    	      this.coreNetworkArn = defaults.coreNetworkArn;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationIpv6CidrBlock = defaults.destinationIpv6CidrBlock;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyGatewayId = defaults.egressOnlyGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        @CustomType.Setter
        public Builder carrierGatewayId(String carrierGatewayId) {
            this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder coreNetworkArn(String coreNetworkArn) {
            this.coreNetworkArn = Objects.requireNonNull(coreNetworkArn);
            return this;
        }
        @CustomType.Setter
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder destinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
            this.destinationIpv6CidrBlock = Objects.requireNonNull(destinationIpv6CidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder destinationPrefixListId(String destinationPrefixListId) {
            this.destinationPrefixListId = Objects.requireNonNull(destinationPrefixListId);
            return this;
        }
        @CustomType.Setter
        public Builder egressOnlyGatewayId(String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = Objects.requireNonNull(egressOnlyGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcPeeringConnectionId(String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
            return this;
        }
        public GetRouteResult build() {
            final var o = new GetRouteResult();
            o.carrierGatewayId = carrierGatewayId;
            o.coreNetworkArn = coreNetworkArn;
            o.destinationCidrBlock = destinationCidrBlock;
            o.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
            o.destinationPrefixListId = destinationPrefixListId;
            o.egressOnlyGatewayId = egressOnlyGatewayId;
            o.gatewayId = gatewayId;
            o.id = id;
            o.instanceId = instanceId;
            o.localGatewayId = localGatewayId;
            o.natGatewayId = natGatewayId;
            o.networkInterfaceId = networkInterfaceId;
            o.routeTableId = routeTableId;
            o.transitGatewayId = transitGatewayId;
            o.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return o;
        }
    }
}