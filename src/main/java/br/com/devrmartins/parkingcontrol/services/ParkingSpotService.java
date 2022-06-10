package br.com.devrmartins.parkingcontrol.services;

import br.com.devrmartins.parkingcontrol.repositories.ParkingSpotRepositorie;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    final ParkingSpotRepositorie parkingSpotRepositorie;

    public ParkingSpotService(ParkingSpotRepositorie parkingSpotRepositorie) {
        this.parkingSpotRepositorie = parkingSpotRepositorie;
    }
}
