package com.kwgdev.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by kw on 1/12/2021 @ 8:14 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidateOrderRequest {

    private BeerOrderDto beerOrder;
}
