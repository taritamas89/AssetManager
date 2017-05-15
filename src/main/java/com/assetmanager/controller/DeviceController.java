package com.assetmanager.controller;

import com.assetmanager.model.Device;
import com.assetmanager.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    @Autowired
    private DeviceRepository deviceRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Device> findDevices() {
        return deviceRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Device addDevice(@RequestBody Device device) {
        return deviceRepository.saveAndFlush(device);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Device updateDevice(@RequestBody Device updatedDevice,  @PathVariable Integer id) {
        updatedDevice.setId(id);
        return deviceRepository.saveAndFlush(updatedDevice);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteDevice(@PathVariable Integer id) {
        deviceRepository.delete(id);
    }
}





