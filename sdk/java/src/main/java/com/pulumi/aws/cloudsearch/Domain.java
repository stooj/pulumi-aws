// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudsearch.DomainArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainState;
import com.pulumi.aws.cloudsearch.outputs.DomainEndpointOptions;
import com.pulumi.aws.cloudsearch.outputs.DomainIndexField;
import com.pulumi.aws.cloudsearch.outputs.DomainScalingParameters;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an CloudSearch domain resource.
 * 
 * The provider waits for the domain to become `Active` when applying a configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudsearch.Domain;
 * import com.pulumi.aws.cloudsearch.DomainArgs;
 * import com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs;
 * import com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs;
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
 *         var example = new Domain(&#34;example&#34;, DomainArgs.builder()        
 *             .indexFields(            
 *                 DomainIndexFieldArgs.builder()
 *                     .analysisScheme(&#34;_en_default_&#34;)
 *                     .highlight(false)
 *                     .name(&#34;headline&#34;)
 *                     .return_(true)
 *                     .search(true)
 *                     .sort(true)
 *                     .type(&#34;text&#34;)
 *                     .build(),
 *                 DomainIndexFieldArgs.builder()
 *                     .facet(true)
 *                     .name(&#34;price&#34;)
 *                     .return_(true)
 *                     .search(true)
 *                     .sort(true)
 *                     .sourceFields(&#34;headline&#34;)
 *                     .type(&#34;double&#34;)
 *                     .build())
 *             .scalingParameters(DomainScalingParametersArgs.builder()
 *                 .desiredInstanceType(&#34;search.medium&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CloudSearch Domains can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudsearch/domain:Domain example example-domain
 * ```
 * 
 */
@ResourceType(type="aws:cloudsearch/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * The domain&#39;s ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The domain&#39;s ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The service endpoint for updating documents in a search domain.
     * 
     */
    @Export(name="documentServiceEndpoint", type=String.class, parameters={})
    private Output<String> documentServiceEndpoint;

    /**
     * @return The service endpoint for updating documents in a search domain.
     * 
     */
    public Output<String> documentServiceEndpoint() {
        return this.documentServiceEndpoint;
    }
    /**
     * An internally generated unique identifier for the domain.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return An internally generated unique identifier for the domain.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }
    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Export(name="endpointOptions", type=DomainEndpointOptions.class, parameters={})
    private Output<DomainEndpointOptions> endpointOptions;

    /**
     * @return Domain endpoint options. Documented below.
     * 
     */
    public Output<DomainEndpointOptions> endpointOptions() {
        return this.endpointOptions;
    }
    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Export(name="indexFields", type=List.class, parameters={DomainIndexField.class})
    private Output</* @Nullable */ List<DomainIndexField>> indexFields;

    /**
     * @return The index fields for documents added to the domain. Documented below.
     * 
     */
    public Output<Optional<List<DomainIndexField>>> indexFields() {
        return Codegen.optional(this.indexFields);
    }
    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Export(name="multiAz", type=Boolean.class, parameters={})
    private Output<Boolean> multiAz;

    /**
     * @return Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    public Output<Boolean> multiAz() {
        return this.multiAz;
    }
    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Export(name="scalingParameters", type=DomainScalingParameters.class, parameters={})
    private Output<DomainScalingParameters> scalingParameters;

    /**
     * @return Domain scaling parameters. Documented below.
     * 
     */
    public Output<DomainScalingParameters> scalingParameters() {
        return this.scalingParameters;
    }
    /**
     * The service endpoint for requesting search results from a search domain.
     * 
     */
    @Export(name="searchServiceEndpoint", type=String.class, parameters={})
    private Output<String> searchServiceEndpoint;

    /**
     * @return The service endpoint for requesting search results from a search domain.
     * 
     */
    public Output<String> searchServiceEndpoint() {
        return this.searchServiceEndpoint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudsearch/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudsearch/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}