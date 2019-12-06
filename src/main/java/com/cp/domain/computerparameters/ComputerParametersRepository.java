package com.cp.domain.computerparameters;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.time.LocalDateTime;
import java.util.Collection;

@org.springframework.stereotype.Repository
interface ComputerParametersRepository extends Repository<ComputerParameters, Integer>, JpaRepository<ComputerParameters,Integer> {
    @Query("select bios, computer from Bios bios , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<Bios> findBiosByIpAddress(String ipAddress);

    @Query("select captureDevice, computer from CaptureDevice captureDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<CaptureDevice> findCaptureDevicesByIpAddress(String ipAddress);

    @Query("select directInputDevice, computer from DirectInputDevice directInputDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<DirectInputDevice> findDirectInputDevicesByIpAddress(String ipAddress);

    @Query("select displayDevice, computer from DisplayDevice displayDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<DisplayDevice> findDisplayDevicesByIpAddress(String ipAddress);

    @Query("select hardDrive, computer from HardDrive hardDrive , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<HardDrive> findHardDriveByIpAddress(String ipAddress);

    @Query("select internalMemory, computer from InternalMemory internalMemory , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<InternalMemory> findInternalMemoryByIpAddress(String ipAddress);

    @Query("select operatingSystem, computer from OperatingSystem operatingSystem , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<OperatingSystem> findOperatingSystemsByIpAddress(String ipAddress);

    @Query("select processor, computer from Processor processor , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<Processor> findProcessorsByIpAddress(String ipAddress);

    @Query("select ps2Device, computer from Ps2Device ps2Device , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<Ps2Device> findPs2DevicesByIpAddress(String ipAddress);

    @Query("select soundDevice, computer from SoundDevice soundDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<SoundDevice> findSoundDevicesByIpAddress(String ipAddress);

    @Query("select systemDevice, computer from SystemDevice systemDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<SystemDevice> findSystemDevicesByIpAddress(String ipAddress);

    @Query("select systemUser, computer from SystemUser systemUser , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<SystemUser> findSystemUsersByIpAddress(String ipAddress);

    @Query("select usbDevice, computer from UsbDevice usbDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<UsbDevice> findUsbDevicesByIpAddress(String ipAddress);

    @Query("select videoDevice, computer from VideoDevice videoDevice , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<VideoDevice> findVideoDevicesByIpAddress(String ipAddress);

    @Query("select networkCard, computer from NetworkCard networkCard , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<NetworkCard> findNetworkCardsByIpAddress(String ipAddress);

    @Query("select installedApplication, computer from InstalledApplication installedApplication , ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    Collection<InstalledApplication> findInstalledApplicationsByIpAddress(String ipAddress);

    ComputerParametersProjection findByIpAddress(String ipAddress);

    @Query("select generationDate from ComputerParameters computer " +
            "where computer.ipAddress = :ipAddress")
    LocalDateTime findGnerationDateByIpAddress(String ipAddress);

}