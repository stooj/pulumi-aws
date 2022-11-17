// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.MulticastDomainArgs;
import com.pulumi.aws.ec2transitgateway.inputs.MulticastDomainState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway Multicast Domain.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetAvailabilityZonesArgs;
 * import com.pulumi.aws.ec2.Ec2Functions;
 * import com.pulumi.aws.ec2.inputs.GetAmiArgs;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.ec2.Instance;
 * import com.pulumi.aws.ec2.InstanceArgs;
 * import com.pulumi.aws.ec2transitgateway.TransitGateway;
 * import com.pulumi.aws.ec2transitgateway.TransitGatewayArgs;
 * import com.pulumi.aws.ec2transitgateway.VpcAttachment;
 * import com.pulumi.aws.ec2transitgateway.VpcAttachmentArgs;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomain;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomainArgs;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomainAssociation;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomainAssociationArgs;
 * import com.pulumi.aws.ec2transitgateway.MulticastGroupSource;
 * import com.pulumi.aws.ec2transitgateway.MulticastGroupSourceArgs;
 * import com.pulumi.aws.ec2transitgateway.MulticastGroupMember;
 * import com.pulumi.aws.ec2transitgateway.MulticastGroupMemberArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var available = AwsFunctions.getAvailabilityZones(GetAvailabilityZonesArgs.builder()
 *             .state(&#34;available&#34;)
 *             .build());
 * 
 *         final var amazonLinux = Ec2Functions.getAmi(GetAmiArgs.builder()
 *             .mostRecent(true)
 *             .owners(&#34;amazon&#34;)
 *             .filters(            
 *                 GetAmiFilterArgs.builder()
 *                     .name(&#34;name&#34;)
 *                     .values(&#34;amzn-ami-hvm-*-x86_64-gp2&#34;)
 *                     .build(),
 *                 GetAmiFilterArgs.builder()
 *                     .name(&#34;owner-alias&#34;)
 *                     .values(&#34;amazon&#34;)
 *                     .build())
 *             .build());
 * 
 *         var vpc1 = new Vpc(&#34;vpc1&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var vpc2 = new Vpc(&#34;vpc2&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var subnet1 = new Subnet(&#34;subnet1&#34;, SubnetArgs.builder()        
 *             .vpcId(vpc1.id())
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .availabilityZone(available.applyValue(getAvailabilityZonesResult -&gt; getAvailabilityZonesResult.names()[0]))
 *             .build());
 * 
 *         var subnet2 = new Subnet(&#34;subnet2&#34;, SubnetArgs.builder()        
 *             .vpcId(vpc1.id())
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .availabilityZone(available.applyValue(getAvailabilityZonesResult -&gt; getAvailabilityZonesResult.names()[1]))
 *             .build());
 * 
 *         var subnet3 = new Subnet(&#34;subnet3&#34;, SubnetArgs.builder()        
 *             .vpcId(vpc2.id())
 *             .cidrBlock(&#34;10.1.1.0/24&#34;)
 *             .availabilityZone(available.applyValue(getAvailabilityZonesResult -&gt; getAvailabilityZonesResult.names()[0]))
 *             .build());
 * 
 *         var instance1 = new Instance(&#34;instance1&#34;, InstanceArgs.builder()        
 *             .ami(amazonLinux.applyValue(getAmiResult -&gt; getAmiResult.id()))
 *             .instanceType(&#34;t2.micro&#34;)
 *             .subnetId(subnet1.id())
 *             .build());
 * 
 *         var instance2 = new Instance(&#34;instance2&#34;, InstanceArgs.builder()        
 *             .ami(amazonLinux.applyValue(getAmiResult -&gt; getAmiResult.id()))
 *             .instanceType(&#34;t2.micro&#34;)
 *             .subnetId(subnet2.id())
 *             .build());
 * 
 *         var instance3 = new Instance(&#34;instance3&#34;, InstanceArgs.builder()        
 *             .ami(amazonLinux.applyValue(getAmiResult -&gt; getAmiResult.id()))
 *             .instanceType(&#34;t2.micro&#34;)
 *             .subnetId(subnet3.id())
 *             .build());
 * 
 *         var tgw = new TransitGateway(&#34;tgw&#34;, TransitGatewayArgs.builder()        
 *             .multicastSupport(&#34;enable&#34;)
 *             .build());
 * 
 *         var attachment1 = new VpcAttachment(&#34;attachment1&#34;, VpcAttachmentArgs.builder()        
 *             .subnetIds(            
 *                 subnet1.id(),
 *                 subnet2.id())
 *             .transitGatewayId(tgw.id())
 *             .vpcId(vpc1.id())
 *             .build());
 * 
 *         var attachment2 = new VpcAttachment(&#34;attachment2&#34;, VpcAttachmentArgs.builder()        
 *             .subnetIds(subnet3.id())
 *             .transitGatewayId(tgw.id())
 *             .vpcId(vpc2.id())
 *             .build());
 * 
 *         var domain = new MulticastDomain(&#34;domain&#34;, MulticastDomainArgs.builder()        
 *             .transitGatewayId(tgw.id())
 *             .staticSourcesSupport(&#34;enable&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;Transit_Gateway_Multicast_Domain_Example&#34;))
 *             .build());
 * 
 *         var association3 = new MulticastDomainAssociation(&#34;association3&#34;, MulticastDomainAssociationArgs.builder()        
 *             .subnetId(subnet3.id())
 *             .transitGatewayAttachmentId(attachment2.id())
 *             .transitGatewayMulticastDomainId(domain.id())
 *             .build());
 * 
 *         var source = new MulticastGroupSource(&#34;source&#34;, MulticastGroupSourceArgs.builder()        
 *             .groupIpAddress(&#34;224.0.0.1&#34;)
 *             .networkInterfaceId(instance3.primaryNetworkInterfaceId())
 *             .transitGatewayMulticastDomainId(association3.transitGatewayMulticastDomainId())
 *             .build());
 * 
 *         var association1 = new MulticastDomainAssociation(&#34;association1&#34;, MulticastDomainAssociationArgs.builder()        
 *             .subnetId(subnet1.id())
 *             .transitGatewayAttachmentId(attachment1.id())
 *             .transitGatewayMulticastDomainId(domain.id())
 *             .build());
 * 
 *         var association2 = new MulticastDomainAssociation(&#34;association2&#34;, MulticastDomainAssociationArgs.builder()        
 *             .subnetId(subnet2.id())
 *             .transitGatewayAttachmentId(attachment2.id())
 *             .transitGatewayMulticastDomainId(domain.id())
 *             .build());
 * 
 *         var member1 = new MulticastGroupMember(&#34;member1&#34;, MulticastGroupMemberArgs.builder()        
 *             .groupIpAddress(&#34;224.0.0.1&#34;)
 *             .networkInterfaceId(instance1.primaryNetworkInterfaceId())
 *             .transitGatewayMulticastDomainId(association1.transitGatewayMulticastDomainId())
 *             .build());
 * 
 *         var member2 = new MulticastGroupMember(&#34;member2&#34;, MulticastGroupMemberArgs.builder()        
 *             .groupIpAddress(&#34;224.0.0.1&#34;)
 *             .networkInterfaceId(instance2.primaryNetworkInterfaceId())
 *             .transitGatewayMulticastDomainId(association1.transitGatewayMulticastDomainId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_multicast_domain` can be imported by using the EC2 Transit Gateway Multicast Domain identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/multicastDomain:MulticastDomain example tgw-mcast-domain-12345
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/multicastDomain:MulticastDomain")
public class MulticastDomain extends com.pulumi.resources.CustomResource {
    /**
     * EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="autoAcceptSharedAssociations", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoAcceptSharedAssociations;

    /**
     * @return Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> autoAcceptSharedAssociations() {
        return Codegen.optional(this.autoAcceptSharedAssociations);
    }
    /**
     * Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="igmpv2Support", type=String.class, parameters={})
    private Output</* @Nullable */ String> igmpv2Support;

    /**
     * @return Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> igmpv2Support() {
        return Codegen.optional(this.igmpv2Support);
    }
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="staticSourcesSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> staticSourcesSupport;

    /**
     * @return Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> staticSourcesSupport() {
        return Codegen.optional(this.staticSourcesSupport);
    }
    /**
     * Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
     * 
     */
    @Export(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MulticastDomain(String name) {
        this(name, MulticastDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MulticastDomain(String name, MulticastDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MulticastDomain(String name, MulticastDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/multicastDomain:MulticastDomain", name, args == null ? MulticastDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MulticastDomain(String name, Output<String> id, @Nullable MulticastDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/multicastDomain:MulticastDomain", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MulticastDomain get(String name, Output<String> id, @Nullable MulticastDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MulticastDomain(name, id, state, options);
    }
}