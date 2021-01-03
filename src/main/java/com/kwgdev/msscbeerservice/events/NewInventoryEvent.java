package com.kwgdev.msscbeerservice.events;

import com.kwgdev.msscbeerservice.web.model.BeerDto;

/**
 * created by kw on 1/3/2021 @ 1:03 PM
 */
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
