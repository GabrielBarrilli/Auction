package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "property_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "propertytype_id")
    private Long id;

    @Column(name = "propertytype_descricao")
    private String descricao;
}