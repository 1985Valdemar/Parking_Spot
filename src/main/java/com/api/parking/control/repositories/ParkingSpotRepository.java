package com.api.parking.control.repositories;

import com.api.parking.control.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);//metodo declarado.
    boolean existsByParkingSpotNumber(String parkingSpotNumber);//metodo declarado
    boolean existsByApartmentAndBlock(String apartment, String block);//metodo and 2 parametros
}
