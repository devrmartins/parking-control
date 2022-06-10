package br.com.devrmartins.parkingcontrol.repositories;

import br.com.devrmartins.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepositorie extends JpaRepository<ParkingSpotModel, UUID> {
}
