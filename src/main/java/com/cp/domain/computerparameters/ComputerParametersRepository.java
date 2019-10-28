package com.cp.domain.computerparameters;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

@org.springframework.stereotype.Repository
interface ComputerParametersRepository extends Repository<ComputerParameters, Integer>, JpaSpecificationExecutor<Bios> {
    @Query("select bios, computer from Bios bios , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<Bios> findBiosByComputerName(@Param("computerName") String computerName);

    @Query("select captureDevice, computer from CaptureDevice captureDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<CaptureDevice> findCaptureDevicesByComputerName(@Param("computerName") String computerName);

    @Query("select directInputDevice, computer from DirectInputDevice directInputDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<DirectInputDevice> findDirectInputDevicesByComputerName(String computerName);

    @Query("select displayDevice, computer from DisplayDevice displayDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<DisplayDevice> findDisplayDevicesByComputerName(String computerName);

    @Query("select hardDrive, computer from HardDrive hardDrive , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<HardDrive> findHardDriveByComputerName(String computerName);

    @Query("select internalMemory, computer from InternalMemory internalMemory , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<InternalMemory> findInternalMemoryByComputerName(String computerName);

    @Query("select operatingSystem, computer from OperatingSystem operatingSystem , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<OperatingSystem> findOperatingSystemsByComputerName(String computerName);

    @Query("select processor, computer from Processor processor , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<Processor> findProcessorsByComputerName(String computerName);

    @Query("select ps2Device, computer from Ps2Device ps2Device , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<Ps2Device> findPs2DevicesByComputerName(String computerName);

    @Query("select soundDevice, computer from SoundDevice soundDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<SoundDevice> findSoundDevicesByComputerName(String computerName);

    @Query("select systemDevice, computer from SystemDevice systemDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<SystemDevice> findSystemDevicesByComputerName(String computerName);

    @Query("select systemUser, computer from SystemUser systemUser , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<SystemUser> findSystemUsersByComputerName(String computerName);

    @Query("select usbDevice, computer from UsbDevice usbDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<UsbDevice> findUsbDevicesByComputerName(String computerName);

    @Query("select videoDevice, computer from VideoDevice videoDevice , ComputerParameters computer " +
            "where computer.name = :computerName")
    Collection<VideoDevice> findVideoDevicesByComputerName(String computerName);
}