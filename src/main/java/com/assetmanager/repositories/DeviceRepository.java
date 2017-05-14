package com.assetmanager.repositories;

import com.assetmanager.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DeviceRepository extends JpaRepository<Device, String> {

}
