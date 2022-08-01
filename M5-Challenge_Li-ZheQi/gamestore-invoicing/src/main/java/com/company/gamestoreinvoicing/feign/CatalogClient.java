package com.company.gamestoreinvoicing.feign;

import com.company.gamestoreinvoicing.model.Console;
import com.company.gamestoreinvoicing.model.Game;
import com.company.gamestoreinvoicing.model.TShirt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="gamestore-catalog")
public interface CatalogClient {

    //tshirt
    @RequestMapping(value="/tshirt", method = RequestMethod.GET)
    public List<TShirt> getAllTshirts();

    @RequestMapping(value="/tshirt/{id}", method = RequestMethod.GET)
    public TShirt getTshirt(@PathVariable long id);

    @RequestMapping(value="/tshirt", method = RequestMethod.POST)
    public TShirt createTShirt();

    @RequestMapping(value="/tshirt/{id}", method = RequestMethod.PUT)
    public TShirt updateTShirt();

    @RequestMapping(value="/tshirt/{id}", method = RequestMethod.DELETE)
    public TShirt deleteTShirt();

    //console
    @RequestMapping(value="/console", method = RequestMethod.GET)
    public List<Console> getAllConsoles();

    @RequestMapping(value="/console/{id}", method = RequestMethod.GET)
    public Console getConsole(@PathVariable long id);

    @RequestMapping(value="/console", method = RequestMethod.POST)
    public Console createConsole();

    @RequestMapping(value="/console/{id}", method = RequestMethod.PUT)
    public Console updateConsole();

    @RequestMapping(value="/console/{id}", method = RequestMethod.DELETE)
    public Console deleteConsole();


    //game
    @RequestMapping(value="/game", method = RequestMethod.GET)
    public List<Game> getAllGames();

    @RequestMapping(value="/game/{id}", method = RequestMethod.GET)
    public Game getGame(@PathVariable long id);

    @RequestMapping(value="/game", method = RequestMethod.POST)
    public Game createGame();

    @RequestMapping(value="/game/{id}", method = RequestMethod.PUT)
    public Game updateGame();

    @RequestMapping(value="/game/{id}", method = RequestMethod.DELETE)
    public Game deleteGame();

}
