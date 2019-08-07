package com.carcharging.carcharging.controller.api;

import com.carcharging.carcharging.controller.request.ChargingSectionRequest;
import com.carcharging.carcharging.dto.model.ChargingSection;
import com.carcharging.carcharging.service.ChargingSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChargingSectionController {
    @Autowired
    private ChargingSectionService service;

    @PostMapping("/chargingSessions")
    public ResponseEntity<ChargingSection> submitChargingSection(ChargingSectionRequest request) throws Exception {
        ChargingSection submit = service.submit(request);
        return new ResponseEntity<ChargingSection>(submit, HttpStatus.OK);
    }
}
