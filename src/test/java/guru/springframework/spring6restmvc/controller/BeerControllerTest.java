package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BeerControllerTest {
    @Autowired
    BeerController beerController;

    @Test
    void getBeerbyId() {
        System.out.println(beerController.getBeerbyId(UUID.randomUUID()));
    }
}