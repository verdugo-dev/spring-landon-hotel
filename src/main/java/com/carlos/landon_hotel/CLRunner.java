package com.carlos.landon_hotel;

import org.springframework.stereotype.Component;

import com.carlos.landon_hotel.data.entity.Guest;
import com.carlos.landon_hotel.data.entity.Reservation;
import com.carlos.landon_hotel.data.entity.Room;
import com.carlos.landon_hotel.data.repository.GuestRepository;
import com.carlos.landon_hotel.data.repository.ReservationRepository;
import com.carlos.landon_hotel.data.repository.RoomRepository;
import com.carlos.landon_hotel.service.RoomReservationService;
import com.carlos.landon_hotel.service.model.RoomReservation;

import java.util.List;
// import java.util.Optional;

import org.springframework.boot.CommandLineRunner;

@Component
public class CLRunner implements CommandLineRunner {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final RoomReservationService roomReservationService;

    public CLRunner(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository, RoomReservationService roomReservationService) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.roomReservationService = roomReservationService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<RoomReservation> reservations = this.roomReservationService.getRoomReservationForDate("2023-08-28");
        reservations.forEach(System.out::println);
    }

}
