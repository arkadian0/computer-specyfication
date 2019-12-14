package com.cp.domain.computerparameters.port;

import com.cp.client.transfer.ComputerInfoDTO;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.view.*;

import java.util.Collection;
import java.util.List;

public interface ComputerParametersQueryPort {
    Collection<BiosVM> getLastBiosParametersByIpAddress(String ipAddress);
    Collection<BiosVM> getBiosParametersByComputerId(Integer computerId);

    Collection<CaptureDeviceVm> getLastCaptureDevicesByIpAddress(String ipAddress);
    Collection<CaptureDeviceVm> getCaptureDevicesByComputerId(Integer computerId);

    Collection<DirectInputDeviceVm> getLastDirectInputDevicesByIpAddress(String ipAddress);
    Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerId(Integer computerId);

    Collection<DisplayDeviceVm> getLastDisplayDevicesByIpAddress(String ipAddress);
    Collection<DisplayDeviceVm> getDisplayDevicesByComputerId(Integer computerId);

    Collection<HardDriveVm> getLastHardDrivesParametersByIpAddress(String ipAddress);
    Collection<HardDriveVm> getHardDrivesByComputerId(Integer computerId);

    Collection<InternalMemoryVm> getLastInternalMemoriesParametersByIpAddress(String ipAddress);
    Collection<InternalMemoryVm> getInternalMemorieByComputerId(Integer computerId);

    Collection<OperatingSystemVm> getLastOperatingSystemsParametersByIpAddress(String ipAddress);
    Collection<OperatingSystemVm> getOperatingSystemsByComputerId(Integer computerId);

    Collection<ProcessorVm> getLastProcessorsParametersByIpAddress(String ipAddress);
    Collection<ProcessorVm> getProcessorsByComputerId(Integer computerId);

    Collection<Ps2DeviceVm> getLastPs2DevicesByIpAddress(String ipAddress);
    Collection<Ps2DeviceVm> getPs2DevicesByComputerId(Integer computerId);

    Collection<SoundDeviceVm> getLastSoundDevicesByIpAddress(String ipAddress);
    Collection<SoundDeviceVm> getSoundDevicesByComputerId(Integer computerId);

    Collection<SystemDeviceVm> getLastSystemDevicesByIpAddress(String ipAddress);
    Collection<SystemDeviceVm> getSystemDevicesByComputerId(Integer computerId);

    Collection<SystemUserVm> getLastSystemUsersByIpAddress(String ipAddress);
    Collection<SystemUserVm> getSystemUsersByComputerId(Integer computerId);

    Collection<UsbDeviceVm> getLastUsbDevicesByIpAddress(String ipAddress);
    Collection<UsbDeviceVm> getUsbDevicesByComputerId(Integer computerId);

    Collection<VideoDeviceVm> getLastVideoDevicesByIpAddress(String ipAddress);
    Collection<VideoDeviceVm> getVideoDevicesByComputerId(Integer computerId);

    ComputerParametersProjection persistComputerParameters(ComputerParametersProjection computerParametersProjection);

    Collection<NetworkCardVm> getLastNetworkCardsByIpAddress(String ipAddress);
    Collection<NetworkCardVm> getNetworkCardsByComputerId(Integer computerId);

    Collection<InstalledApplicationVm> getLastInstalledApplicationsByIpAddress(String ipAddress);
    Collection<InstalledApplicationVm> getInstalledApplicationsByComputerId(Integer computerId);

    ComputerParametersVm getLastComputerParametersByIpAddress(String ipAddress);
    ComputerParametersVm getComputerParametersByComputerId(Integer computerId);


    List<ComputerInfoDTO> getInformationOfAllComputers();
}
