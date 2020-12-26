package com.kwgdev.msscbeerservice.web.mappers;

import com.kwgdev.msscbeerservice.domain.Beer;
import com.kwgdev.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * created by kw on 12/26/2020 @ 2:41 AM
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
