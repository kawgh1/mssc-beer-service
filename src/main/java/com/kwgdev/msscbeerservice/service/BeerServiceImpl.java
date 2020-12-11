package com.kwgdev.msscbeerservice.service;

import com.kwgdev.msscbeerservice.web.model.BeerDto;
import com.kwgdev.msscbeerservice.web.model.BeerPagedList;
import com.kwgdev.msscbeerservice.web.model.BeerStyleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * created by kw on 12/11/2020 @ 2:32 PM
 */
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public BeerDto getById(UUID beerId, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto getByUpc(String upc) {
        return null;
    }
}
