package com.kwgdev.common.events;

import com.kwgdev.msscbeerservice.web.model.BeerDto;
import lombok.*;

/**
 * created by kw on 1/3/2021 @ 1:03 PM
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
