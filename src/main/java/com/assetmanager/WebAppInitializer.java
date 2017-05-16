package com.assetmanager;

import com.assetmanager.model.Device;
import com.assetmanager.model.History;
import com.assetmanager.model.User;
import com.assetmanager.repositories.DeviceRepository;
import com.assetmanager.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Date;

@SpringBootApplication(scanBasePackages={"com.assetmanager"}) // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class WebAppInitializer implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) throws Exception{
        SpringApplication.run(WebAppInitializer.class, args);
    }

    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        Device deviceA = new Device("Device A", new Date(), true);

        User userA = new User("User A");

        History history = new History();
        history.setDevice(deviceA);
        history.setUser(userA);
        history.setAssignedDate(new Date());

        deviceA.getHistories().add(history);

        userRepository.save(userA);
        deviceRepository.save(deviceA);

        // test
//        System.out.println(deviceA.getHistories().size());
        logger.debug("Device history size: " + deviceA.getHistories().size());

        // update
//        deviceA.getHistories().remove(history);
//        deviceRepository.save(deviceA);

        // test
//        System.out.println(deviceA.getHistories().size());
        logger.debug("Device history size2: " + deviceA.getHistories().size());
    }
}
