package com.cp.domain.computerparameters.port;

import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.view.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

public interface ComputerParametersQueryPort {
    Collection<BiosVM> getBiosByIpAddress(String ipAddress);
    Collection<CaptureDeviceVm> getCaptureDevicesByIpAddress(String ipAddress);
    Collection<DirectInputDeviceVm> getDirectInputDevicesByIpAddress(String ipAddress);
    Collection<DisplayDeviceVm> getDisplayDevicesByIpAddress(String ipAddress);
    Collection<HardDriveVm> getHardDrivesByIpAddress(String ipAddress);
    Collection<InternalMemoryVm> getInternalMemoriesByIpAddress(String ipAddress);
    Collection<OperatingSystemVm> getOperatingSystemsByIpAddress(String ipAddress);
    Collection<ProcessorVm> getProcessorsByIpAddress(String ipAddress);
    Collection<Ps2DeviceVm> getPs2DevicesByIpAddress(String ipAddress);
    Collection<SoundDeviceVm> getSoundDevicesByIpAddress(String ipAddress);
    Collection<SystemDeviceVm> getSystemDevicesByIpAddress(String ipAddress);
    Collection<SystemUserVm> getSystemUsersByIpAddress(String ipAddress);
    Collection<UsbDeviceVm> getUsbDevicesByIpAddress(String ipAddress);
    Collection<VideoDeviceVm> getVideoDevicesByIpAddress(String ipAddress);
    ComputerParametersProjection persistComputerParameters(ComputerParametersProjection computerParametersProjection);
    Optional<ComputerParametersProjection> findComputerByIpAddress(String ipAddress);
    Collection<ComputerParametersVm> getComputerParameterfOfAllComputers();
    Collection<NetworkCardVm> getNetworkCardsByComputerName(String ipAddress);
    Collection<InstalledApplicationVm> getInstalledApplicationByComputerName(String ipAddress);
    ComputerParametersVm getComputerParametersByIpAddress(String ipAddress);
    void deleteComputerParametersById(Integer computerId);
    LocalDateTime getGenerationDateByIpAddress(String ipAddress);
}
