package com.kwgdev.msscbeerservice.repositories;

import com.kwgdev.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * created by kw on 12/25/2020 @ 11:12 PM
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
