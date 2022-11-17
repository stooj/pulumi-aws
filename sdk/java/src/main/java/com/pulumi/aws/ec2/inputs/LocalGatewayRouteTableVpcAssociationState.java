// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalGatewayRouteTableVpcAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final LocalGatewayRouteTableVpcAssociationState Empty = new LocalGatewayRouteTableVpcAssociationState();

    @Import(name="localGatewayId")
    private @Nullable Output<String> localGatewayId;

    public Optional<Output<String>> localGatewayId() {
        return Optional.ofNullable(this.localGatewayId);
    }

    /**
     * Identifier of EC2 Local Gateway Route Table.
     * 
     */
    @Import(name="localGatewayRouteTableId")
    private @Nullable Output<String> localGatewayRouteTableId;

    /**
     * @return Identifier of EC2 Local Gateway Route Table.
     * 
     */
    public Optional<Output<String>> localGatewayRouteTableId() {
        return Optional.ofNullable(this.localGatewayRouteTableId);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Identifier of EC2 VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return Identifier of EC2 VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private LocalGatewayRouteTableVpcAssociationState() {}

    private LocalGatewayRouteTableVpcAssociationState(LocalGatewayRouteTableVpcAssociationState $) {
        this.localGatewayId = $.localGatewayId;
        this.localGatewayRouteTableId = $.localGatewayRouteTableId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalGatewayRouteTableVpcAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalGatewayRouteTableVpcAssociationState $;

        public Builder() {
            $ = new LocalGatewayRouteTableVpcAssociationState();
        }

        public Builder(LocalGatewayRouteTableVpcAssociationState defaults) {
            $ = new LocalGatewayRouteTableVpcAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder localGatewayId(@Nullable Output<String> localGatewayId) {
            $.localGatewayId = localGatewayId;
            return this;
        }

        public Builder localGatewayId(String localGatewayId) {
            return localGatewayId(Output.of(localGatewayId));
        }

        /**
         * @param localGatewayRouteTableId Identifier of EC2 Local Gateway Route Table.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(@Nullable Output<String> localGatewayRouteTableId) {
            $.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        /**
         * @param localGatewayRouteTableId Identifier of EC2 Local Gateway Route Table.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(String localGatewayRouteTableId) {
            return localGatewayRouteTableId(Output.of(localGatewayRouteTableId));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcId Identifier of EC2 VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId Identifier of EC2 VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public LocalGatewayRouteTableVpcAssociationState build() {
            return $;
        }
    }

}