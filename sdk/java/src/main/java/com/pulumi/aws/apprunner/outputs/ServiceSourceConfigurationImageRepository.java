// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationImageRepositoryImageConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSourceConfigurationImageRepository {
    /**
     * @return Configuration for running the identified image. See Image Configuration below for more details.
     * 
     */
    private @Nullable ServiceSourceConfigurationImageRepositoryImageConfiguration imageConfiguration;
    /**
     * @return Identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
     * image name format, see Pulling an image in the Amazon ECR User Guide.
     * 
     */
    private String imageIdentifier;
    /**
     * @return Type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
     * 
     */
    private String imageRepositoryType;

    private ServiceSourceConfigurationImageRepository() {}
    /**
     * @return Configuration for running the identified image. See Image Configuration below for more details.
     * 
     */
    public Optional<ServiceSourceConfigurationImageRepositoryImageConfiguration> imageConfiguration() {
        return Optional.ofNullable(this.imageConfiguration);
    }
    /**
     * @return Identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
     * image name format, see Pulling an image in the Amazon ECR User Guide.
     * 
     */
    public String imageIdentifier() {
        return this.imageIdentifier;
    }
    /**
     * @return Type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
     * 
     */
    public String imageRepositoryType() {
        return this.imageRepositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationImageRepository defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceSourceConfigurationImageRepositoryImageConfiguration imageConfiguration;
        private String imageIdentifier;
        private String imageRepositoryType;
        public Builder() {}
        public Builder(ServiceSourceConfigurationImageRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageConfiguration = defaults.imageConfiguration;
    	      this.imageIdentifier = defaults.imageIdentifier;
    	      this.imageRepositoryType = defaults.imageRepositoryType;
        }

        @CustomType.Setter
        public Builder imageConfiguration(@Nullable ServiceSourceConfigurationImageRepositoryImageConfiguration imageConfiguration) {
            this.imageConfiguration = imageConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder imageIdentifier(String imageIdentifier) {
            this.imageIdentifier = Objects.requireNonNull(imageIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder imageRepositoryType(String imageRepositoryType) {
            this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType);
            return this;
        }
        public ServiceSourceConfigurationImageRepository build() {
            final var o = new ServiceSourceConfigurationImageRepository();
            o.imageConfiguration = imageConfiguration;
            o.imageIdentifier = imageIdentifier;
            o.imageRepositoryType = imageRepositoryType;
            return o;
        }
    }
}