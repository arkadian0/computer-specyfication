package com.cp.client.computerparameters;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.domain.computerparameters.view.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Collection;

@RestController
@AllArgsConstructor
public class ComputerParametersController {
    private final SpecificationComputerApplicationPort specificationComputerApplicationPort;
    private final ComputerParametersQueryPort computerParametersQueryPort;

    @PostMapping("/generate-parameters/{computerName}/{ipAddress}")
    public ComputerParametersProjection getOperatingSystem(@PathVariable String computerName, @PathVariable String ipAddress) throws InterruptedException, JAXBException, IOException {
        return specificationComputerApplicationPort.generateAndReturnComputerParameters(computerName,ipAddress);
    }

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

    @GetMapping("/all-parameters")
    public Collection<ComputerParametersVm> getAllComputerParameters(){
        return computerParametersQueryPort.getAllComputerParameters();
    }

}