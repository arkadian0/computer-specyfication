package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.InputRelatedDeviceUsbElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "usb_device")
class UsbDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="description")
    private String description;
    @Column(name="vendor_id")
    private String vendorId;
    @Column(name="product_id")
    private String productId;
    @Column(name="matching_device_id")
    private String matchingDeviceId;
    @ManyToOne
    private ComputerParameters computer;
    private UsbDevice(InputRelatedDeviceUsbElement inputRelatedDeviceUsbElement) {
        this.description = inputRelatedDeviceUsbElement.getDescription();
        this.vendorId = inputRelatedDeviceUsbElement.getVendorId();
        this.productId = inputRelatedDeviceUsbElement.getProductId();
        this.matchingDeviceId = inputRelatedDeviceUsbElement.getMatchingDeviceId();
    }

    static UsbDevice of(InputRelatedDeviceUsbElement inputRelatedDeviceUsbElement) {
        return new UsbDevice(inputRelatedDeviceUsbElement);
    }
}
