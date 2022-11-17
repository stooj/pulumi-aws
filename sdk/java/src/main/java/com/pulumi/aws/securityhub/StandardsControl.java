// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.StandardsControlArgs;
import com.pulumi.aws.securityhub.inputs.StandardsControlState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Disable/enable Security Hub standards control in the current region.
 * 
 * The `aws.securityhub.StandardsControl` behaves differently from normal resources, in that
 * The provider does not _create_ this resource, but instead &#34;adopts&#34; it
 * into management. When you _delete_ this resource configuration, the provider &#34;abandons&#34; resource as is and just removes it from the state.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.Account;
 * import com.pulumi.aws.securityhub.StandardsSubscription;
 * import com.pulumi.aws.securityhub.StandardsSubscriptionArgs;
 * import com.pulumi.aws.securityhub.StandardsControl;
 * import com.pulumi.aws.securityhub.StandardsControlArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var example = new Account(&#34;example&#34;);
 * 
 *         var cisAwsFoundationsBenchmark = new StandardsSubscription(&#34;cisAwsFoundationsBenchmark&#34;, StandardsSubscriptionArgs.builder()        
 *             .standardsArn(&#34;arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(example)
 *                 .build());
 * 
 *         var ensureIamPasswordPolicyPreventsPasswordReuse = new StandardsControl(&#34;ensureIamPasswordPolicyPreventsPasswordReuse&#34;, StandardsControlArgs.builder()        
 *             .standardsControlArn(&#34;arn:aws:securityhub:us-east-1:111111111111:control/cis-aws-foundations-benchmark/v/1.2.0/1.10&#34;)
 *             .controlStatus(&#34;DISABLED&#34;)
 *             .disabledReason(&#34;We handle password policies within Okta&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(cisAwsFoundationsBenchmark)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/standardsControl:StandardsControl")
public class StandardsControl extends com.pulumi.resources.CustomResource {
    /**
     * The identifier of the security standard control.
     * 
     */
    @Export(name="controlId", type=String.class, parameters={})
    private Output<String> controlId;

    /**
     * @return The identifier of the security standard control.
     * 
     */
    public Output<String> controlId() {
        return this.controlId;
    }
    /**
     * The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    @Export(name="controlStatus", type=String.class, parameters={})
    private Output<String> controlStatus;

    /**
     * @return The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    public Output<String> controlStatus() {
        return this.controlStatus;
    }
    /**
     * The date and time that the status of the security standard control was most recently updated.
     * 
     */
    @Export(name="controlStatusUpdatedAt", type=String.class, parameters={})
    private Output<String> controlStatusUpdatedAt;

    /**
     * @return The date and time that the status of the security standard control was most recently updated.
     * 
     */
    public Output<String> controlStatusUpdatedAt() {
        return this.controlStatusUpdatedAt;
    }
    /**
     * The standard control longer description. Provides information about what the control is checking for.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The standard control longer description. Provides information about what the control is checking for.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    @Export(name="disabledReason", type=String.class, parameters={})
    private Output<String> disabledReason;

    /**
     * @return A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    public Output<String> disabledReason() {
        return this.disabledReason;
    }
    /**
     * The list of requirements that are related to this control.
     * 
     */
    @Export(name="relatedRequirements", type=List.class, parameters={String.class})
    private Output<List<String>> relatedRequirements;

    /**
     * @return The list of requirements that are related to this control.
     * 
     */
    public Output<List<String>> relatedRequirements() {
        return this.relatedRequirements;
    }
    /**
     * A link to remediation information for the control in the Security Hub user documentation.
     * 
     */
    @Export(name="remediationUrl", type=String.class, parameters={})
    private Output<String> remediationUrl;

    /**
     * @return A link to remediation information for the control in the Security Hub user documentation.
     * 
     */
    public Output<String> remediationUrl() {
        return this.remediationUrl;
    }
    /**
     * The severity of findings generated from this security standard control.
     * 
     */
    @Export(name="severityRating", type=String.class, parameters={})
    private Output<String> severityRating;

    /**
     * @return The severity of findings generated from this security standard control.
     * 
     */
    public Output<String> severityRating() {
        return this.severityRating;
    }
    /**
     * The standards control ARN.
     * 
     */
    @Export(name="standardsControlArn", type=String.class, parameters={})
    private Output<String> standardsControlArn;

    /**
     * @return The standards control ARN.
     * 
     */
    public Output<String> standardsControlArn() {
        return this.standardsControlArn;
    }
    /**
     * The standard control title.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return The standard control title.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StandardsControl(String name) {
        this(name, StandardsControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StandardsControl(String name, StandardsControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StandardsControl(String name, StandardsControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/standardsControl:StandardsControl", name, args == null ? StandardsControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StandardsControl(String name, Output<String> id, @Nullable StandardsControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/standardsControl:StandardsControl", name, state, makeResourceOptions(options, id));
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
    public static StandardsControl get(String name, Output<String> id, @Nullable StandardsControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StandardsControl(name, id, state, options);
    }
}