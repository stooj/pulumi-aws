// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.ProductPortfolioAssociationArgs;
import com.pulumi.aws.servicecatalog.inputs.ProductPortfolioAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Product Portfolio Association.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.ProductPortfolioAssociation;
 * import com.pulumi.aws.servicecatalog.ProductPortfolioAssociationArgs;
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
 *         var example = new ProductPortfolioAssociation(&#34;example&#34;, ProductPortfolioAssociationArgs.builder()        
 *             .portfolioId(&#34;port-68656c6c6f&#34;)
 *             .productId(&#34;prod-dnigbtea24ste&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_servicecatalog_product_portfolio_association` can be imported using the accept language, portfolio ID, and product ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example en:port-68656c6c6f:prod-dnigbtea24ste
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation")
public class ProductPortfolioAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * Portfolio identifier.
     * 
     */
    @Export(name="portfolioId", type=String.class, parameters={})
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> portfolioId() {
        return this.portfolioId;
    }
    /**
     * Product identifier.
     * 
     */
    @Export(name="productId", type=String.class, parameters={})
    private Output<String> productId;

    /**
     * @return Product identifier.
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }
    /**
     * Identifier of the source portfolio.
     * 
     */
    @Export(name="sourcePortfolioId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourcePortfolioId;

    /**
     * @return Identifier of the source portfolio.
     * 
     */
    public Output<Optional<String>> sourcePortfolioId() {
        return Codegen.optional(this.sourcePortfolioId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProductPortfolioAssociation(String name) {
        this(name, ProductPortfolioAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProductPortfolioAssociation(String name, ProductPortfolioAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProductPortfolioAssociation(String name, ProductPortfolioAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation", name, args == null ? ProductPortfolioAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProductPortfolioAssociation(String name, Output<String> id, @Nullable ProductPortfolioAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation", name, state, makeResourceOptions(options, id));
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
    public static ProductPortfolioAssociation get(String name, Output<String> id, @Nullable ProductPortfolioAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProductPortfolioAssociation(name, id, state, options);
    }
}