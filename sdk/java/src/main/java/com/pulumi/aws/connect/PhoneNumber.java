// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.PhoneNumberArgs;
import com.pulumi.aws.connect.inputs.PhoneNumberState;
import com.pulumi.aws.connect.outputs.PhoneNumberStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Phone Number resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.PhoneNumber;
 * import com.pulumi.aws.connect.PhoneNumberArgs;
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
 *         var example = new PhoneNumber(&#34;example&#34;, PhoneNumberArgs.builder()        
 *             .targetArn(aws_connect_instance.example().arn())
 *             .countryCode(&#34;US&#34;)
 *             .type(&#34;DID&#34;)
 *             .tags(Map.of(&#34;hello&#34;, &#34;world&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Description
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.PhoneNumber;
 * import com.pulumi.aws.connect.PhoneNumberArgs;
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
 *         var example = new PhoneNumber(&#34;example&#34;, PhoneNumberArgs.builder()        
 *             .targetArn(aws_connect_instance.example().arn())
 *             .countryCode(&#34;US&#34;)
 *             .type(&#34;DID&#34;)
 *             .description(&#34;example description&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Prefix to filter phone numbers
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.PhoneNumber;
 * import com.pulumi.aws.connect.PhoneNumberArgs;
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
 *         var example = new PhoneNumber(&#34;example&#34;, PhoneNumberArgs.builder()        
 *             .targetArn(aws_connect_instance.example().arn())
 *             .countryCode(&#34;US&#34;)
 *             .type(&#34;DID&#34;)
 *             .prefix(&#34;+18005&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amazon Connect Phone Numbers can be imported using its `id` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/phoneNumber:PhoneNumber example 12345678-abcd-1234-efgh-9876543210ab
 * ```
 * 
 */
@ResourceType(type="aws:connect/phoneNumber:PhoneNumber")
public class PhoneNumber extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the phone number.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the phone number.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
     * 
     */
    @Export(name="countryCode", type=String.class, parameters={})
    private Output<String> countryCode;

    /**
     * @return The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
     * 
     */
    public Output<String> countryCode() {
        return this.countryCode;
    }
    /**
     * The description of the phone number.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the phone number.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
     * 
     */
    @Export(name="phoneNumber", type=String.class, parameters={})
    private Output<String> phoneNumber;

    /**
     * @return The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
     * 
     */
    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
     * 
     */
    public Output<Optional<String>> prefix() {
        return Codegen.optional(this.prefix);
    }
    /**
     * The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={PhoneNumberStatus.class})
    private Output<List<PhoneNumberStatus>> statuses;

    /**
     * @return The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
     * 
     */
    public Output<List<PhoneNumberStatus>> statuses() {
        return this.statuses;
    }
    /**
     * Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
     * 
     */
    @Export(name="targetArn", type=String.class, parameters={})
    private Output<String> targetArn;

    /**
     * @return The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
     * 
     */
    public Output<String> targetArn() {
        return this.targetArn;
    }
    /**
     * The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PhoneNumber(String name) {
        this(name, PhoneNumberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PhoneNumber(String name, PhoneNumberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PhoneNumber(String name, PhoneNumberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/phoneNumber:PhoneNumber", name, args == null ? PhoneNumberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PhoneNumber(String name, Output<String> id, @Nullable PhoneNumberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/phoneNumber:PhoneNumber", name, state, makeResourceOptions(options, id));
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
    public static PhoneNumber get(String name, Output<String> id, @Nullable PhoneNumberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PhoneNumber(name, id, state, options);
    }
}