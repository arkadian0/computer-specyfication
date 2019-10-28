package com.cp.domain.computerparameters;

import java.util.Collection;

public interface ComputerParametersProjection {
    Collection<Bios> getBios();

    Collection<CaptureDevice> getCaptureDevices();

    Collection<DirectInputDevice> getDirectInputDevices();

    Collection<DisplayDevice> getDisplayDevices();

    Collection<HardDrive> getHardDrives();

    Collection<InternalMemory> getInternalMemories();

    Collection<Processor> getProcessors();

    Collection<Ps2Device> getPs2Devices();

    Collection<SoundDevice> getSoundDevices();

    Collection<SystemDevice> getSystemDevices();

    Collection<UsbDevice> getUsbDevices();

    Collection<User> getUsers();

    Collection<VideoDevice> getVideoDevices();
}
