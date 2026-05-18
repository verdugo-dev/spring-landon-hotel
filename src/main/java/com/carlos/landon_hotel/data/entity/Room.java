package com.carlos.landon_hotel.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "rooms")
@Data
@ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "bed_info")
    private String bedInfo;
}