package com.bouzidimhdi.lyndaspringangularapp.repository;

import com.bouzidimhdi.lyndaspringangularapp.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

    RoomEntity findOne(Long id);

}
