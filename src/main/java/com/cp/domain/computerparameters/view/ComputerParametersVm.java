package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class ComputerParametersVm {
    private Integer computerId;
    private String computerName;
    private String ipAddress;
    private List<BiosVM> biosVM;
    private List<CaptureDeviceVm> captureDeviceVm;
    private List<DirectInputDeviceVm> directInputDeviceVm;
    private List<DisplayDeviceVm> displayDeviceVm;
    private List<HardDriveVm> hardDriveVm;
    private List<InternalMemoryVm> internalMemoryVm;
    private List<OperatingSystemVm> operatingSystemVm;
    private List<ProcessorVm> processorVm;
    private List<Ps2DeviceVm> ps2DeviceVm;
    private List<SoundDeviceVm> soundDeviceVm;
    private List<SystemDeviceVm> systemDeviceVm;
    private List<SystemUserVm> systemUserVm;
    private List<UsbDeviceVm> usbDeviceVm;
    private List<VideoDeviceVm> videoDeviceVm;
}
