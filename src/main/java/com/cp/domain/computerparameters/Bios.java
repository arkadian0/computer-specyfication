package com.cp.domain.computerparameters;

import com.cp.shared.model.cmd.BiosElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "bios")
class Bios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer biosId;
    @Column(name="version")
    private String biosVersion;
    @Column(name="caption")
    private String caption;
    @Column(name="current_language")
    private String currentLanguage;
    @Column(name="description")
    private String description;
    @Column(name="manufacturer")
    private String manufacturer;
    @Column(name="name")
    private String name;
    @Column(name="primary_bios")
    private String primaryBios;
    @Column(name="status")
    private String status;
    @ManyToOne
    private ComputerParameters computer;

    Bios(BiosElement biosElement) {
        this.biosVersion = biosElement.getBiosVersion();
        this.caption = biosElement.getCaption();
        this.currentLanguage = biosElement.getCurrentLanguage();
        this.description = biosElement.getDescription();
        this.manufacturer = biosElement.getManufacturer();
        this.name = biosElement.getName();
        this.primaryBios = biosElement.getPrimaryBios();
        this.status = biosElement.getStatus();
    }

    public static Bios of(BiosElement biosElement) {
        return new Bios(biosElement);
    }

}
