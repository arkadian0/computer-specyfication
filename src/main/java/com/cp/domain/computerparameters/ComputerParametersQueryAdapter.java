package com.cp.domain.computerparameters;

import com.cp.client.transfer.ComputerInfoDTO;
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
    public Collection<BiosVM> getLastBiosParametersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<BiosVM>>map(computerParameters1 -> computerParameters1.getBios().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());

    }

    @Override
    public Collection<BiosVM> getBiosParametersByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<BiosVM>>map(computerParameters1 -> computerParameters1.getBios().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());

    }

    @Override
    public Collection<CaptureDeviceVm> getLastCaptureDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<CaptureDeviceVm>>map(computerParameters1 -> computerParameters1.getCaptureDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<CaptureDeviceVm> getCaptureDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<CaptureDeviceVm>>map(computerParameters1 -> computerParameters1.getCaptureDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<DirectInputDeviceVm> getLastDirectInputDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<DirectInputDeviceVm>>map(computerParameters1 -> computerParameters1.getDirectInputDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<DirectInputDeviceVm>>map(computerParameters1 -> computerParameters1.getDirectInputDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<DisplayDeviceVm> getLastDisplayDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<DisplayDeviceVm>>map(computerParameters1 -> computerParameters1.getDisplayDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<DisplayDeviceVm> getDisplayDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<DisplayDeviceVm>>map(computerParameters1 -> computerParameters1.getDisplayDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<HardDriveVm> getLastHardDrivesParametersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<HardDriveVm>>map(computerParameters1 -> computerParameters1.getHardDrives().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<HardDriveVm> getHardDrivesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<HardDriveVm>>map(computerParameters1 -> computerParameters1.getHardDrives().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<InternalMemoryVm> getLastInternalMemoriesParametersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<InternalMemoryVm>>map(computerParameters1 -> computerParameters1.getInternalMemories().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<InternalMemoryVm> getInternalMemorieByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<InternalMemoryVm>>map(computerParameters1 -> computerParameters1.getInternalMemories().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<OperatingSystemVm> getLastOperatingSystemsParametersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<OperatingSystemVm>>map(computerParameters1 -> computerParameters1.getOperatingSystems().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<OperatingSystemVm> getOperatingSystemsByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<OperatingSystemVm>>map(computerParameters1 -> computerParameters1.getOperatingSystems().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<ProcessorVm> getLastProcessorsParametersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<ProcessorVm>>map(computerParameters1 -> computerParameters1.getProcessors().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<ProcessorVm> getProcessorsByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<ProcessorVm>>map(computerParameters1 -> computerParameters1.getProcessors().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<Ps2DeviceVm> getLastPs2DevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<Ps2DeviceVm>>map(computerParameters1 -> computerParameters1.getPs2Devices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<Ps2DeviceVm> getPs2DevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<Ps2DeviceVm>>map(computerParameters1 -> computerParameters1.getPs2Devices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<SoundDeviceVm> getLastSoundDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<SoundDeviceVm>>map(computerParameters1 -> computerParameters1.getSoundDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<SoundDeviceVm> getSoundDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<SoundDeviceVm>>map(computerParameters1 -> computerParameters1.getSoundDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<SystemDeviceVm> getLastSystemDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<SystemDeviceVm>>map(computerParameters1 -> computerParameters1.getSystemDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<SystemDeviceVm> getSystemDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<SystemDeviceVm>>map(computerParameters1 -> computerParameters1.getSystemDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<SystemUserVm> getLastSystemUsersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<SystemUserVm>>map(computerParameters1 -> computerParameters1.getUsers().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<SystemUserVm> getSystemUsersByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<SystemUserVm>>map(computerParameters1 -> computerParameters1.getUsers().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<UsbDeviceVm> getLastUsbDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<UsbDeviceVm>>map(computerParameters1 -> computerParameters1.getUsbDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<UsbDeviceVm> getUsbDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<UsbDeviceVm>>map(computerParameters1 -> computerParameters1.getUsbDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<VideoDeviceVm> getLastVideoDevicesByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<VideoDeviceVm>>map(computerParameters1 -> computerParameters1.getVideoDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<VideoDeviceVm> getVideoDevicesByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<VideoDeviceVm>>map(computerParameters1 -> computerParameters1.getVideoDevices().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public ComputerParametersProjection persistComputerParameters(ComputerParametersProjection computerParametersProjection) {
        return computerParametersRepository.save(ComputerParameters.of(computerParametersProjection));
    }

    @Override
    public Collection<NetworkCardVm> getLastNetworkCardsByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<NetworkCardVm>>map(computerParameters1 -> computerParameters1.getNetworkCards().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<NetworkCardVm> getNetworkCardsByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<NetworkCardVm>>map(computerParameters1 -> computerParameters1.getNetworkCards().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<InstalledApplicationVm> getLastInstalledApplicationsByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.<Collection<InstalledApplicationVm>>map(computerParameters1 -> computerParameters1.getInstalledApplications().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public Collection<InstalledApplicationVm> getInstalledApplicationsByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.<Collection<InstalledApplicationVm>>map(computerParameters1 -> computerParameters1.getInstalledApplications().stream()
                .map(parser::parse)
                .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    @Override
    public ComputerParametersVm getLastComputerParametersByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.map(parser::parse).orElse(null);
    }

    @Override
    public ComputerParametersVm getComputerParametersByComputerId(Integer computerId) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findByComputerId(computerId);
        return computerParameters.map(parser::parse).orElse(null);
    }

    @Override
    public LocalDateTime getLastGenerationDateByComputerName(String computerName) {
        Optional<ComputerParameters> computerParameters = computerParametersRepository.findFirstByComputerNameOrderByGenerationDateDesc(computerName);
        return computerParameters.map(ComputerParameters::getGenerationDate).orElse(null);

    }

    @Override
    public List<ComputerInfoDTO> getInformationOfAllComputers() {
        return computerParametersRepository.getInformationOfAllComputers();
    }


}
