package com.kwgdev.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * created by kw on 12/11/2020 @ 2:02 PM
 */
// lombok annotations - constructors, getters, setters, etc.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyleEnum;

    private Long upc;

    private BigDecimal price;

    private Integer quantityOnHand;
}
