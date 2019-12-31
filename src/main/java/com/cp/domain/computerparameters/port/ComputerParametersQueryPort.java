package com.cp.domain.computerparameters.port;

import com.cp.client.transfer.ComputerInfoDTO;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.view.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public interface ComputerParametersQueryPort {
    Collection<BiosVM> getLastBiosParametersByComputerName(String computerName);
    Collection<BiosVM> getBiosParametersByComputerId(Integer computerId);

    Collection<CaptureDeviceVm> getLastCaptureDevicesByComputerName(String computerName);
    Collection<CaptureDeviceVm> getCaptureDevicesByComputerId(Integer computerId);

    Collection<DirectInputDeviceVm> getLastDirectInputDevicesByComputerName(String computerName);
    Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerId(Integer computerId);

    Collection<DisplayDeviceVm> getLastDisplayDevicesByComputerName(String computerName);
    Collection<DisplayDeviceVm> getDisplayDevicesByComputerId(Integer computerId);

    Collection<HardDriveVm> getLastHardDrivesParametersByComputerName(String computerName);
    Collection<HardDriveVm> getHardDrivesByComputerId(Integer computerId);

    Collection<InternalMemoryVm> getLastInternalMemoriesParametersByComputerName(String computerName);
    Collection<InternalMemoryVm> getInternalMemorieByComputerId(Integer computerId);

    Collection<OperatingSystemVm> getLastOperatingSystemsParametersByComputerName(String computerName);
    Collection<OperatingSystemVm> getOperatingSystemsByComputerId(Integer computerId);

    Collection<ProcessorVm> getLastProcessorsParametersByComputerName(String computerName);
    Collection<ProcessorVm> getProcessorsByComputerId(Integer computerId);

    Collection<Ps2DeviceVm> getLastPs2DevicesByComputerName(String computerName);
    Collection<Ps2DeviceVm> getPs2DevicesByComputerId(Integer computerId);

    Collection<SoundDeviceVm> getLastSoundDevicesByComputerName(String computerName);
    Collection<SoundDeviceVm> getSoundDevicesByComputerId(Integer computerId);

    Collection<SystemDeviceVm> getLastSystemDevicesByComputerName(String computerName);
    Collection<SystemDeviceVm> getSystemDevicesByComputerId(Integer computerId);

    Collection<SystemUserVm> getLastSystemUsersByComputerName(String computerName);
    Collection<SystemUserVm> getSystemUsersByComputerId(Integer computerId);

    Collection<UsbDeviceVm> getLastUsbDevicesByComputerName(String computerName);
    Collection<UsbDeviceVm> getUsbDevicesByComputerId(Integer computerId);

    Collection<VideoDeviceVm> getLastVideoDevicesByComputerName(String computerName);
    Collection<VideoDeviceVm> getVideoDevicesByComputerId(Integer computerId);

    ComputerParametersProjection persistComputerParameters(ComputerParametersProjection computerParametersProjection);

    Collection<NetworkCardVm> getLastNetworkCardsByComputerName(String computerName);
    Collection<NetworkCardVm> getNetworkCardsByComputerId(Integer computerId);

    Collection<InstalledApplicationVm> getLastInstalledApplicationsByComputerName(String computerName);
    Collection<InstalledApplicationVm> getInstalledApplicationsByComputerId(Integer computerId);

    ComputerParametersVm getLastComputerParametersByComputerName(String computerName);
    ComputerParametersVm getComputerParametersByComputerId(Integer computerId);

    LocalDateTime getLastGenerationDateByComputerName(String computerName);
    List<ComputerInfoDTO> getAllComputersByComputerName(String computerName);
    List<ComputerInfoDTO> getAllComputerInformationGroupedByComputerName();
}
