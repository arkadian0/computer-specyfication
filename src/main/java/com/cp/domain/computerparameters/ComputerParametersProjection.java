package com.cp.domain.computerparameters;

import java.util.List;

public interface ComputerParametersProjection {

    Integer getComputerId();

    List<Bios> getBios();

    List<CaptureDevice> getCaptureDevices();

    String getComputerName();

    String getIpAddress();

    List<DirectInputDevice> getDirectInputDevices();

    List<DisplayDevice> getDisplayDevices();

    List<HardDrive> getHardDrives();

    List<InternalMemory> getInternalMemories();

    List<Processor> getProcessors();

    List<Ps2Device> getPs2Devices();

    List<SoundDevice> getSoundDevices();

    List<SystemDevice> getSystemDevices();

    List<UsbDevice> getUsbDevices();

    List<SystemUser> getUsers();

    List<VideoDevice> getVideoDevices();

    List<OperatingSystem> getOperatingSystem();
}
