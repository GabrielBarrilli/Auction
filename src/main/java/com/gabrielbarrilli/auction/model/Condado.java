package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "condado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Condado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "condado_id")
    private Long id;

    @Column(name = "condado_descricao")
    private String description;
}
