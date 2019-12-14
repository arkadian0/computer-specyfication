package com.cp.client.computerparameters;

import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.domain.computerparameters.view.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/parameter")
public class ComputerParametersQueryController {
    private final ComputerParametersQueryPort computerParametersQueryPort;

    @GetMapping("/last-generated/bios/{ipAddress}")
    public Collection<BiosVM> getLastBiosParametersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastBiosParametersByIpAddress(ipAddress);
    }
    @GetMapping("/bios/{computerId}")
    public Collection<BiosVM> getBiosParametersByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getBiosParametersByComputerId(computerId);
    }

    @GetMapping("/last-generated/capture-devices/{ipAddress}")
    public Collection<CaptureDeviceVm> getLastCaptureDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastCaptureDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/capture-devices/{computerId}")
    public Collection<CaptureDeviceVm> getCaptureDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getCaptureDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/direct-input-devices/{ipAddress}")
    public Collection<DirectInputDeviceVm> getLastDirectInputDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastDirectInputDevicesByIpAddress(ipAddress);
    }
    @GetMapping("/direct-input-devices/{computerId}")
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getDirectInputDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/display-devices/{ipAddress}")
    public Collection<DisplayDeviceVm> getLastDisplayDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastDisplayDevicesByIpAddress(ipAddress);
    }
    @GetMapping("/display-devices/{ipAddress")
    public Collection<DisplayDeviceVm> getDisplayDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getDisplayDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/hard-drives/{ipAddress}")
    public Collection<HardDriveVm> getLastHardDrivesParametersByIpAddress(@PathVariable String ipAddress ){
        return computerParametersQueryPort.getLastHardDrivesParametersByIpAddress(ipAddress);
    }

    @GetMapping("/hard-drives/{computerId}")
    public Collection<HardDriveVm> getHardDrivesByComputerId(@PathVariable Integer computerId ){
        return computerParametersQueryPort.getHardDrivesByComputerId(computerId);
    }

    @GetMapping("/last-generated/internal-memories/{ipAddress}")
    public Collection<InternalMemoryVm> getLastInternalMemoriesParametersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastInternalMemoriesParametersByIpAddress(ipAddress);
    }

    @GetMapping("/internal-memories/{computerId}")
    public Collection<InternalMemoryVm> getInternalMemorieByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getInternalMemorieByComputerId(computerId);
    }


    @GetMapping("/last-generated/operating-systems/{ipAddress}")
    public Collection<OperatingSystemVm> getLastOperatingSystemsParametersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastOperatingSystemsParametersByIpAddress(ipAddress);
    }

    @GetMapping("/operating-systems/{computerId}")
    public Collection<OperatingSystemVm> getOperatingSystemsByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getOperatingSystemsByComputerId(computerId);
    }

    @GetMapping("/last-generated/processors/{ipAddress}")
    public Collection<ProcessorVm> getLastProcessorsParametersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastProcessorsParametersByIpAddress(ipAddress);
    }

    @GetMapping("/processors/{computerId}")
    public Collection<ProcessorVm> getProcessorsByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getProcessorsByComputerId(computerId);
    }

    @GetMapping("/last-generated/ps2-devices/{ipAddress}")
    public Collection<Ps2DeviceVm> getLastPs2DevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastPs2DevicesByIpAddress(ipAddress);
    }

    @GetMapping("/ps2-devices/{computerId}")
    public Collection<Ps2DeviceVm> getPs2DevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getPs2DevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/sound-devices/{ipAddress}")
    public Collection<SoundDeviceVm> getLastSoundDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastSoundDevicesByIpAddress(ipAddress);
    }
    @GetMapping("/sound-devices/{computerId}")
    public Collection<SoundDeviceVm> getSoundDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getSoundDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/system-devices/{ipAddress}")
    public Collection<SystemDeviceVm> getLastSystemDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastSystemDevicesByIpAddress(ipAddress);
    }
    @GetMapping("/system-devices/{computerId}")
    public Collection<SystemDeviceVm> getSystemDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getSystemDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/system-users/{ipAddress}")
    public Collection<SystemUserVm> getLastSystemUsersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastSystemUsersByIpAddress(ipAddress);
    }

    @GetMapping("/system-users/{computerId}")
    public Collection<SystemUserVm> getSystemUsersByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getSystemUsersByComputerId(computerId);
    }

    @GetMapping("/last-generated/usb-devices/{ipAddress}")
    public Collection<UsbDeviceVm> getLastUsbDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastUsbDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/usb-devices/{computerId}")
    public Collection<UsbDeviceVm> getUsbDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getUsbDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/video-devices/{ipAddress}")
    public Collection<VideoDeviceVm> getLastVideoDevicesByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastVideoDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/video-devices/{computerId}")
    public Collection<VideoDeviceVm> getVideoDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getVideoDevicesByComputerId(computerId);
    }

    @GetMapping("/last-generated/network-cards/{ipAddress}")
    public Collection<NetworkCardVm> getLastNetworkCardsByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastNetworkCardsByIpAddress(ipAddress);
    }

    @GetMapping("/network-cards/{computerId}")
    public Collection<NetworkCardVm> getNetworkCardsByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getNetworkCardsByComputerId(computerId);
    }
    @GetMapping("/last-generated/installed-applications/{ipAddress}")
    public Collection<InstalledApplicationVm> getLastInstalledApplicationsByIpAddress(@PathVariable String ipAddress ){
        return computerParametersQueryPort.getLastInstalledApplicationsByIpAddress(ipAddress);
    }

    @GetMapping("/last-generated/installed-applications/{computerId}")
    public Collection<InstalledApplicationVm> getInstalledApplicationsByComputerId(@PathVariable Integer computerId ){
        return computerParametersQueryPort.getInstalledApplicationsByComputerId(computerId);
    }

    @GetMapping("/last-generated/all-parameters/{ipAddress}")
    public ComputerParametersVm getLastComputerParametersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getLastComputerParametersByIpAddress(ipAddress);
    }

    @GetMapping("/all-parameters/{computerId}")
    public ComputerParametersVm getComputerParametersByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getComputerParametersByComputerId(computerId);
    }


}