package com.cp.domain.computerparameters;

import com.cp.shared.model.cmd.ProcessorElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "processor")
class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="current_clock_speed")
    private String currentClockSpeed;
    @Column(name="description")
    private String description;
    @Column(name="l2_cache_size")
    private String l2CacheSize;
    @Column(name="l2_cache_speed")
    private String l2CacheSpeed;
    @Column(name="l3_cache_size")
    private String l3CacheSize;
    @Column(name="l3_cache_speed")
    private String l3CacheSpeed;
    @Column(name="manufacturer")
    private String manufacturer;
    @Column(name="max_clock_speed")
    private String maxClockSpeed;
    @Column(name="name")
    private String name;
    @Column(name="number_of_cores")
    private String numberOfCores;
    @Column(name="number_of_enabled_cores")
    private String numberOfEnabledCores;
    @Column(name="number_of_logical_processors")
    private String numberOfLogicalProcessors;
    @Column(name="status")
    private String status;
    @ManyToOne
    private ComputerParameters computer;
    private Processor(ProcessorElement processorElement) {
        this.currentClockSpeed = processorElement.getCurrentClockSpeed();
        this.description = processorElement.getDescription();
        this.l2CacheSize = processorElement.getL2CacheSize();
        this.l2CacheSpeed = processorElement.getCurrentClockSpeed();
        this.l3CacheSize = processorElement.getL3CacheSize();
        this.l3CacheSpeed = processorElement.getL3CacheSpeed();
        this.manufacturer = processorElement.getManufacturer();
        this.maxClockSpeed = processorElement.getMaxClockSpeed();
        this.name = processorElement.getName();
        this.numberOfCores = processorElement.getNumberOfCores();
        this.numberOfEnabledCores = processorElement.getNumberOfEnabledCores();
        this.numberOfLogicalProcessors = processorElement.getNumberOfLogicalProcessors();
        this.status = processorElement.getStatus();
    }

    public static Processor of(ProcessorElement processorElement) {
        return new Processor(processorElement);
    }
}
