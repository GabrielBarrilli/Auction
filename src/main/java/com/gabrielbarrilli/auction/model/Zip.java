package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "zip")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Zip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zip_id")
    private Long id;

    @Column(name = "zip_descricao")
    private String description;
}
