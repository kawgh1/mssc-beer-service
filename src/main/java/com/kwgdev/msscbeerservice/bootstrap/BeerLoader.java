package com.kwgdev.msscbeerservice.bootstrap;

import com.kwgdev.msscbeerservice.domain.Beer;
import com.kwgdev.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * created by kw on 12/25/2020 @ 11:14 PM
 */
@Component // CommandLineRunner means this class runs every time Spring Context starts
public class BeerLoader implements CommandLineRunner {
    
    private final BeerRepository beerRepository;
    
    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
        
    }

    private void loadBeerObjects() {
        // if BeerRepository is empty on startup, then save some beers there for data
        // If this app is connected to a persistent datasource with existing data, this code will be skipped
        if(beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minQuantityOnHand(12)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("Pale Ale")
                    .quantityToBrew(200)
                    .minQuantityOnHand(12)
                    .upc(337010000002L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }

        // Confirm number of beers loaded in console
        System.out.println("Loaded Beers: " + beerRepository.count());
    }


}
