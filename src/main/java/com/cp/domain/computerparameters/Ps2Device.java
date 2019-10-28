package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.InputRelatedDevicePs2Element;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ps2_device")
class Ps2Device {
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
    private Ps2Device(InputRelatedDevicePs2Element inputRelatedDevicePs2Element) {
        this.description = inputRelatedDevicePs2Element.getDescription();
        this.vendorId = inputRelatedDevicePs2Element.getVendorId();
        this.productId = inputRelatedDevicePs2Element.getProductId();
        this.matchingDeviceId = inputRelatedDevicePs2Element.getMatchingDeviceId();
    }

    static Ps2Device of(InputRelatedDevicePs2Element inputRelatedDevicePs2Element) {
        return new Ps2Device(inputRelatedDevicePs2Element);
    }
}
