package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class Proprieties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;

    private String code;

    private String salePrice;

    private String urlZillow;

    @ManyToOne
    private Owner owner_id;

    @ManyToOne
    private City_State cityState_id;

    @ManyToOne
    private Zip zip_id;

    @ManyToOne
    private Proprieties_Type proprieties_type_id;
}
