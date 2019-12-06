package com.cp.domain.computerparameters;

import com.cp.shared.model.cmd.InstalledApplicationElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "installed_application")
class InstalledApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="caption")
    private String caption;
    @Column(name="description")
    private String description;
    @Column(name="identifying_number")
    private String identifyingNumber;
    @Column(name="vendor")
    private String vendor;
    @Column(name="version")
    private String version;
    @Column(name="install_date")
    private String installDate;
    @Column(name="install_source")
    private String installSource;
    @Column(name="local_package")
    private String localPackages;
    @ManyToOne
    private ComputerParameters computer;

    InstalledApplication(InstalledApplicationElement installedApplicationElement) {
        this.name = installedApplicationElement.getName();
        this.caption = installedApplicationElement.getCaption();
        this.description = installedApplicationElement.getDescription();
        this.identifyingNumber = installedApplicationElement.getIdentifyingNumber();
        this.vendor = installedApplicationElement.getVendor();
        this.version = installedApplicationElement.getVersion();
        this.installDate = installedApplicationElement.getInstallDate();
        this.installSource = installedApplicationElement.getInstallSource();
        this.localPackages = installedApplicationElement.getLocalPackages();
    }

    static InstalledApplication of(InstalledApplicationElement installedApplicationElement) {
        return new InstalledApplication(installedApplicationElement);
    }


}
