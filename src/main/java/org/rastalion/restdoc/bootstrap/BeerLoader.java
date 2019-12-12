package org.rastalion.restdoc.bootstrap;

import org.rastalion.restdoc.domain.Beer;
import org.rastalion.restdoc.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
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
        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
                    .beerName("Duvel")
                    .beerStyle("Trappistje")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(123456789012L)
                    .price(new BigDecimal("2.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Augustijn")
                    .beerStyle("Donker")
                    .quantityToBrew(50)
                    .minOnHand(16)
                    .upc(12354784654412L)
                    .price(new BigDecimal("3.99"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Augustijn")
                    .beerStyle("Bleek")
                    .quantityToBrew(8001)
                    .minOnHand(420)
                    .upc(123454544654414L)
                    .price(new BigDecimal("3.75"))
                    .build());
        }
    }
}
