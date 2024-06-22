package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "propertysale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertySale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_sale_id")
    private Long id;

    @ManyToOne
    private Property propertyId;

    @Column(name = "property_sale_amount")
    private Double amount;

    @Column(name = "property_sale_date")
    private Date saleDate;
}
