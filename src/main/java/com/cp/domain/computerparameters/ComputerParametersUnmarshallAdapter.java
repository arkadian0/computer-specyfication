package com.cp.domain.computerparameters;

import com.cp.config.CmdCommandValue;
import com.cp.domain.computerparameters.port.ComputerParametersGeneratePort;
import com.cp.infrastructure.unmarshall.port.UnmarshallPort;
import com.cp.shared.model.cmd.BiosElement;
import com.cp.shared.model.cmd.InternalMemoryElement;
import com.cp.shared.model.cmd.ProcessorElement;
import com.cp.shared.model.cmd.UserElement;
import com.cp.shared.model.xml.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class ComputerParametersUnmarshallAdapter extends CmdCommandValue implements ComputerParametersGeneratePort {

    private final UnmarshallPort unmarshallPort;
    private final File xmlFileToUnMarshall;
    private DxDiagElement dxDiagElement;

    @PostConstruct
    private void postConstruct() throws JAXBException {
        dxDiagElement = unmarshallPort.unmarshallXml(xmlFileToUnMarshall, DxDiagElement.class);
    }


    @Override
    public ComputerParametersProjection generateComputerParameters() throws IOException, InterruptedException {
       List<DisplayDevice> displayDevices = generateGraphicCard();
        OperatingSystem operatingSystem = generateOperatingSystem();
        List<HardDrive> hardDrives = generateHardDrive();
        List<SoundDevice> soundDevices = generateSoundDevice();
        List<CaptureDevice> captureDevices = generateCaptureDevice();
        List<Bios> biosList = generateBios();
        List<InternalMemory> internalMemories = genetareInternalMemory();
        List<Processor> processors = generateProcessor();
        List<SystemUser> users = generateUser();
        List<VideoDevice> videoDevices = generateVideoCaptureDevice();
        List<SystemDevice> systemDevices = generateSystemDevice();
        List<DirectInputDevice> directInputDevices = generateDirectInputDevice();
        List<UsbDevice> usbDevices = generateUsbDevice();
        List<Ps2Device> ps2Devices = generatePs2Device();
        /*return ComputerParameters.builder()
                .displayDevices(displayDevices)
                .bios(biosList)
                .operatingSystem(operatingSystem)
                .hardDrives(hardDrives)
                .soundDevices(soundDevices)
                .captureDevices(captureDevices)
                .internalMemories(internalMemories)
                .processors(processors)
                .users(users)
                .videoDevices(videoDevices)
                .systemDevices(systemDevices)
                .directInputDevices(directInputDevices)
                .usbDevices(usbDevices)
                .ps2Devices(ps2Devices)
                .build();*/
        return null;
    }

    List<DisplayDevice> generateGraphicCard() {
        List<GraphicCardElement> graphicCardElements = dxDiagElement.getDisplayDevicesElement().getGraphicCardElements();
        return Optional.ofNullable(graphicCardElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(DisplayDevice::of)
                .collect(Collectors.toList());
    }

    OperatingSystem generateOperatingSystem() {
        Optional<SystemInformationElement> systemInformationElements = Optional.ofNullable(dxDiagElement.getSystemInfomationElement());
        return systemInformationElements.map(OperatingSystem::of).orElse(null);
    }

    List<HardDrive> generateHardDrive() {
        List<LogicalDiskElement> logicalDiskElements = dxDiagElement.getLogicalDiskRootElement().getLogicalDiskElements();
        return Optional.ofNullable(logicalDiskElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(HardDrive::of)
                .collect(Collectors.toList());
    }

    List<SoundDevice> generateSoundDevice() {
        List<SoundDeviceElement> soundDevices = dxDiagElement.getDirectSoundElement().getSoundDevicesElements().getSoundDeviceElements();
        return Optional.ofNullable(soundDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(SoundDevice::of)
                .collect(Collectors.toList());
    }

    List<CaptureDevice> generateCaptureDevice() {
        List<SoundCaptureDeviceElement> captureDeviceElements = dxDiagElement.getDirectSoundElement().getSoundCaptureDevicesElements().getSoundCaptureDeviceElements();
        return Optional.ofNullable(captureDeviceElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(CaptureDevice::of)
                .collect(Collectors.toList());
    }

    List<InternalMemory> genetareInternalMemory() throws IOException, InterruptedException {
        List<InternalMemoryElement> internalMemoryElements = unmarshallPort.unmarshallInternalMemoryParameters(cmdInternalMemoryInfoCommand, cmdNumberOfParameterInternalMemory);
        return Optional.ofNullable(internalMemoryElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(InternalMemory::of)
                .collect(Collectors.toList());
    }

    List<Processor> generateProcessor() throws IOException, InterruptedException {
        List<ProcessorElement> processorElements = unmarshallPort.unmarshallProcessorParameters(cmdProcessorInfoCommand, cmdNumberOfParameterProcessor);
        return Optional.ofNullable(processorElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(Processor::of)
                .collect(Collectors.toList());
    }

    List<Bios> generateBios() throws IOException, InterruptedException {
        List<BiosElement> biosElements = unmarshallPort.unmarshallBiosParameters(cmdBiosInfoCommand, cmdNumberOfParameterBios);
        return Optional.ofNullable(biosElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(Bios::of)
                .collect(Collectors.toList());
    }

    List<SystemUser> generateUser() throws IOException, InterruptedException {
        List<UserElement> userElements = unmarshallPort.unmarshallUserParameters(cmdUserInfoCommand, cmdNumberOfParameterUser);
        return Optional.ofNullable(userElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(SystemUser::of)
                .collect(Collectors.toList());
    }

    List<VideoDevice> generateVideoCaptureDevice() {
        List<VideoCaptureDeviceElement> videoCaptureDevices = dxDiagElement.getVideoCaptureDevicesElement().getVideoCaptureDevices();
        return Optional.ofNullable(videoCaptureDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(VideoDevice::of)
                .collect(Collectors.toList());
    }

    List<SystemDevice> generateSystemDevice() {
        List<SystemDeviceElement> systemDeviceElements = dxDiagElement.getSystemDevicesElement().getSystemDeviceElements();
        return Optional.ofNullable(systemDeviceElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(SystemDevice::of)
                .collect(Collectors.toList());
    }

    List<DirectInputDevice> generateDirectInputDevice() {
        List<DirectInputDeviceElement> directInputDevices = dxDiagElement.getDirectInputElement().getDirectInputDevice().getDirectInputDeviceElements();
        return Optional.ofNullable(directInputDevices)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(DirectInputDevice::of)
                .collect(Collectors.toList());
    }

    List<UsbDevice> generateUsbDevice() {
        List<InputRelatedDeviceUsbElement> inputRelatedDeviceUsbList = dxDiagElement.getDirectInputElement().getUsbRoot().getInputRelatedDeviceUsbList();
        return Optional.ofNullable(inputRelatedDeviceUsbList)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(UsbDevice::of)
                .collect(Collectors.toList());
    }

    List<Ps2Device> generatePs2Device() {
        List<InputRelatedDevicePs2Element> inputRelatedDevicePs2Elements = dxDiagElement.getDirectInputElement().getPs2Device().getInputRelatedDevicePs2List();
        return Optional.ofNullable(inputRelatedDevicePs2Elements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(Ps2Device::of)
                .collect(Collectors.toList());
    }
}
