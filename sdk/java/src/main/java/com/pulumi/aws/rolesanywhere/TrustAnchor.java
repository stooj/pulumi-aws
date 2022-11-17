// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rolesanywhere;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rolesanywhere.TrustAnchorArgs;
import com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState;
import com.pulumi.aws.rolesanywhere.outputs.TrustAnchorSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a Roles Anywhere Trust Anchor.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acmpca.CertificateAuthority;
 * import com.pulumi.aws.acmpca.CertificateAuthorityArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.acmpca.Certificate;
 * import com.pulumi.aws.acmpca.CertificateArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateValidityArgs;
 * import com.pulumi.aws.acmpca.CertificateAuthorityCertificate;
 * import com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs;
 * import com.pulumi.aws.rolesanywhere.TrustAnchor;
 * import com.pulumi.aws.rolesanywhere.TrustAnchorArgs;
 * import com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs;
 * import com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceSourceDataArgs;
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
 *         var exampleCertificateAuthority = new CertificateAuthority(&#34;exampleCertificateAuthority&#34;, CertificateAuthorityArgs.builder()        
 *             .permanentDeletionTimeInDays(7)
 *             .type(&#34;ROOT&#34;)
 *             .certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfigurationArgs.builder()
 *                 .keyAlgorithm(&#34;RSA_4096&#34;)
 *                 .signingAlgorithm(&#34;SHA512WITHRSA&#34;)
 *                 .subject(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.builder()
 *                     .commonName(&#34;example.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var current = AwsFunctions.getPartition();
 * 
 *         var testCertificate = new Certificate(&#34;testCertificate&#34;, CertificateArgs.builder()        
 *             .certificateAuthorityArn(exampleCertificateAuthority.arn())
 *             .certificateSigningRequest(exampleCertificateAuthority.certificateSigningRequest())
 *             .signingAlgorithm(&#34;SHA512WITHRSA&#34;)
 *             .templateArn(String.format(&#34;arn:%s:acm-pca:::template/RootCACertificate/V1&#34;, current.applyValue(getPartitionResult -&gt; getPartitionResult.partition())))
 *             .validity(CertificateValidityArgs.builder()
 *                 .type(&#34;YEARS&#34;)
 *                 .value(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleCertificateAuthorityCertificate = new CertificateAuthorityCertificate(&#34;exampleCertificateAuthorityCertificate&#34;, CertificateAuthorityCertificateArgs.builder()        
 *             .certificateAuthorityArn(exampleCertificateAuthority.arn())
 *             .certificate(aws_acmpca_certificate.example().certificate())
 *             .certificateChain(aws_acmpca_certificate.example().certificate_chain())
 *             .build());
 * 
 *         var testTrustAnchor = new TrustAnchor(&#34;testTrustAnchor&#34;, TrustAnchorArgs.builder()        
 *             .source(TrustAnchorSourceArgs.builder()
 *                 .sourceData(TrustAnchorSourceSourceDataArgs.builder()
 *                     .acmPcaArn(exampleCertificateAuthority.arn())
 *                     .build())
 *                 .sourceType(&#34;AWS_ACM_PCA&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleCertificateAuthorityCertificate)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_rolesanywhere_trust_anchor` can be imported using its `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:rolesanywhere/trustAnchor:TrustAnchor example 92b2fbbb-984d-41a3-a765-e3cbdb69ebb1
 * ```
 * 
 */
@ResourceType(type="aws:rolesanywhere/trustAnchor:TrustAnchor")
public class TrustAnchor extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Trust Anchor
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Trust Anchor
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether or not the Trust Anchor should be enabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether or not the Trust Anchor should be enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The name of the Trust Anchor.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Trust Anchor.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The source of trust, documented below
     * 
     */
    @Export(name="source", type=TrustAnchorSource.class, parameters={})
    private Output<TrustAnchorSource> source;

    /**
     * @return The source of trust, documented below
     * 
     */
    public Output<TrustAnchorSource> source() {
        return this.source;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrustAnchor(String name) {
        this(name, TrustAnchorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrustAnchor(String name, TrustAnchorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrustAnchor(String name, TrustAnchorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rolesanywhere/trustAnchor:TrustAnchor", name, args == null ? TrustAnchorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrustAnchor(String name, Output<String> id, @Nullable TrustAnchorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rolesanywhere/trustAnchor:TrustAnchor", name, state, makeResourceOptions(options, id));
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
    public static TrustAnchor get(String name, Output<String> id, @Nullable TrustAnchorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrustAnchor(name, id, state, options);
    }
}