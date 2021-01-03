package com.kwgdev.msscbeerservice.events;

import com.kwgdev.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * created by kw on 1/3/2021 @ 1:01 PM
 */
@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -791324981724981L;

    private final BeerDto beerDto;
}
