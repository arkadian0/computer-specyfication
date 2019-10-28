package com.cp.domain.computerparameters.port;

import com.cp.domain.computerparameters.view.*;

import java.util.Collection;

public interface ComputerParametersQueryPort {
    Collection<BiosVM> getBiosByComputerName(String computerName);
    Collection<CaptureDeviceVm> getCaptureDevicesByComputerName(String computerName);
    Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerName(String computerName);
    Collection<DisplayDeviceVm> getDisplayDevicesByComputerName(String computerName);
    Collection<HardDriveVm> getHardDrivesByComputerName(String computerName);
    Collection<InternalMemoryVm> getInternalMemoriesByComputerName(String computerName);
    Collection<OperatingSystemVm> getOperatingSystemsByComputerName(String computerName);
    Collection<ProcessorVm> getProcessorsByComputerName(String computerName);
    Collection<Ps2DeviceVm> getPs2DevicesByComputerName(String computerName);
    Collection<SoundDeviceVm> getSoundDevicesByComputerName(String computerName);
    Collection<SystemDeviceVm> getSystemDevicesByComputerName(String computerName);
    Collection<SystemUserVm> getSystemUsersByComputerName(String computerName);
    Collection<UsbDeviceVm> getUsbDevicesByComputerName(String computerName);
    Collection<VideoDeviceVm> getVideoDevicesByComputerName(String computerName);

}
