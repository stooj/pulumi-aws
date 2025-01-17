// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefaultNetworkAclIngress {
    private String action;
    private @Nullable String cidrBlock;
    private Integer fromPort;
    private @Nullable Integer icmpCode;
    private @Nullable Integer icmpType;
    private @Nullable String ipv6CidrBlock;
    private String protocol;
    private Integer ruleNo;
    private Integer toPort;

    private DefaultNetworkAclIngress() {}
    public String action() {
        return this.action;
    }
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    public Integer fromPort() {
        return this.fromPort;
    }
    public Optional<Integer> icmpCode() {
        return Optional.ofNullable(this.icmpCode);
    }
    public Optional<Integer> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }
    public Optional<String> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }
    public String protocol() {
        return this.protocol;
    }
    public Integer ruleNo() {
        return this.ruleNo;
    }
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultNetworkAclIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String cidrBlock;
        private Integer fromPort;
        private @Nullable Integer icmpCode;
        private @Nullable Integer icmpType;
        private @Nullable String ipv6CidrBlock;
        private String protocol;
        private Integer ruleNo;
        private Integer toPort;
        public Builder() {}
        public Builder(DefaultNetworkAclIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.protocol = defaults.protocol;
    	      this.ruleNo = defaults.ruleNo;
    	      this.toPort = defaults.toPort;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("DefaultNetworkAclIngress", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder cidrBlock(@Nullable String cidrBlock) {

            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder fromPort(Integer fromPort) {
            if (fromPort == null) {
              throw new MissingRequiredPropertyException("DefaultNetworkAclIngress", "fromPort");
            }
            this.fromPort = fromPort;
            return this;
        }
        @CustomType.Setter
        public Builder icmpCode(@Nullable Integer icmpCode) {

            this.icmpCode = icmpCode;
            return this;
        }
        @CustomType.Setter
        public Builder icmpType(@Nullable Integer icmpType) {

            this.icmpType = icmpType;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {

            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("DefaultNetworkAclIngress", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder ruleNo(Integer ruleNo) {
            if (ruleNo == null) {
              throw new MissingRequiredPropertyException("DefaultNetworkAclIngress", "ruleNo");
            }
            this.ruleNo = ruleNo;
            return this;
        }
        @CustomType.Setter
        public Builder toPort(Integer toPort) {
            if (toPort == null) {
              throw new MissingRequiredPropertyException("DefaultNetworkAclIngress", "toPort");
            }
            this.toPort = toPort;
            return this;
        }
        public DefaultNetworkAclIngress build() {
            final var _resultValue = new DefaultNetworkAclIngress();
            _resultValue.action = action;
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.fromPort = fromPort;
            _resultValue.icmpCode = icmpCode;
            _resultValue.icmpType = icmpType;
            _resultValue.ipv6CidrBlock = ipv6CidrBlock;
            _resultValue.protocol = protocol;
            _resultValue.ruleNo = ruleNo;
            _resultValue.toPort = toPort;
            return _resultValue;
        }
    }
}
