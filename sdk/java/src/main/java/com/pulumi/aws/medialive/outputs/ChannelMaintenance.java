// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ChannelMaintenance {
    /**
     * @return The day of the week to use for maintenance.
     * 
     */
    private String maintenanceDay;
    /**
     * @return The hour maintenance will start.
     * 
     */
    private String maintenanceStartTime;

    private ChannelMaintenance() {}
    /**
     * @return The day of the week to use for maintenance.
     * 
     */
    public String maintenanceDay() {
        return this.maintenanceDay;
    }
    /**
     * @return The hour maintenance will start.
     * 
     */
    public String maintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelMaintenance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maintenanceDay;
        private String maintenanceStartTime;
        public Builder() {}
        public Builder(ChannelMaintenance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintenanceDay = defaults.maintenanceDay;
    	      this.maintenanceStartTime = defaults.maintenanceStartTime;
        }

        @CustomType.Setter
        public Builder maintenanceDay(String maintenanceDay) {
            this.maintenanceDay = Objects.requireNonNull(maintenanceDay);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceStartTime(String maintenanceStartTime) {
            this.maintenanceStartTime = Objects.requireNonNull(maintenanceStartTime);
            return this;
        }
        public ChannelMaintenance build() {
            final var o = new ChannelMaintenance();
            o.maintenanceDay = maintenanceDay;
            o.maintenanceStartTime = maintenanceStartTime;
            return o;
        }
    }
}