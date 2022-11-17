// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.inputs;

import com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs;
import com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs;
import com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfigurationWebCrawlerConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceConfigurationWebCrawlerConfigurationArgs Empty = new DataSourceConfigurationWebCrawlerConfigurationArgs();

    /**
     * A block with the configuration information required to connect to websites using authentication. You can connect to websites using basic authentication of user name and password. You use a secret in AWS Secrets Manager to store your authentication credentials. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Detailed below.
     * 
     */
    @Import(name="authenticationConfiguration")
    private @Nullable Output<DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs> authenticationConfiguration;

    /**
     * @return A block with the configuration information required to connect to websites using authentication. You can connect to websites using basic authentication of user name and password. You use a secret in AWS Secrets Manager to store your authentication credentials. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Detailed below.
     * 
     */
    public Optional<Output<DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs>> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }

    /**
     * Specifies the number of levels in a website that you want to crawl. The first level begins from the website seed or starting point URL. For example, if a website has 3 levels – index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1. The default crawl depth is set to `2`. Minimum value of `0`. Maximum value of `10`.
     * 
     */
    @Import(name="crawlDepth")
    private @Nullable Output<Integer> crawlDepth;

    /**
     * @return Specifies the number of levels in a website that you want to crawl. The first level begins from the website seed or starting point URL. For example, if a website has 3 levels – index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1. The default crawl depth is set to `2`. Minimum value of `0`. Maximum value of `10`.
     * 
     */
    public Optional<Output<Integer>> crawlDepth() {
        return Optional.ofNullable(this.crawlDepth);
    }

    /**
     * The maximum size (in MB) of a webpage or attachment to crawl. Files larger than this size (in MB) are skipped/not crawled. The default maximum size of a webpage or attachment is set to `50` MB. Minimum value of `1.0e-06`. Maximum value of `50`.
     * 
     */
    @Import(name="maxContentSizePerPageInMegaBytes")
    private @Nullable Output<Double> maxContentSizePerPageInMegaBytes;

    /**
     * @return The maximum size (in MB) of a webpage or attachment to crawl. Files larger than this size (in MB) are skipped/not crawled. The default maximum size of a webpage or attachment is set to `50` MB. Minimum value of `1.0e-06`. Maximum value of `50`.
     * 
     */
    public Optional<Output<Double>> maxContentSizePerPageInMegaBytes() {
        return Optional.ofNullable(this.maxContentSizePerPageInMegaBytes);
    }

    /**
     * The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage. As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are crawled in order of appearance. The default maximum links per page is `100`. Minimum value of `1`. Maximum value of `1000`.
     * 
     */
    @Import(name="maxLinksPerPage")
    private @Nullable Output<Integer> maxLinksPerPage;

    /**
     * @return The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage. As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are crawled in order of appearance. The default maximum links per page is `100`. Minimum value of `1`. Maximum value of `1000`.
     * 
     */
    public Optional<Output<Integer>> maxLinksPerPage() {
        return Optional.ofNullable(this.maxLinksPerPage);
    }

    /**
     * The maximum number of URLs crawled per website host per minute. The default maximum number of URLs crawled per website host per minute is `300`. Minimum value of `1`. Maximum value of `300`.
     * 
     */
    @Import(name="maxUrlsPerMinuteCrawlRate")
    private @Nullable Output<Integer> maxUrlsPerMinuteCrawlRate;

    /**
     * @return The maximum number of URLs crawled per website host per minute. The default maximum number of URLs crawled per website host per minute is `300`. Minimum value of `1`. Maximum value of `300`.
     * 
     */
    public Optional<Output<Integer>> maxUrlsPerMinuteCrawlRate() {
        return Optional.ofNullable(this.maxUrlsPerMinuteCrawlRate);
    }

    /**
     * Configuration information required to connect to your internal websites via a web proxy. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication. To store web proxy credentials, you use a secret in [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). Detailed below.
     * 
     */
    @Import(name="proxyConfiguration")
    private @Nullable Output<DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs> proxyConfiguration;

    /**
     * @return Configuration information required to connect to your internal websites via a web proxy. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication. To store web proxy credentials, you use a secret in [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). Detailed below.
     * 
     */
    public Optional<Output<DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs>> proxyConfiguration() {
        return Optional.ofNullable(this.proxyConfiguration);
    }

    /**
     * A list of regular expression patterns to exclude certain URLs to crawl. URLs that match the patterns are excluded from the index. URLs that don&#39;t match the patterns are included in the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
     * 
     */
    @Import(name="urlExclusionPatterns")
    private @Nullable Output<List<String>> urlExclusionPatterns;

    /**
     * @return A list of regular expression patterns to exclude certain URLs to crawl. URLs that match the patterns are excluded from the index. URLs that don&#39;t match the patterns are included in the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
     * 
     */
    public Optional<Output<List<String>>> urlExclusionPatterns() {
        return Optional.ofNullable(this.urlExclusionPatterns);
    }

    /**
     * A list of regular expression patterns to include certain URLs to crawl. URLs that match the patterns are included in the index. URLs that don&#39;t match the patterns are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
     * 
     */
    @Import(name="urlInclusionPatterns")
    private @Nullable Output<List<String>> urlInclusionPatterns;

    /**
     * @return A list of regular expression patterns to include certain URLs to crawl. URLs that match the patterns are included in the index. URLs that don&#39;t match the patterns are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
     * 
     */
    public Optional<Output<List<String>>> urlInclusionPatterns() {
        return Optional.ofNullable(this.urlInclusionPatterns);
    }

    /**
     * A block that specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl. You can include website subdomains. You can list up to `100` seed URLs and up to `3` sitemap URLs. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling. When selecting websites to index, you must adhere to the [Amazon Acceptable Use Policy](https://aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index. Detailed below.
     * 
     */
    @Import(name="urls", required=true)
    private Output<DataSourceConfigurationWebCrawlerConfigurationUrlsArgs> urls;

    /**
     * @return A block that specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl. You can include website subdomains. You can list up to `100` seed URLs and up to `3` sitemap URLs. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling. When selecting websites to index, you must adhere to the [Amazon Acceptable Use Policy](https://aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index. Detailed below.
     * 
     */
    public Output<DataSourceConfigurationWebCrawlerConfigurationUrlsArgs> urls() {
        return this.urls;
    }

    private DataSourceConfigurationWebCrawlerConfigurationArgs() {}

    private DataSourceConfigurationWebCrawlerConfigurationArgs(DataSourceConfigurationWebCrawlerConfigurationArgs $) {
        this.authenticationConfiguration = $.authenticationConfiguration;
        this.crawlDepth = $.crawlDepth;
        this.maxContentSizePerPageInMegaBytes = $.maxContentSizePerPageInMegaBytes;
        this.maxLinksPerPage = $.maxLinksPerPage;
        this.maxUrlsPerMinuteCrawlRate = $.maxUrlsPerMinuteCrawlRate;
        this.proxyConfiguration = $.proxyConfiguration;
        this.urlExclusionPatterns = $.urlExclusionPatterns;
        this.urlInclusionPatterns = $.urlInclusionPatterns;
        this.urls = $.urls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfigurationWebCrawlerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfigurationWebCrawlerConfigurationArgs $;

        public Builder() {
            $ = new DataSourceConfigurationWebCrawlerConfigurationArgs();
        }

        public Builder(DataSourceConfigurationWebCrawlerConfigurationArgs defaults) {
            $ = new DataSourceConfigurationWebCrawlerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationConfiguration A block with the configuration information required to connect to websites using authentication. You can connect to websites using basic authentication of user name and password. You use a secret in AWS Secrets Manager to store your authentication credentials. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder authenticationConfiguration(@Nullable Output<DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs> authenticationConfiguration) {
            $.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        /**
         * @param authenticationConfiguration A block with the configuration information required to connect to websites using authentication. You can connect to websites using basic authentication of user name and password. You use a secret in AWS Secrets Manager to store your authentication credentials. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder authenticationConfiguration(DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs authenticationConfiguration) {
            return authenticationConfiguration(Output.of(authenticationConfiguration));
        }

        /**
         * @param crawlDepth Specifies the number of levels in a website that you want to crawl. The first level begins from the website seed or starting point URL. For example, if a website has 3 levels – index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1. The default crawl depth is set to `2`. Minimum value of `0`. Maximum value of `10`.
         * 
         * @return builder
         * 
         */
        public Builder crawlDepth(@Nullable Output<Integer> crawlDepth) {
            $.crawlDepth = crawlDepth;
            return this;
        }

        /**
         * @param crawlDepth Specifies the number of levels in a website that you want to crawl. The first level begins from the website seed or starting point URL. For example, if a website has 3 levels – index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1. The default crawl depth is set to `2`. Minimum value of `0`. Maximum value of `10`.
         * 
         * @return builder
         * 
         */
        public Builder crawlDepth(Integer crawlDepth) {
            return crawlDepth(Output.of(crawlDepth));
        }

        /**
         * @param maxContentSizePerPageInMegaBytes The maximum size (in MB) of a webpage or attachment to crawl. Files larger than this size (in MB) are skipped/not crawled. The default maximum size of a webpage or attachment is set to `50` MB. Minimum value of `1.0e-06`. Maximum value of `50`.
         * 
         * @return builder
         * 
         */
        public Builder maxContentSizePerPageInMegaBytes(@Nullable Output<Double> maxContentSizePerPageInMegaBytes) {
            $.maxContentSizePerPageInMegaBytes = maxContentSizePerPageInMegaBytes;
            return this;
        }

        /**
         * @param maxContentSizePerPageInMegaBytes The maximum size (in MB) of a webpage or attachment to crawl. Files larger than this size (in MB) are skipped/not crawled. The default maximum size of a webpage or attachment is set to `50` MB. Minimum value of `1.0e-06`. Maximum value of `50`.
         * 
         * @return builder
         * 
         */
        public Builder maxContentSizePerPageInMegaBytes(Double maxContentSizePerPageInMegaBytes) {
            return maxContentSizePerPageInMegaBytes(Output.of(maxContentSizePerPageInMegaBytes));
        }

        /**
         * @param maxLinksPerPage The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage. As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are crawled in order of appearance. The default maximum links per page is `100`. Minimum value of `1`. Maximum value of `1000`.
         * 
         * @return builder
         * 
         */
        public Builder maxLinksPerPage(@Nullable Output<Integer> maxLinksPerPage) {
            $.maxLinksPerPage = maxLinksPerPage;
            return this;
        }

        /**
         * @param maxLinksPerPage The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage. As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are crawled in order of appearance. The default maximum links per page is `100`. Minimum value of `1`. Maximum value of `1000`.
         * 
         * @return builder
         * 
         */
        public Builder maxLinksPerPage(Integer maxLinksPerPage) {
            return maxLinksPerPage(Output.of(maxLinksPerPage));
        }

        /**
         * @param maxUrlsPerMinuteCrawlRate The maximum number of URLs crawled per website host per minute. The default maximum number of URLs crawled per website host per minute is `300`. Minimum value of `1`. Maximum value of `300`.
         * 
         * @return builder
         * 
         */
        public Builder maxUrlsPerMinuteCrawlRate(@Nullable Output<Integer> maxUrlsPerMinuteCrawlRate) {
            $.maxUrlsPerMinuteCrawlRate = maxUrlsPerMinuteCrawlRate;
            return this;
        }

        /**
         * @param maxUrlsPerMinuteCrawlRate The maximum number of URLs crawled per website host per minute. The default maximum number of URLs crawled per website host per minute is `300`. Minimum value of `1`. Maximum value of `300`.
         * 
         * @return builder
         * 
         */
        public Builder maxUrlsPerMinuteCrawlRate(Integer maxUrlsPerMinuteCrawlRate) {
            return maxUrlsPerMinuteCrawlRate(Output.of(maxUrlsPerMinuteCrawlRate));
        }

        /**
         * @param proxyConfiguration Configuration information required to connect to your internal websites via a web proxy. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication. To store web proxy credentials, you use a secret in [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder proxyConfiguration(@Nullable Output<DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs> proxyConfiguration) {
            $.proxyConfiguration = proxyConfiguration;
            return this;
        }

        /**
         * @param proxyConfiguration Configuration information required to connect to your internal websites via a web proxy. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication. To store web proxy credentials, you use a secret in [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder proxyConfiguration(DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs proxyConfiguration) {
            return proxyConfiguration(Output.of(proxyConfiguration));
        }

        /**
         * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs to crawl. URLs that match the patterns are excluded from the index. URLs that don&#39;t match the patterns are included in the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
         * 
         * @return builder
         * 
         */
        public Builder urlExclusionPatterns(@Nullable Output<List<String>> urlExclusionPatterns) {
            $.urlExclusionPatterns = urlExclusionPatterns;
            return this;
        }

        /**
         * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs to crawl. URLs that match the patterns are excluded from the index. URLs that don&#39;t match the patterns are included in the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
         * 
         * @return builder
         * 
         */
        public Builder urlExclusionPatterns(List<String> urlExclusionPatterns) {
            return urlExclusionPatterns(Output.of(urlExclusionPatterns));
        }

        /**
         * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs to crawl. URLs that match the patterns are excluded from the index. URLs that don&#39;t match the patterns are included in the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
         * 
         * @return builder
         * 
         */
        public Builder urlExclusionPatterns(String... urlExclusionPatterns) {
            return urlExclusionPatterns(List.of(urlExclusionPatterns));
        }

        /**
         * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs to crawl. URLs that match the patterns are included in the index. URLs that don&#39;t match the patterns are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
         * 
         * @return builder
         * 
         */
        public Builder urlInclusionPatterns(@Nullable Output<List<String>> urlInclusionPatterns) {
            $.urlInclusionPatterns = urlInclusionPatterns;
            return this;
        }

        /**
         * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs to crawl. URLs that match the patterns are included in the index. URLs that don&#39;t match the patterns are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
         * 
         * @return builder
         * 
         */
        public Builder urlInclusionPatterns(List<String> urlInclusionPatterns) {
            return urlInclusionPatterns(Output.of(urlInclusionPatterns));
        }

        /**
         * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs to crawl. URLs that match the patterns are included in the index. URLs that don&#39;t match the patterns are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn&#39;t included in the index. Array Members: Minimum number of `0` items. Maximum number of `100` items. Length Constraints: Minimum length of `1`. Maximum length of `150`.
         * 
         * @return builder
         * 
         */
        public Builder urlInclusionPatterns(String... urlInclusionPatterns) {
            return urlInclusionPatterns(List.of(urlInclusionPatterns));
        }

        /**
         * @param urls A block that specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl. You can include website subdomains. You can list up to `100` seed URLs and up to `3` sitemap URLs. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling. When selecting websites to index, you must adhere to the [Amazon Acceptable Use Policy](https://aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder urls(Output<DataSourceConfigurationWebCrawlerConfigurationUrlsArgs> urls) {
            $.urls = urls;
            return this;
        }

        /**
         * @param urls A block that specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl. You can include website subdomains. You can list up to `100` seed URLs and up to `3` sitemap URLs. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling. When selecting websites to index, you must adhere to the [Amazon Acceptable Use Policy](https://aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder urls(DataSourceConfigurationWebCrawlerConfigurationUrlsArgs urls) {
            return urls(Output.of(urls));
        }

        public DataSourceConfigurationWebCrawlerConfigurationArgs build() {
            $.urls = Objects.requireNonNull($.urls, "expected parameter 'urls' to be non-null");
            return $;
        }
    }

}