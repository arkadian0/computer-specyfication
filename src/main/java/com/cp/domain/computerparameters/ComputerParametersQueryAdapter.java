package com.cp.domain.computerparameters;

import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.domain.computerparameters.view.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ComputerParametersQueryAdapter implements ComputerParametersQueryPort {

    private final ComputerParametersRepository computerParametersRepository;
    private final ComputerParametersParser parser;

    @Override
    public Collection<BiosVM> getBiosByIpAddress(String ipAddress) {
        Collection<Bios> biosCollection = computerParametersRepository.findBiosByIpAddress(ipAddress);
        return Optional.ofNullable(biosCollection)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<CaptureDeviceVm> getCaptureDevicesByIpAddress(String ipAddress) {
        Collection<CaptureDevice> captureDevices = computerParametersRepository.findCaptureDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByIpAddress(String ipAddress) {
        Collection<DirectInputDevice> captureDevices = computerParametersRepository.findDirectInputDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<DisplayDeviceVm> getDisplayDevicesByIpAddress(String ipAddress) {
        Collection<DisplayDevice> captureDevices = computerParametersRepository.findDisplayDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<HardDriveVm> getHardDrivesByIpAddress(String ipAddress) {
        Collection<HardDrive> captureDevices = computerParametersRepository.findHardDriveByIpAddress(ipAddress);
        return Optional.ofNullable(captureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<InternalMemoryVm> getInternalMemoriesByIpAddress(String ipAddress) {
        Collection<InternalMemory> internalMemories = computerParametersRepository.findInternalMemoryByIpAddress(ipAddress);
        return Optional.ofNullable(internalMemories)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<OperatingSystemVm> getOperatingSystemsByIpAddress(String ipAddress) {
        Collection<OperatingSystem> operatingSystems = computerParametersRepository.findOperatingSystemsByIpAddress(ipAddress);
        return Optional.ofNullable(operatingSystems)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ProcessorVm> getProcessorsByIpAddress(String ipAddress) {
        Collection<Processor> operatingSystems = computerParametersRepository.findProcessorsByIpAddress(ipAddress);
        return Optional.ofNullable(operatingSystems)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Ps2DeviceVm> getPs2DevicesByIpAddress(String ipAddress) {
        Collection<Ps2Device> ps2Devices = computerParametersRepository.findPs2DevicesByIpAddress(ipAddress);
        return Optional.ofNullable(ps2Devices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<SoundDeviceVm> getSoundDevicesByIpAddress(String ipAddress) {
        Collection<SoundDevice> soundDevices = computerParametersRepository.findSoundDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(soundDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<SystemDeviceVm> getSystemDevicesByIpAddress(String ipAddress) {
        Collection<SystemDevice> systemDevices = computerParametersRepository.findSystemDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(systemDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<SystemUserVm> getSystemUsersByIpAddress(String ipAddress) {
        Collection<SystemUser> systemUsers = computerParametersRepository.findSystemUsersByIpAddress(ipAddress);
        return Optional.ofNullable(systemUsers)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<UsbDeviceVm> getUsbDevicesByIpAddress(String ipAddress) {
        Collection<UsbDevice> usbDevices = computerParametersRepository.findUsbDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(usbDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<VideoDeviceVm> getVideoDevicesByIpAddress(String ipAddress) {
        Collection<VideoDevice> videoDevices = computerParametersRepository.findVideoDevicesByIpAddress(ipAddress);
        return Optional.ofNullable(videoDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public ComputerParametersProjection persistComputerParameters(ComputerParametersProjection computerParametersProjection) {
        return computerParametersRepository.save(ComputerParameters.of(computerParametersProjection));
    }


    @Override
    public Optional<ComputerParametersProjection> findComputerByIpAddress(String ipAddress) {
        ComputerParametersProjection computerParametersProjection = computerParametersRepository.findByIpAddress(ipAddress);
        return Optional.ofNullable(computerParametersProjection);
    }

    @Override
    public void deleteComputerParametersById(Integer computerId) {
        computerParametersRepository.deleteById(computerId);
    }

    @Override
    public LocalDateTime getGenerationDateByIpAddress(String ipAddress) {
        return computerParametersRepository.findGnerationDateByIpAddress(ipAddress);
    }

    @Override
    public List<ComputerParametersVm> getComputerParameterfOfAllComputers() {
        return computerParametersRepository.findAll()
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<NetworkCardVm> getNetworkCardsByComputerName(String ipAddress) {
        Collection<NetworkCard> networkCards = computerParametersRepository.findNetworkCardsByIpAddress(ipAddress);
        return Optional.ofNullable(networkCards)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }


    @Override
    public Collection<InstalledApplicationVm> getInstalledApplicationByComputerName(String ipAddress) {
        Collection<InstalledApplication> installedApplications = computerParametersRepository.findInstalledApplicationsByIpAddress(ipAddress);
        return Optional.ofNullable(installedApplications)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(parser::parse)
                .collect(Collectors.toList());
    }

    @Override
    public ComputerParametersVm getComputerParametersByIpAddress(String ipAddress) {
        ComputerParametersProjection computerParametersProjection = computerParametersRepository.findByIpAddress(ipAddress);
        return parser.parse(ComputerParameters.of(computerParametersProjection));
    }
}
