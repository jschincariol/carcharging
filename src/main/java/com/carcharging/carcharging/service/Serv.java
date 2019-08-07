package com.carcharging.carcharging.service;

import com.carcharging.carcharging.repository.ChargingSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serv {
    @Autowired
    private ChargingSectionRepository repository;
}
