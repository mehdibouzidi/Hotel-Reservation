package com.bouzidimhdi.lyndaspringangularapp.repository;

import com.bouzidimhdi.lyndaspringangularapp.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}
