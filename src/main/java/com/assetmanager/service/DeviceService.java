package com.assetmanager.service;

import com.assetmanager.model.Device;
import com.assetmanager.repositories.DeviceRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService implements GenericService<Device, String> {
    private final DeviceRepository deviceRepository;

    public DeviceService(final DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Long getId(Device entity) {
        return entity.getId();
    }

    @Override
    public CrudRepository<Device, String> getRepository() {
        return this.deviceRepository;
    }
}
