package com.cp.domain.computerparameters;

import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.domain.computerparameters.view.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ComputerParametersQueryAdapter implements ComputerParametersQueryPort {

    private final ComputerParametersRepository computerParametersRepository;
    private final ComputerParametersParser parser;

    @Override
    public Collection<BiosVM> getBiosByComputerName(String computerName) {
        Collection<Bios> biosCollection = computerParametersRepository.findBiosByComputerName(computerName);
        return Optional.ofNullable(biosCollection)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<CaptureDeviceVm> getCaptureDevicesByComputerName(String computerName) {
        Collection<CaptureDevice> captureDevices = computerParametersRepository.findCaptureDevicesByComputerName(computerName);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerName(String computerName) {
        Collection<DirectInputDevice> captureDevices = computerParametersRepository.findDirectInputDevicesByComputerName(computerName);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<DisplayDeviceVm> getDisplayDevicesByComputerName(String computerName) {
        Collection<DisplayDevice> captureDevices = computerParametersRepository.findDisplayDevicesByComputerName(computerName);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<HardDriveVm> getHardDrivesByComputerName(String computerName) {
        Collection<HardDrive> captureDevices = computerParametersRepository.findHardDriveByComputerName(computerName);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<InternalMemoryVm> getInternalMemoriesByComputerName(String computerName) {
        Collection<InternalMemory> internalMemories = computerParametersRepository.findInternalMemoryByComputerName(computerName);
        return Optional.ofNullable(internalMemories)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<OperatingSystemVm> getOperatingSystemsByComputerName(String computerName) {
        Collection<OperatingSystem> operatingSystems = computerParametersRepository.findOperatingSystemsByComputerName(computerName);
        return Optional.ofNullable(operatingSystems)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ProcessorVm> getProcessorsByComputerName(String computerName) {
        Collection<Processor> operatingSystems = computerParametersRepository.findProcessorsByComputerName(computerName);
        return Optional.ofNullable(operatingSystems)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Ps2DeviceVm> getPs2DevicesByComputerName(String computerName) {
        Collection<Ps2Device> ps2Devices = computerParametersRepository.findPs2DevicesByComputerName(computerName);
        return Optional.ofNullable(ps2Devices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<SoundDeviceVm> getSoundDevicesByComputerName(String computerName) {
        Collection<SoundDevice> soundDevices = computerParametersRepository.findSoundDevicesByComputerName(computerName);
        return Optional.ofNullable(soundDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<SystemDeviceVm> getSystemDevicesByComputerName(String computerName) {
        Collection<SystemDevice> systemDevices = computerParametersRepository.findSystemDevicesByComputerName(computerName);
        return Optional.ofNullable(systemDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<SystemUserVm> getSystemUsersByComputerName(String computerName) {
        Collection<SystemUser> systemUsers = computerParametersRepository.findSystemUsersByComputerName(computerName);
        return Optional.ofNullable(systemUsers)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<UsbDeviceVm> getUsbDevicesByComputerName(String computerName) {
        Collection<UsbDevice> usbDevices = computerParametersRepository.findUsbDevicesByComputerName(computerName);
        return Optional.ofNullable(usbDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<VideoDeviceVm> getVideoDevicesByComputerName(String computerName) {
        Collection<VideoDevice> videoDevices = computerParametersRepository.findVideoDevicesByComputerName(computerName);
        return Optional.ofNullable(videoDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }


}
