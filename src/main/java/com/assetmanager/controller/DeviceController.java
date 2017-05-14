package com.assetmanager.controller;

import com.assetmanager.model.Device;
import com.assetmanager.service.DeviceService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(final DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Device>> findAll() {
        return ResponseEntity.ok(deviceService.findAll());
    }

    @GetMapping(value = "/{device_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Device> get(@PathVariable("device_id") String deviceId) {
        return ResponseEntity.ok(deviceService.get(deviceId));
    }

}
