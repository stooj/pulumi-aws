// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs Empty = new TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs();

    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    @Import(name="toPort", required=true)
    private Output<Integer> toPort;

    public Output<Integer> toPort() {
        return this.toPort;
    }

    private TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs() {}

    private TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs(TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs $) {
        this.fromPort = $.fromPort;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs $;

        public Builder() {
            $ = new TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs();
        }

        public Builder(TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs defaults) {
            $ = new TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        public Builder toPort(Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs build() {
            if ($.fromPort == null) {
                throw new MissingRequiredPropertyException("TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs", "fromPort");
            }
            if ($.toPort == null) {
                throw new MissingRequiredPropertyException("TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs", "toPort");
            }
            return $;
        }
    }

}
