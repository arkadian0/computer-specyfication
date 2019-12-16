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

    @GetMapping("/last-generated/bios/{computerName}")
    public Collection<BiosVM> getLastBiosParametersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastBiosParametersByComputerName(computerName);
    }
    @GetMapping("/bios/{computerId}")
    public Collection<BiosVM> getBiosParametersByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getBiosParametersByComputerId(computerId);
    }

    @GetMapping("/last-generated/capture-devices/{computerName}")
    public Collection<CaptureDeviceVm> getLastCaptureDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastCaptureDevicesByComputerName(computerName);
    }

    @GetMapping("/capture-devices/{computerId}")
    public Collection<CaptureDeviceVm> getCaptureDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getCaptureDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/direct-input-devices/{computerName}")
    public Collection<DirectInputDeviceVm> getLastDirectInputDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastDirectInputDevicesByComputerName(computerName);
    }
    @GetMapping("/direct-input-devices/{computerId}")
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getDirectInputDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/display-devices/{computerName}")
    public Collection<DisplayDeviceVm> getLastDisplayDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastDisplayDevicesByComputerName(computerName);
    }
    @GetMapping("/display-devices/{computerName")
    public Collection<DisplayDeviceVm> getDisplayDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getDisplayDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/hard-drives/{computerName}")
    public Collection<HardDriveVm> getLastHardDrivesParametersByComputerName(@PathVariable String computerName ){
        return computerParametersQueryPort.getLastHardDrivesParametersByComputerName(computerName);
    }

    @GetMapping("/hard-drives/{computerId}")
    public Collection<HardDriveVm> getHardDrivesByComputerId(@PathVariable Integer computerId ){
        return computerParametersQueryPort.getHardDrivesByComputerId(computerId);
    }

    @GetMapping("/last-generated/internal-memories/{computerName}")
    public Collection<InternalMemoryVm> getLastInternalMemoriesParametersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastInternalMemoriesParametersByComputerName(computerName);
    }

    @GetMapping("/internal-memories/{computerId}")
    public Collection<InternalMemoryVm> getInternalMemorieByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getInternalMemorieByComputerId(computerId);
    }


    @GetMapping("/last-generated/operating-systems/{computerName}")
    public Collection<OperatingSystemVm> getLastOperatingSystemsParametersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastOperatingSystemsParametersByComputerName(computerName);
    }

    @GetMapping("/operating-systems/{computerId}")
    public Collection<OperatingSystemVm> getOperatingSystemsByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getOperatingSystemsByComputerId(computerId);
    }

    @GetMapping("/last-generated/processors/{computerName}")
    public Collection<ProcessorVm> getLastProcessorsParametersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastProcessorsParametersByComputerName(computerName);
    }

    @GetMapping("/processors/{computerId}")
    public Collection<ProcessorVm> getProcessorsByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getProcessorsByComputerId(computerId);
    }

    @GetMapping("/last-generated/ps2-devices/{computerName}")
    public Collection<Ps2DeviceVm> getLastPs2DevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastPs2DevicesByComputerName(computerName);
    }

    @GetMapping("/ps2-devices/{computerId}")
    public Collection<Ps2DeviceVm> getPs2DevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getPs2DevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/sound-devices/{computerName}")
    public Collection<SoundDeviceVm> getLastSoundDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastSoundDevicesByComputerName(computerName);
    }
    @GetMapping("/sound-devices/{computerId}")
    public Collection<SoundDeviceVm> getSoundDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getSoundDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/system-devices/{computerName}")
    public Collection<SystemDeviceVm> getLastSystemDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastSystemDevicesByComputerName(computerName);
    }
    @GetMapping("/system-devices/{computerId}")
    public Collection<SystemDeviceVm> getSystemDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getSystemDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/system-users/{computerName}")
    public Collection<SystemUserVm> getLastSystemUsersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastSystemUsersByComputerName(computerName);
    }

    @GetMapping("/system-users/{computerId}")
    public Collection<SystemUserVm> getSystemUsersByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getSystemUsersByComputerId(computerId);
    }

    @GetMapping("/last-generated/usb-devices/{computerName}")
    public Collection<UsbDeviceVm> getLastUsbDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastUsbDevicesByComputerName(computerName);
    }

    @GetMapping("/usb-devices/{computerId}")
    public Collection<UsbDeviceVm> getUsbDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getUsbDevicesByComputerId(computerId);
    }


    @GetMapping("/last-generated/video-devices/{computerName}")
    public Collection<VideoDeviceVm> getLastVideoDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastVideoDevicesByComputerName(computerName);
    }

    @GetMapping("/video-devices/{computerId}")
    public Collection<VideoDeviceVm> getVideoDevicesByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getVideoDevicesByComputerId(computerId);
    }

    @GetMapping("/last-generated/network-cards/{computerName}")
    public Collection<NetworkCardVm> getLastNetworkCardsByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastNetworkCardsByComputerName(computerName);
    }

    @GetMapping("/network-cards/{computerId}")
    public Collection<NetworkCardVm> getNetworkCardsByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getNetworkCardsByComputerId(computerId);
    }
    @GetMapping("/last-generated/installed-applications/{computerName}")
    public Collection<InstalledApplicationVm> getLastInstalledApplicationsByComputerName(@PathVariable String computerName ){
        return computerParametersQueryPort.getLastInstalledApplicationsByComputerName(computerName);
    }

    @GetMapping("installed-applications/{computerId}")
    public Collection<InstalledApplicationVm> getInstalledApplicationsByComputerId(@PathVariable Integer computerId ){
        return computerParametersQueryPort.getInstalledApplicationsByComputerId(computerId);
    }

    @GetMapping("/last-generated/all-parameters/{computerName}")
    public ComputerParametersVm getLastComputerParametersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getLastComputerParametersByComputerName(computerName);
    }

    @GetMapping("/all-parameters/{computerId}")
    public ComputerParametersVm getComputerParametersByComputerId(@PathVariable Integer computerId){
        return computerParametersQueryPort.getComputerParametersByComputerId(computerId);
    }


}