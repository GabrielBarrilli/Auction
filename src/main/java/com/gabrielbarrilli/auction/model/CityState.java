package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citystate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_state_id")
    private Long id;

    @ManyToOne
    private City cityId;

    @ManyToOne
    private State stateId;

}
