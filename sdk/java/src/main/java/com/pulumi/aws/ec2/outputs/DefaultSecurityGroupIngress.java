// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefaultSecurityGroupIngress {
    private @Nullable List<String> cidrBlocks;
    /**
     * @return Description of the security group.
     * 
     */
    private @Nullable String description;
    private Integer fromPort;
    private @Nullable List<String> ipv6CidrBlocks;
    private @Nullable List<String> prefixListIds;
    private String protocol;
    private @Nullable List<String> securityGroups;
    private @Nullable Boolean self;
    private Integer toPort;

    private DefaultSecurityGroupIngress() {}
    public List<String> cidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }
    /**
     * @return Description of the security group.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Integer fromPort() {
        return this.fromPort;
    }
    public List<String> ipv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? List.of() : this.ipv6CidrBlocks;
    }
    public List<String> prefixListIds() {
        return this.prefixListIds == null ? List.of() : this.prefixListIds;
    }
    public String protocol() {
        return this.protocol;
    }
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    public Optional<Boolean> self() {
        return Optional.ofNullable(this.self);
    }
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityGroupIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cidrBlocks;
        private @Nullable String description;
        private Integer fromPort;
        private @Nullable List<String> ipv6CidrBlocks;
        private @Nullable List<String> prefixListIds;
        private String protocol;
        private @Nullable List<String> securityGroups;
        private @Nullable Boolean self;
        private Integer toPort;
        public Builder() {}
        public Builder(DefaultSecurityGroupIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroups = defaults.securityGroups;
    	      this.self = defaults.self;
    	      this.toPort = defaults.toPort;
        }

        @CustomType.Setter
        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {

            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder fromPort(Integer fromPort) {
            if (fromPort == null) {
              throw new MissingRequiredPropertyException("DefaultSecurityGroupIngress", "fromPort");
            }
            this.fromPort = fromPort;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {

            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }
        @CustomType.Setter
        public Builder prefixListIds(@Nullable List<String> prefixListIds) {

            this.prefixListIds = prefixListIds;
            return this;
        }
        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("DefaultSecurityGroupIngress", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {

            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder self(@Nullable Boolean self) {

            this.self = self;
            return this;
        }
        @CustomType.Setter
        public Builder toPort(Integer toPort) {
            if (toPort == null) {
              throw new MissingRequiredPropertyException("DefaultSecurityGroupIngress", "toPort");
            }
            this.toPort = toPort;
            return this;
        }
        public DefaultSecurityGroupIngress build() {
            final var _resultValue = new DefaultSecurityGroupIngress();
            _resultValue.cidrBlocks = cidrBlocks;
            _resultValue.description = description;
            _resultValue.fromPort = fromPort;
            _resultValue.ipv6CidrBlocks = ipv6CidrBlocks;
            _resultValue.prefixListIds = prefixListIds;
            _resultValue.protocol = protocol;
            _resultValue.securityGroups = securityGroups;
            _resultValue.self = self;
            _resultValue.toPort = toPort;
            return _resultValue;
        }
    }
}
