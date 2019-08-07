package com.carcharging.carcharging.service;

import com.carcharging.carcharging.controller.request.ChargingSectionRequest;
import com.carcharging.carcharging.dto.model.ChargingSection;
import com.carcharging.carcharging.dto.model.StatusEnum;
import com.carcharging.carcharging.repository.ChargingSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ChargingSectionServiceImpl implements ChargingSectionService {

    //@Autowired
   // private ChargingSectionRepository repository;

    @Override
    public ChargingSection submit(ChargingSectionRequest request) throws Exception {
        ChargingSection chargingSection = createChargingSection(request.getStationId());
        //repository.save(chargingSection);
        return chargingSection;
    }

    private ChargingSection createChargingSection(String stationId) {
        ChargingSection chargingSection = new ChargingSection();
        chargingSection.setStartedAt(LocalDateTime.now());
        chargingSection.setStationId(stationId);
        chargingSection.setStatus(StatusEnum.IN_PROGRESS);
        return chargingSection;
    }
}
