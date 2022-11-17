// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementAcceleratorCount;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementMemoryMib;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementNetworkInterfaceCount;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementTotalLocalStorageGb;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementVcpuCount;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateInstanceRequirement {
    private List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts;
    private List<String> acceleratorManufacturers;
    private List<String> acceleratorNames;
    private List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs;
    private List<String> acceleratorTypes;
    private String bareMetal;
    private List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps;
    private String burstablePerformance;
    private List<String> cpuManufacturers;
    private List<String> excludedInstanceTypes;
    private List<String> instanceGenerations;
    private String localStorage;
    private List<String> localStorageTypes;
    private List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus;
    private List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs;
    private List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts;
    private Integer onDemandMaxPricePercentageOverLowestPrice;
    private Boolean requireHibernateSupport;
    private Integer spotMaxPricePercentageOverLowestPrice;
    private List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs;
    private List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts;

    private GetLaunchTemplateInstanceRequirement() {}
    public List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts() {
        return this.acceleratorCounts;
    }
    public List<String> acceleratorManufacturers() {
        return this.acceleratorManufacturers;
    }
    public List<String> acceleratorNames() {
        return this.acceleratorNames;
    }
    public List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs() {
        return this.acceleratorTotalMemoryMibs;
    }
    public List<String> acceleratorTypes() {
        return this.acceleratorTypes;
    }
    public String bareMetal() {
        return this.bareMetal;
    }
    public List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps;
    }
    public String burstablePerformance() {
        return this.burstablePerformance;
    }
    public List<String> cpuManufacturers() {
        return this.cpuManufacturers;
    }
    public List<String> excludedInstanceTypes() {
        return this.excludedInstanceTypes;
    }
    public List<String> instanceGenerations() {
        return this.instanceGenerations;
    }
    public String localStorage() {
        return this.localStorage;
    }
    public List<String> localStorageTypes() {
        return this.localStorageTypes;
    }
    public List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus() {
        return this.memoryGibPerVcpus;
    }
    public List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs() {
        return this.memoryMibs;
    }
    public List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts() {
        return this.networkInterfaceCounts;
    }
    public Integer onDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice;
    }
    public Boolean requireHibernateSupport() {
        return this.requireHibernateSupport;
    }
    public Integer spotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice;
    }
    public List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs() {
        return this.totalLocalStorageGbs;
    }
    public List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts() {
        return this.vcpuCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateInstanceRequirement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts;
        private List<String> acceleratorManufacturers;
        private List<String> acceleratorNames;
        private List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs;
        private List<String> acceleratorTypes;
        private String bareMetal;
        private List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps;
        private String burstablePerformance;
        private List<String> cpuManufacturers;
        private List<String> excludedInstanceTypes;
        private List<String> instanceGenerations;
        private String localStorage;
        private List<String> localStorageTypes;
        private List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus;
        private List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs;
        private List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts;
        private Integer onDemandMaxPricePercentageOverLowestPrice;
        private Boolean requireHibernateSupport;
        private Integer spotMaxPricePercentageOverLowestPrice;
        private List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs;
        private List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts;
        public Builder() {}
        public Builder(GetLaunchTemplateInstanceRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCounts = defaults.acceleratorCounts;
    	      this.acceleratorManufacturers = defaults.acceleratorManufacturers;
    	      this.acceleratorNames = defaults.acceleratorNames;
    	      this.acceleratorTotalMemoryMibs = defaults.acceleratorTotalMemoryMibs;
    	      this.acceleratorTypes = defaults.acceleratorTypes;
    	      this.bareMetal = defaults.bareMetal;
    	      this.baselineEbsBandwidthMbps = defaults.baselineEbsBandwidthMbps;
    	      this.burstablePerformance = defaults.burstablePerformance;
    	      this.cpuManufacturers = defaults.cpuManufacturers;
    	      this.excludedInstanceTypes = defaults.excludedInstanceTypes;
    	      this.instanceGenerations = defaults.instanceGenerations;
    	      this.localStorage = defaults.localStorage;
    	      this.localStorageTypes = defaults.localStorageTypes;
    	      this.memoryGibPerVcpus = defaults.memoryGibPerVcpus;
    	      this.memoryMibs = defaults.memoryMibs;
    	      this.networkInterfaceCounts = defaults.networkInterfaceCounts;
    	      this.onDemandMaxPricePercentageOverLowestPrice = defaults.onDemandMaxPricePercentageOverLowestPrice;
    	      this.requireHibernateSupport = defaults.requireHibernateSupport;
    	      this.spotMaxPricePercentageOverLowestPrice = defaults.spotMaxPricePercentageOverLowestPrice;
    	      this.totalLocalStorageGbs = defaults.totalLocalStorageGbs;
    	      this.vcpuCounts = defaults.vcpuCounts;
        }

        @CustomType.Setter
        public Builder acceleratorCounts(List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts) {
            this.acceleratorCounts = Objects.requireNonNull(acceleratorCounts);
            return this;
        }
        public Builder acceleratorCounts(GetLaunchTemplateInstanceRequirementAcceleratorCount... acceleratorCounts) {
            return acceleratorCounts(List.of(acceleratorCounts));
        }
        @CustomType.Setter
        public Builder acceleratorManufacturers(List<String> acceleratorManufacturers) {
            this.acceleratorManufacturers = Objects.requireNonNull(acceleratorManufacturers);
            return this;
        }
        public Builder acceleratorManufacturers(String... acceleratorManufacturers) {
            return acceleratorManufacturers(List.of(acceleratorManufacturers));
        }
        @CustomType.Setter
        public Builder acceleratorNames(List<String> acceleratorNames) {
            this.acceleratorNames = Objects.requireNonNull(acceleratorNames);
            return this;
        }
        public Builder acceleratorNames(String... acceleratorNames) {
            return acceleratorNames(List.of(acceleratorNames));
        }
        @CustomType.Setter
        public Builder acceleratorTotalMemoryMibs(List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs) {
            this.acceleratorTotalMemoryMibs = Objects.requireNonNull(acceleratorTotalMemoryMibs);
            return this;
        }
        public Builder acceleratorTotalMemoryMibs(GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib... acceleratorTotalMemoryMibs) {
            return acceleratorTotalMemoryMibs(List.of(acceleratorTotalMemoryMibs));
        }
        @CustomType.Setter
        public Builder acceleratorTypes(List<String> acceleratorTypes) {
            this.acceleratorTypes = Objects.requireNonNull(acceleratorTypes);
            return this;
        }
        public Builder acceleratorTypes(String... acceleratorTypes) {
            return acceleratorTypes(List.of(acceleratorTypes));
        }
        @CustomType.Setter
        public Builder bareMetal(String bareMetal) {
            this.bareMetal = Objects.requireNonNull(bareMetal);
            return this;
        }
        @CustomType.Setter
        public Builder baselineEbsBandwidthMbps(List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = Objects.requireNonNull(baselineEbsBandwidthMbps);
            return this;
        }
        public Builder baselineEbsBandwidthMbps(GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp... baselineEbsBandwidthMbps) {
            return baselineEbsBandwidthMbps(List.of(baselineEbsBandwidthMbps));
        }
        @CustomType.Setter
        public Builder burstablePerformance(String burstablePerformance) {
            this.burstablePerformance = Objects.requireNonNull(burstablePerformance);
            return this;
        }
        @CustomType.Setter
        public Builder cpuManufacturers(List<String> cpuManufacturers) {
            this.cpuManufacturers = Objects.requireNonNull(cpuManufacturers);
            return this;
        }
        public Builder cpuManufacturers(String... cpuManufacturers) {
            return cpuManufacturers(List.of(cpuManufacturers));
        }
        @CustomType.Setter
        public Builder excludedInstanceTypes(List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = Objects.requireNonNull(excludedInstanceTypes);
            return this;
        }
        public Builder excludedInstanceTypes(String... excludedInstanceTypes) {
            return excludedInstanceTypes(List.of(excludedInstanceTypes));
        }
        @CustomType.Setter
        public Builder instanceGenerations(List<String> instanceGenerations) {
            this.instanceGenerations = Objects.requireNonNull(instanceGenerations);
            return this;
        }
        public Builder instanceGenerations(String... instanceGenerations) {
            return instanceGenerations(List.of(instanceGenerations));
        }
        @CustomType.Setter
        public Builder localStorage(String localStorage) {
            this.localStorage = Objects.requireNonNull(localStorage);
            return this;
        }
        @CustomType.Setter
        public Builder localStorageTypes(List<String> localStorageTypes) {
            this.localStorageTypes = Objects.requireNonNull(localStorageTypes);
            return this;
        }
        public Builder localStorageTypes(String... localStorageTypes) {
            return localStorageTypes(List.of(localStorageTypes));
        }
        @CustomType.Setter
        public Builder memoryGibPerVcpus(List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus) {
            this.memoryGibPerVcpus = Objects.requireNonNull(memoryGibPerVcpus);
            return this;
        }
        public Builder memoryGibPerVcpus(GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus... memoryGibPerVcpus) {
            return memoryGibPerVcpus(List.of(memoryGibPerVcpus));
        }
        @CustomType.Setter
        public Builder memoryMibs(List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs) {
            this.memoryMibs = Objects.requireNonNull(memoryMibs);
            return this;
        }
        public Builder memoryMibs(GetLaunchTemplateInstanceRequirementMemoryMib... memoryMibs) {
            return memoryMibs(List.of(memoryMibs));
        }
        @CustomType.Setter
        public Builder networkInterfaceCounts(List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts) {
            this.networkInterfaceCounts = Objects.requireNonNull(networkInterfaceCounts);
            return this;
        }
        public Builder networkInterfaceCounts(GetLaunchTemplateInstanceRequirementNetworkInterfaceCount... networkInterfaceCounts) {
            return networkInterfaceCounts(List.of(networkInterfaceCounts));
        }
        @CustomType.Setter
        public Builder onDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = Objects.requireNonNull(onDemandMaxPricePercentageOverLowestPrice);
            return this;
        }
        @CustomType.Setter
        public Builder requireHibernateSupport(Boolean requireHibernateSupport) {
            this.requireHibernateSupport = Objects.requireNonNull(requireHibernateSupport);
            return this;
        }
        @CustomType.Setter
        public Builder spotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = Objects.requireNonNull(spotMaxPricePercentageOverLowestPrice);
            return this;
        }
        @CustomType.Setter
        public Builder totalLocalStorageGbs(List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs) {
            this.totalLocalStorageGbs = Objects.requireNonNull(totalLocalStorageGbs);
            return this;
        }
        public Builder totalLocalStorageGbs(GetLaunchTemplateInstanceRequirementTotalLocalStorageGb... totalLocalStorageGbs) {
            return totalLocalStorageGbs(List.of(totalLocalStorageGbs));
        }
        @CustomType.Setter
        public Builder vcpuCounts(List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts) {
            this.vcpuCounts = Objects.requireNonNull(vcpuCounts);
            return this;
        }
        public Builder vcpuCounts(GetLaunchTemplateInstanceRequirementVcpuCount... vcpuCounts) {
            return vcpuCounts(List.of(vcpuCounts));
        }
        public GetLaunchTemplateInstanceRequirement build() {
            final var o = new GetLaunchTemplateInstanceRequirement();
            o.acceleratorCounts = acceleratorCounts;
            o.acceleratorManufacturers = acceleratorManufacturers;
            o.acceleratorNames = acceleratorNames;
            o.acceleratorTotalMemoryMibs = acceleratorTotalMemoryMibs;
            o.acceleratorTypes = acceleratorTypes;
            o.bareMetal = bareMetal;
            o.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            o.burstablePerformance = burstablePerformance;
            o.cpuManufacturers = cpuManufacturers;
            o.excludedInstanceTypes = excludedInstanceTypes;
            o.instanceGenerations = instanceGenerations;
            o.localStorage = localStorage;
            o.localStorageTypes = localStorageTypes;
            o.memoryGibPerVcpus = memoryGibPerVcpus;
            o.memoryMibs = memoryMibs;
            o.networkInterfaceCounts = networkInterfaceCounts;
            o.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            o.requireHibernateSupport = requireHibernateSupport;
            o.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            o.totalLocalStorageGbs = totalLocalStorageGbs;
            o.vcpuCounts = vcpuCounts;
            return o;
        }
    }
}