package ru.mtuci.simpleapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simpleapi.model.Formula_1;
import ru.mtuci.simpleapi.service.FormulaService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = FormulaController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class FormulaController {
    public static final String REST_URL = "/api/v1/formula";

    private FormulaService formulaService;

    @Autowired
    public FormulaController(FormulaService formulaService) {
        this.formulaService = formulaService;
    }

    @GetMapping
    public List<Formula_1> getAll() {
        log.info("get all");
        return formulaService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Formula_1 get(@PathVariable("id") Long id) {
        log.info("get "+ id);
        return formulaService.get(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Formula_1 save(@RequestBody Formula_1 formula_1) {
        log.info("save " + formula_1);
        return formulaService.save(formula_1);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        log.info("delete " + id);
        formulaService.delete(id);
    }
}
