package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.GraphicCardElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "display_device")
class DisplayDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "card_name")
    private String cardName;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "chip_type")
    private String chipType;
    @Column(name = "dac_type")
    private String dacType;
    @Column(name = "device_type")
    private String deviceType;
    @Column(name = "device_key")
    private String deviceKey;
    @Column(name = "display_memory")
    private String displayMemory;
    @Column(name = "dedicated_memory")
    private String dedicatedMemory;
    @Column(name = "shared_memory")
    private String sharedMemory;
    @Column(name = "current_mode")
    private String currentMode;
    @Column(name = "hdr_support")
    private String hdrSupport;
    @Column(name = "driver_name",length = 1200)
    private String driverName;
    @Column(name = "driver_version")
    private String driverVersion;
    @Column(name = "driver_model")
    private String driverModel;
    @Column(name = "driver_date")
    private String driverDate;
    @Column(name = "vendor_id")
    private String vendorId;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "topology")
    private String topology;
    @Column(name = "color_space")
    private String colorSpace;
    @Column(name = "color_primaries")
    private String colorPrimaries;
    @Column(name = "luminance")
    private String luminance;
    @Column(name = "monitor_name")
    private String monitorName;
    @Column(name = "monitor_model")
    private String monitorModel;
    @Column(name = "monitor_id")
    private String monitorId;
    @Column(name = "output_type")
    private String outputType;
    @Column(name = "advanced_color_enabled")
    private String advancedColorEnabled;
    @Column(name = "advanced_color_supported")
    private String advancedColorSupported;
    @Column(name = "pixel_format")
    private String pixelFormat;
    @Column(name = "monitor_max_resolution")
    private String maxResolution;
    @ManyToOne
    private ComputerParameters computer;

    private DisplayDevice(GraphicCardElement graphicCardElement) {
        this.cardName = graphicCardElement.getCardName();
        this.manufacturer = graphicCardElement.getManufacturer();
        this.chipType = graphicCardElement.getChipType();
        this.dacType = graphicCardElement.getDacType();
        this.deviceType = graphicCardElement.getDeviceType();
        this.deviceKey = graphicCardElement.getDeviceKey();
        this.displayMemory = graphicCardElement.getDisplayMemory();
        this.dedicatedMemory = graphicCardElement.getDedicatedMemory();
        this.sharedMemory = graphicCardElement.getSharedMemory();
        this.currentMode = graphicCardElement.getCurrentMode();
        this.hdrSupport = graphicCardElement.getHdrSupport();
        this.topology = graphicCardElement.getTopology();
        this.colorSpace = graphicCardElement.getColorSpace();
        this.colorPrimaries = graphicCardElement.getColorPrimaries();
        this.luminance = graphicCardElement.getLuminance();
        this.monitorName = graphicCardElement.getMonitorName();
        this.monitorModel = graphicCardElement.getMonitorModel();
        this.monitorId = graphicCardElement.getMonitorId();
        this.outputType = graphicCardElement.getOutputType();
        this.advancedColorEnabled = graphicCardElement.getAdvancedColorEnabled();
        this.advancedColorSupported = graphicCardElement.getAdvancedColorSupported();
        this.pixelFormat = graphicCardElement.getPixelFormat();
        this.maxResolution = graphicCardElement.getMaxResolution();
        this.driverDate = graphicCardElement.getDriverDate();
        this.driverModel = graphicCardElement.getDriverModel();
        this.driverName = graphicCardElement.getDriverName();
        this.driverVersion = graphicCardElement.getDriverVersion();
        this.vendorId = graphicCardElement.getVendorId();
        this.deviceId = graphicCardElement.getDeviceId();
    }

    static DisplayDevice of(GraphicCardElement displayDevicesElement) {
        return new DisplayDevice(displayDevicesElement);
    }
}
