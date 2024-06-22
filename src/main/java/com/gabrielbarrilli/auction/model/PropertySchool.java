package com.gabrielbarrilli.auction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "property_school")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertySchool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_school_id")
    private Long id;

    @ManyToOne
    private School schoolId;

    @ManyToOne
    private Property propertyId;
}
