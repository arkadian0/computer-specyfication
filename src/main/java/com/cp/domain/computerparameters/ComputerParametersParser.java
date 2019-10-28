package com.cp.domain.computerparameters;

import com.cp.domain.computerparameters.view.*;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class ComputerParametersParser {
    BiosVM parse(Bios bios) {
        return BiosVM.builder()
                .biosId(bios.getBiosId())
                .biosVersion(bios.getBiosVersion())
                .caption(bios.getCaption())
                .currentLanguage(bios.getCurrentLanguage())
                .manufacturer(bios.getManufacturer())
                .primaryBios(bios.getPrimaryBios())
                .description(bios.getDescription())
                .status(bios.getStatus())
                .build();
    }

    CaptureDeviceVm parse(CaptureDevice captureDevice) {
        return CaptureDeviceVm.builder()
                .description(captureDevice.getDescription())
                .driverDate(captureDevice.getDriverDate())
                .driverName(captureDevice.getDriverName())
                .driverVersion(captureDevice.getDriverVersion())
                .build();
    }

    DirectInputDeviceVm parse(DirectInputDevice directInputDevice) {
        return DirectInputDeviceVm.builder()
                .attached(directInputDevice.getAttached())
                .deviceName((directInputDevice.getDeviceName()))
                .productId((directInputDevice.getProductId()))
                .vendorId((directInputDevice.getVendorId()))
                .build();
    }

    DisplayDeviceVm parse(DisplayDevice displayDevice) {
        return DisplayDeviceVm.builder()
                .cardName(displayDevice.getCardName())
                .manufacturer(displayDevice.getManufacturer())
                .chipType(displayDevice.getChipType())
                .dacType(displayDevice.getDacType())
                .deviceType(displayDevice.getDeviceType())
                .deviceKey(displayDevice.getDeviceKey())
                .displayMemory(displayDevice.getDisplayMemory())
                .dedicatedMemory(displayDevice.getDedicatedMemory())
                .sharedMemory(displayDevice.getSharedMemory())
                .currentMode(displayDevice.getCurrentMode())
                .hdrSupport(displayDevice.getHdrSupport())
                .driverName(displayDevice.getDriverName())
                .driverVersion(displayDevice.getDriverVersion())
                .driverModel(displayDevice.getDriverModel())
                .driverDate(displayDevice.getDriverDate())
                .vendorId(displayDevice.getVendorId())
                .deviceId(displayDevice.getDeviceId())
                .topology(displayDevice.getTopology())
                .colorPrimaries(displayDevice.getColorPrimaries())
                .colorSpace(displayDevice.getColorSpace())
                .luminance(displayDevice.getLuminance())
                .monitorName(displayDevice.getMonitorName())
                .monitorModel(displayDevice.getMonitorModel())
                .monitorId(displayDevice.getMonitorId())
                .outputType(displayDevice.getOutputType())
                .advancedColorEnabled(displayDevice.getAdvancedColorEnabled())
                .advancedColorSupported(displayDevice.getAdvancedColorSupported())
                .pixelFormat(displayDevice.getPixelFormat())
                .maxResolution(displayDevice.getMaxResolution())
                .build();
    }

    HardDriveVm parse(HardDrive hardDrive) {
        return HardDriveVm.builder()
                .driveLetter(hardDrive.getDriveLetter())
                .fileSystem(hardDrive.getFileSystem())
                .freeSpace(hardDrive.getFreeSpace())
                .hardDriveIndex(hardDrive.getHardDriveIndex())
                .maxSpace(hardDrive.getMaxSpace())
                .model(hardDrive.getModel())
                .pnpDeviceId(hardDrive.getPnpDeviceId())
                .build();
    }

    InternalMemoryVm parse(InternalMemory internalMemory) {
        return InternalMemoryVm.builder()
                .bankLabel(internalMemory.getBankLabel())
                .capacity(internalMemory.getCapacity())
                .caption(internalMemory.getCaption())
                .description(internalMemory.getDescription())
                .deviceLocator(internalMemory.getDeviceLocator())
                .manufacturer(internalMemory.getManufacturer())
                .memoryType(internalMemory.getMemoryType())
                .name(internalMemory.getName())
                .serialNumber(internalMemory.getSerialNumber())
                .speed(internalMemory.getSpeed())
                .status(internalMemory.getStatus())
                .typeDetail(internalMemory.getMemoryType())
                .build();
    }

    OperatingSystemVm parse(OperatingSystem operatingSystem) {
        return OperatingSystemVm.builder()
                .avaliableOsMemory(operatingSystem.getAvaliableOsMemory())
                .bios(operatingSystem.getBios())
                .directXVersion(operatingSystem.getDirectXVersion())
                .firmWareType(operatingSystem.getFirmWareType())
                .language(operatingSystem.getLanguage())
                .machineId(operatingSystem.getMachineId())
                .machineName(operatingSystem.getMachineName())
                .memory(operatingSystem.getMemory())
                .operatingSystem(operatingSystem.getOperatingSystem())
                .pageFile(operatingSystem.getPageFile())
                .processor(operatingSystem.getProcessor())
                .systemDpiSettings(operatingSystem.getSystemDpiSettings())
                .systemManufacturer(operatingSystem.getSystemManufacturer())
                .systemModel(operatingSystem.getSystemModel())
                .time(operatingSystem.getTime())
                .userDpiSettings(operatingSystem.getUserDpiSettings())
                .windowsDir(operatingSystem.getWindowsDir())
                .build();
    }

    ProcessorVm parse(Processor processor) {
        return ProcessorVm.builder()
                .currentClockSpeed(processor.getCurrentClockSpeed())
                .description(processor.getDescription())
                .l2CacheSize(processor.getL2CacheSize())
                .l2CacheSpeed(processor.getL2CacheSpeed())
                .l3CacheSize(processor.getL3CacheSize())
                .l3CacheSpeed(processor.getL3CacheSpeed())
                .manufacturer(processor.getManufacturer())
                .maxClockSpeed(processor.getMaxClockSpeed())
                .name(processor.getName())
                .numberOfCores(processor.getNumberOfCores())
                .numberOfEnabledCores(processor.getNumberOfEnabledCores())
                .numberOfLogicalProcessors(processor.getNumberOfLogicalProcessors())
                .status(processor.getStatus())
                .build();
    }

    Ps2DeviceVm parse(Ps2Device ps2Device) {
        return Ps2DeviceVm.builder()
                .description(ps2Device.getDescription())
                .matchingDeviceId(ps2Device.getMatchingDeviceId())
                .productId(ps2Device.getProductId())
                .vendorId(ps2Device.getVendorId())
                .build();
    }

    SoundDeviceVm parse(SoundDevice soundDevice) {
        return SoundDeviceVm.builder()
                .description(soundDevice.getDescription())
                .driverDate(soundDevice.getDriverDate())
                .driverName(soundDevice.getDriverName())
                .driverProvider(soundDevice.getDriverProvider())
                .driverVersion(soundDevice.getDriverVersion())
                .hardwareId(soundDevice.getHardwareId())
                .manufacturerId(soundDevice.getManufacturerId())
                .productId(soundDevice.getProductId())
                .type(soundDevice.getType())
                .build();
    }

    SystemDeviceVm parse(SystemDevice systemDevice) {
        List<SystemDeviceDriverVm> systemDeviceDriverVms =  Optional.ofNullable(systemDevice.getSystemDeviceDriver())
                .orElseGet(Collections::emptyList)
                .stream()
                .map(this::parse)
                .collect(Collectors.toList());
        return SystemDeviceVm.builder()
                .name(systemDevice.getName())
                .deviceKey(systemDevice.getDeviceKey())
                .systemDeviceDrivers(systemDeviceDriverVms)
                .build();
    }

    SystemDeviceDriverVm parse(SystemDeviceDriver systemDeviceDriver) {
        return SystemDeviceDriverVm.builder()
                .date(systemDeviceDriver.getDate())
                .language(systemDeviceDriver.getLanguage())
                .name(systemDeviceDriver.getName())
                .path(systemDeviceDriver.getPath())
                .version(systemDeviceDriver.getVersion())
                .build();
    }

    SystemUserVm parse(SystemUser systemUser) {
        return SystemUserVm.builder()
                .caption(systemUser.getCaption())
                .description(systemUser.getDescription())
                .disabled(systemUser.getDisabled())
                .fullName(systemUser.getFullName())
                .localAccount(systemUser.getLocalAccount())
                .name(systemUser.getName())
                .passwordChangeable(systemUser.getPasswordChangeable())
                .passwordExpires(systemUser.getPasswordExpires())
                .passwordRequired(systemUser.getPasswordRequired())
                .status(systemUser.getStatus())
                .build();
    }

    UsbDeviceVm parse(UsbDevice usbDevice) {
        return UsbDeviceVm.builder()
                .description(usbDevice.getDescription())
                .matchingDeviceId(usbDevice.getMatchingDeviceId())
                .productId(usbDevice.getProductId())
                .vendorId(usbDevice.getVendorId())
                .build();
    }

    VideoDeviceVm parse(VideoDevice videoDevice) {
        return VideoDeviceVm.builder()
                .category(videoDevice.getCategory())
                .driverDescription(videoDevice.getDriverDescription())
                .driverProvider(videoDevice.getDriverProvider())
                .driverVersion(videoDevice.getDriverVersion())
                .hardwareId(videoDevice.getHardwareId())
                .location(videoDevice.getLocation())
                .manufacturer(videoDevice.getManufacturer())
                .name(videoDevice.getName())
                .build();
    }
}