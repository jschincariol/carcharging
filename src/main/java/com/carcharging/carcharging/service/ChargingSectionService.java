package com.carcharging.carcharging.service;

import com.carcharging.carcharging.controller.request.ChargingSectionRequest;
import com.carcharging.carcharging.dto.model.ChargingSection;
import org.springframework.stereotype.Service;

public interface ChargingSectionService {
    ChargingSection submit(ChargingSectionRequest request) throws Exception;
}
