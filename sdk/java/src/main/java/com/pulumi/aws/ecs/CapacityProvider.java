// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.CapacityProviderArgs;
import com.pulumi.aws.ecs.inputs.CapacityProviderState;
import com.pulumi.aws.ecs.outputs.CapacityProviderAutoScalingGroupProvider;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an ECS cluster capacity provider. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
 * 
 * &gt; **NOTE:** Associating an ECS Capacity Provider to an Auto Scaling Group will automatically add the `AmazonECSManaged` tag to the Auto Scaling Group. This tag should be included in the `aws.autoscaling.Group` resource configuration to prevent the provider from removing it in subsequent executions as well as ensuring the `AmazonECSManaged` tag is propagated to all EC2 Instances in the Auto Scaling Group if `min_size` is above 0 on creation. Any EC2 Instances in the Auto Scaling Group without this tag must be manually be updated, otherwise they may cause unexpected scaling behavior and metrics.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.autoscaling.Group;
 * import com.pulumi.aws.autoscaling.GroupArgs;
 * import com.pulumi.aws.autoscaling.inputs.GroupTagArgs;
 * import com.pulumi.aws.ecs.CapacityProvider;
 * import com.pulumi.aws.ecs.CapacityProviderArgs;
 * import com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs;
 * import com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingArgs;
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
 *         var testGroup = new Group(&#34;testGroup&#34;, GroupArgs.builder()        
 *             .tags(GroupTagArgs.builder()
 *                 .key(&#34;AmazonECSManaged&#34;)
 *                 .value(true)
 *                 .propagateAtLaunch(true)
 *                 .build())
 *             .build());
 * 
 *         var testCapacityProvider = new CapacityProvider(&#34;testCapacityProvider&#34;, CapacityProviderArgs.builder()        
 *             .autoScalingGroupProvider(CapacityProviderAutoScalingGroupProviderArgs.builder()
 *                 .autoScalingGroupArn(testGroup.arn())
 *                 .managedTerminationProtection(&#34;ENABLED&#34;)
 *                 .managedScaling(CapacityProviderAutoScalingGroupProviderManagedScalingArgs.builder()
 *                     .maximumScalingStepSize(1000)
 *                     .minimumScalingStepSize(1)
 *                     .status(&#34;ENABLED&#34;)
 *                     .targetCapacity(10)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS Capacity Providers can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecs/capacityProvider:CapacityProvider example example
 * ```
 * 
 */
@ResourceType(type="aws:ecs/capacityProvider:CapacityProvider")
public class CapacityProvider extends com.pulumi.resources.CustomResource {
    /**
     * ARN that identifies the capacity provider.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN that identifies the capacity provider.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    @Export(name="autoScalingGroupProvider", type=CapacityProviderAutoScalingGroupProvider.class, parameters={})
    private Output<CapacityProviderAutoScalingGroupProvider> autoScalingGroupProvider;

    /**
     * @return Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    public Output<CapacityProviderAutoScalingGroupProvider> autoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }
    /**
     * Name of the capacity provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the capacity provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityProvider(String name) {
        this(name, CapacityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityProvider(String name, CapacityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityProvider(String name, CapacityProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/capacityProvider:CapacityProvider", name, args == null ? CapacityProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CapacityProvider(String name, Output<String> id, @Nullable CapacityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/capacityProvider:CapacityProvider", name, state, makeResourceOptions(options, id));
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
    public static CapacityProvider get(String name, Output<String> id, @Nullable CapacityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CapacityProvider(name, id, state, options);
    }
}