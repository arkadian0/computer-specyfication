package com.cp.client.computerparameters;

import com.cp.application.ports.SpecificationComputerPort;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.port.ComputerParametersGeneratePort;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.domain.computerparameters.view.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Collection;

@RestController
@AllArgsConstructor
public class ComputerParametersController {

    private final ComputerParametersQueryPort computerParametersQueryPort;
    private final ComputerParametersGeneratePort computerParametersGeneratePort;

    @GetMapping("/all-parameters")
    public ComputerParametersProjection getOperatingSystem() throws InterruptedException, JAXBException, IOException {
        return computerParametersGeneratePort.generateComputerParameters();
    }

    @GetMapping("/bios/{computerName}")
    public Collection<BiosVM> getBiosParametersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getBiosByComputerName(computerName);
    }

    @GetMapping("/capture-devices/{computerName}")
    public Collection<CaptureDeviceVm> getCaptureDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getCaptureDevicesByComputerName(computerName);
    }

    @GetMapping("/direct-input-devices/{computerName}")
    public Collection<DirectInputDeviceVm> getDirectInputDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getDirectInputDevicesByComputerName(computerName);
    }

    @GetMapping("/display-devices/{computerName}")
    public Collection<DisplayDeviceVm> getDisplayDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getDisplayDevicesByComputerName(computerName);
    }

    @GetMapping("/hard-drives/{computerName}")
    public Collection<HardDriveVm> getHardDriveByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getHardDrivesByComputerName(computerName);
    }

    @GetMapping("/internal-memories/{computerName}")
    public Collection<InternalMemoryVm> getInternalMemoriesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getInternalMemoriesByComputerName(computerName);
    }

    @GetMapping("/operating-systems/{computerName}")
    public Collection<OperatingSystemVm> getOperatingSystemsByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getOperatingSystemsByComputerName(computerName);
    }

    @GetMapping("/processors/{computerName}")
    public Collection<ProcessorVm> getProcessorsByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getProcessorsByComputerName(computerName);
    }

    @GetMapping("/ps2-devices/{computerName}")
    public Collection<Ps2DeviceVm> getPs2DevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getPs2DevicesByComputerName(computerName);
    }

    @GetMapping("/sound-devices/{computerName}")
    public Collection<SoundDeviceVm> getSoundDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getSoundDevicesByComputerName(computerName);
    }

    @GetMapping("/system-devices/{computerName}")//error
    public Collection<SystemDeviceVm> getSystemDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getSystemDevicesByComputerName(computerName);
    }

    @GetMapping("/system-users/{computerName}")
    public Collection<SystemUserVm> getSystemUsersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getSystemUsersByComputerName(computerName);
    }

    @GetMapping("/usb-devices/{computerName}")
    public Collection<UsbDeviceVm> getUsbDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getUsbDevicesByComputerName(computerName);
    }

    @GetMapping("/video-devices/{computerName}")
    public Collection<VideoDeviceVm> getVideoDevicesByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getVideoDevicesByComputerName(computerName);
    }

}