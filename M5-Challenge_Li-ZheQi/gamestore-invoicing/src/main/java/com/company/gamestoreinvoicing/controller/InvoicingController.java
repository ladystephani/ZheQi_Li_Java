package com.company.gamestoreinvoicing.controller;

import com.company.gamestoreinvoicing.feign.CatalogClient;
import com.company.gamestoreinvoicing.model.Console;
import com.company.gamestoreinvoicing.model.Game;
import com.company.gamestoreinvoicing.model.TShirt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class InvoicingController {
    @Autowired
    private final CatalogClient client;

    InvoicingController(CatalogClient client) {
        this.client = client;
    }

    //tshirt
    @GetMapping(value="/tshirt")
    public List<TShirt> invoicingGetTshirts() {
        return client.getAllTshirts();
    }

    @GetMapping(value="/tshirt/{id}")
    public TShirt invoicingGetOneTshirt() {
        return client.getTshirt();
    }

    @PostMapping(value="/tshirt")
    public TShirt invoicingCreateTShirt() {
        return client.createTShirt();
    }

    @PutMapping(value="/tshirt/{id}")
    public TShirt invoicingUpdateTShirt(){
        return client.updateTShirt();
    };

    @DeleteMapping(value="/tshirt/{id}")
    public TShirt invoicingDeleteTShirt(){
        return client.deleteTShirt();
    };

    //console
    @GetMapping(value="/console")
    public List<Console> invoicingGetConsoles() {
        return client.getAllConsoles();
    }

    @GetMapping(value="/console/{id}")
    public Console invoicingGetOneConsole() {
        return client.getConsole();
    }

    @PostMapping(value="/console")
    public Console invoicingCreateConsole() {
        return client.createConsole();
    }

    @PutMapping(value="/console/{id}")
    public Console invoicingUpdateConsole(){
        return client.updateConsole();
    };

    @DeleteMapping(value="/console/{id}")
    public Console invoicingDeleteConsole(){
        return client.deleteConsole();
    };

    //game
    @GetMapping(value="/game")
    public List<Game> invoicingGetGames() {
        return client.getAllGames();
    }

    @GetMapping(value="/game/{id}")
    public Game invoicingGetOneGame() {
        return client.getGame();
    }

    @PostMapping(value="/game")
    public Game invoicingCreateGame() {
        return client.createGame();
    }

    @PutMapping(value="/game/{id}")
    public Game invoicingUpdateGame(){
        return client.updateGame();
    };

    @DeleteMapping(value="/game/{id}")
    public Game invoicingDeleteGame(){
        return client.deleteGame();
    };
}
