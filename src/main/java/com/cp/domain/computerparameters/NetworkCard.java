package com.cp.domain.computerparameters;

import com.cp.shared.model.cmd.InstalledApplicationElement;
import com.cp.shared.model.cmd.NetworkCardElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "network_card")
public class NetworkCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="adapter_type")
    private String adapterType;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="caption")
    private String caption;
    @Column(name="installed")
    private String installed;
    @Column(name="install_date")
    private String installDate;
    @Column(name="manufacturer")
    private String manufacturer;
    @Column(name="pnp_device_id")
    private String pnpDeviceId;
    @Column(name="mac_address")
    private String macAddress;
    @Column(name="last_error_code")
    private String lastErrorCode;
    @Column(name="max_speed")
    private String maxSpeed;
    @Column(name="power_management_supported")
    private String powerManagementSupported;
    @Column(name="speed")
    private String speed;
    @Column(name="status")
    private String status;
    @Column(name="net_enabled")
    private String netEnabled;
    @Column(name="net_connection_status")
    private String netConnectionStatus;
    @Column(name="network_addresses")
    private String networkAddresses;
    @Column(name="permanent_address")
    private String permanentAddress;
    @Column(name="product_name")
    private String productName;
    @ManyToOne
    private ComputerParameters computer;

    NetworkCard(NetworkCardElement networkCardElement) {
        this.adapterType = networkCardElement.getAdapterType();
        this.name = networkCardElement.getName();
        this.description = networkCardElement.getDescription();
        this.caption = networkCardElement.getCaption();
        this.installed = networkCardElement.getInstalled();
        this.installDate = networkCardElement.getInstallDate();
        this.manufacturer = networkCardElement.getManufacturer();
        this.pnpDeviceId = networkCardElement.getPnpDeviceId();
        this.macAddress = networkCardElement.getMacAddress();
        this.lastErrorCode = networkCardElement.getLastErrorCode();
        this.maxSpeed = networkCardElement.getMaxSpeed();
        this.powerManagementSupported = networkCardElement.getPowerManagementSupported();
        this.speed = networkCardElement.getSpeed();
        this.status = networkCardElement.getStatus();
        this.netEnabled = networkCardElement.getNetEnabled();
        this.netConnectionStatus = networkCardElement.getNetConnectionStatus();
        this.networkAddresses = networkCardElement.getNetworkAddresses();
        this.permanentAddress = networkCardElement.getPermanentAddress();
        this.productName = networkCardElement.getProductName();
    }

    static NetworkCard of(NetworkCardElement networkCardElement) {
        return new NetworkCard(networkCardElement);
    }
}
