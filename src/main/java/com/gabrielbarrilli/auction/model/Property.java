package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "property")
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id")
    private Long id;

    @Column(name = "property_descricao")
    private String descricao;

    @ManyToOne
    private CityState cityStateId;

    @ManyToOne
    private Zip zipId;

    @ManyToOne
    private PropertyType propertyTypeId;

    @Column(name = "property_cod")
    private String cod;

    @Column(name = "property_saleprice")
    private Double salePrice;

    @Column(name = "property_urlzillow")
    private String urlZillow;

    @ManyToOne
    private Owner ownerId;

    @ManyToOne
    private Parcel parcelId;

    @Column(name = "property_bedqty")
    private Integer bedQty;

    @Column(name = "property_bathqty")
    private Integer bathQty;

    @Column(name = "property_sqft")
    private Integer sqft;

    @Column(name = "property_parkqty")
    private Integer parkQty;

    @Column(name = "property_hoa")
    private Double hoa;
}

