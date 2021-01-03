package com.kwgdev.msscbeerservice.events;

import com.kwgdev.msscbeerservice.web.model.BeerDto;

/**
 * created by kw on 1/3/2021 @ 1:02 PM
 */
public class BrewBeerEvent extends BeerEvent {

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
