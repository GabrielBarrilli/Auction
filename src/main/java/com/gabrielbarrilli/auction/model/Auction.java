package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "auction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_id")
    private Long id;

    @Column(name = "auction_property_id")
    private Long propertyId;

    @Column(name = "auction_date")
    private Date auctionDate;

    @Column(name = "auction_auctiontype_id")
    private Long auctionTypeId;

    @Column(name = "auction_initialbid")
    private Double initialBid;

    @Column(name = "auction_finalbid")
    private Double finalBid;

    @Column(name = "auction_assessedvalue")
    private Double assessedValue;

    @Column(name = "auction_casenumber")
    private String caseNumber;

    @Column(name = "auction_saledate")
    private Date saleDate;
}
