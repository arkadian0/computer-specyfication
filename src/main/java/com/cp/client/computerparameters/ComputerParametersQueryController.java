package com.cp.client.computerparameters;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.domain.computerparameters.view.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/parameter")
public class ComputerParametersQueryController {
    private final SpecificationComputerApplicationPort specificationComputerApplicationPort;
    private final ComputerParametersQueryPort computerParametersQueryPort;

    @GetMapping("/bios/{ipAddress}")
    public Collection<BiosVM> getBiosParametersByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getBiosByIpAddress(ipAddress);
    }

    @GetMapping("/capture-devices/{ipAddress}")
    public Collection<CaptureDeviceVm> getCaptureDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getCaptureDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/direct-input-devices/{ipAddress}")
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getDirectInputDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/display-devices/{ipAddress}")
    public Collection<DisplayDeviceVm> getDisplayDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getDisplayDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/hard-drives/{ipAddress}")
    public Collection<HardDriveVm> getHardDriveByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getHardDrivesByIpAddress(ipAddress);
    }

    @GetMapping("/internal-memories/{ipAddress}")
    public Collection<InternalMemoryVm> getInternalMemoriesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getInternalMemoriesByIpAddress(ipAddress);
    }

    @GetMapping("/operating-systems/{ipAddress}")
    public Collection<OperatingSystemVm> getOperatingSystemsByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getOperatingSystemsByIpAddress(ipAddress);
    }

    @GetMapping("/processors/{ipAddress}")
    public Collection<ProcessorVm> getProcessorsByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getProcessorsByIpAddress(ipAddress);
    }

    @GetMapping("/ps2-devices/{ipAddress}")
    public Collection<Ps2DeviceVm> getPs2DevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getPs2DevicesByIpAddress(ipAddress);
    }

    @GetMapping("/sound-devices/{ipAddress}")
    public Collection<SoundDeviceVm> getSoundDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getSoundDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/system-devices/{ipAddress}")//error
    public Collection<SystemDeviceVm> getSystemDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getSystemDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/system-users/{ipAddress}")
    public Collection<SystemUserVm> getSystemUsersByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getSystemUsersByIpAddress(ipAddress);
    }

    @GetMapping("/usb-devices/{ipAddress}")
    public Collection<UsbDeviceVm> getUsbDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getUsbDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/video-devices/{ipAddress}")
    public Collection<VideoDeviceVm> getVideoDevicesByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getVideoDevicesByIpAddress(ipAddress);
    }

    @GetMapping("/network-cards/{ipAddress}")
    public Collection<NetworkCardVm> getNetworkCardsByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getNetworkCardsByComputerName(ipAddress);
    }

    @GetMapping("/installed-applications/{ipAddress}")
    public Collection<InstalledApplicationVm> getInstalledApplicationByComputerName(@PathVariable String ipAddress){
        return computerParametersQueryPort.getInstalledApplicationByComputerName(ipAddress);
    }

    @GetMapping("/all-parameters")
    public Collection<ComputerParametersVm> getComputerParameterfOfAllComputers(){
        return computerParametersQueryPort.getComputerParameterfOfAllComputers();
    }
    @GetMapping("/all-parameters/{ipAddress}")
    public ComputerParametersVm getComputerParametersByIpAddress(@PathVariable String ipAddress){
        return computerParametersQueryPort.getComputerParametersByIpAddress(ipAddress);
    }

    @GetMapping("/generated/{ipAddress}")
    public boolean isGeneratedComputerParameters(@PathVariable String ipAddress) {
        return specificationComputerApplicationPort.isGeneratedComputerParameters(ipAddress);
    }

    @GetMapping("/generation-date/{ipAddress}")
    public LocalDateTime getGenerationDateByIpAddress(@PathVariable String ipAddress) {
        return computerParametersQueryPort.getGenerationDateByIpAddress(ipAddress);
    }

}