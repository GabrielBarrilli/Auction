package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "auctiontype")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuctionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auctiontype_id")
    private Long id;

    @Column(name = "auctiontype_descricao")
    private String description;
}
