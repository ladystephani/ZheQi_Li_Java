package com.company.gamestorecatalog.controller;

import com.company.gamestorecatalog.service.GameStoreCatalogServiceLayer;

import com.company.gamestorecatalog.viewModel.ConsoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/console")
@CrossOrigin(origins = {"http://localhost:3000"})
@RefreshScope
public class ConsoleController {

    @Autowired
    GameStoreCatalogServiceLayer service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsoleViewModel createConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel) {
        consoleViewModel = service.createConsole(consoleViewModel);
        return consoleViewModel;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ConsoleViewModel getConsole(@PathVariable("id") long consoleId) {
        ConsoleViewModel consoleViewModel = service.getConsoleById(consoleId);
        if (consoleViewModel == null) {
            throw new IllegalArgumentException("Console could not be retrieved for id " + consoleId);
        } else {
            return consoleViewModel;
        }
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel) {

        if (consoleViewModel==null || consoleViewModel.getId()< 1) {
            throw new IllegalArgumentException("Id in path must match id in view model");
        } else if (consoleViewModel.getId() > 0) {
            service.updateConsole(consoleViewModel);
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsole(@PathVariable("id") long consoleId) {
        service.deleteConsole(consoleId);
    }

    @GetMapping("/manufacturer/{manufacturer}")
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getConsoleByManufacturer(@PathVariable("manufacturer") String manu) {
        List<ConsoleViewModel> cvmByManufacturer = service.getConsoleByManufacturer(manu);
        if (cvmByManufacturer == null || cvmByManufacturer.isEmpty()) {
            throw new IllegalArgumentException("No consoles, manufactured by " + manu + ", were found");
        } else
            return cvmByManufacturer;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getAllConsoles() {
        List<ConsoleViewModel> cvmByManufacturer = service.getAllConsoles();
        if (cvmByManufacturer == null || cvmByManufacturer.isEmpty()) {
            throw new IllegalArgumentException("No consoles were found");
        } else
            return cvmByManufacturer;
    }
}
