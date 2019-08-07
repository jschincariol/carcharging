package com.carcharging.carcharging.repository;

import com.carcharging.carcharging.dto.model.ChargingSection;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ChargingSectionRepository extends CrudRepository<ChargingSection, UUID>{
}
