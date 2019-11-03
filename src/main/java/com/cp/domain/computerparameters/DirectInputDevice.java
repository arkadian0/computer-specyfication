package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.DirectInputDeviceElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "direct_input_device")
class DirectInputDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="device_name")
    private String deviceName;
    @Column(name="attached")
    private String attached;
    @Column(name="vendor_id")
    private String vendorId;
    @Column(name="product_id")
    private String productId;
    @ManyToOne
    private ComputerParameters computer;

    private DirectInputDevice(DirectInputDeviceElement directInputDeviceElement) {
        this.deviceName = directInputDeviceElement.getDeviceName();
        this.attached = directInputDeviceElement.getAttached();
        this.vendorId = directInputDeviceElement.getDeviceName();
        this.productId = directInputDeviceElement.getProductId();

    }

    static DirectInputDevice of(DirectInputDeviceElement directInputDeviceElement) {
        return new DirectInputDevice(directInputDeviceElement);
    }

}
