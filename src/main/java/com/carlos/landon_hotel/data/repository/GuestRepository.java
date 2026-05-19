package com.carlos.landon_hotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.landon_hotel.data.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long>{

}
