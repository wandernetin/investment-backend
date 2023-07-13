package com.wneto.investmentsbackend.controller;

import com.wneto.investmentsbackend.service.InvestmentTypeService;
import com.wneto.investmentsbackend.domain.InvestmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investmentType")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestmentTypeController {

    private final InvestmentTypeService investmentTypeService;

    @Autowired
    public InvestmentTypeController(InvestmentTypeService investmentTypeService) {
        this.investmentTypeService = investmentTypeService;
    }

    @GetMapping
    public ResponseEntity<List<InvestmentType>> getAll() {
        return new ResponseEntity<>(investmentTypeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvestmentType> getInvestmentType(@PathVariable Long id) {
        return new ResponseEntity<>(investmentTypeService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<InvestmentType> createInvestmentType(@RequestBody InvestmentType investmentType) {
        return new ResponseEntity<>(investmentTypeService.save(investmentType), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<InvestmentType> updateInvestmentType(@RequestBody InvestmentType investmentType) {
        return new ResponseEntity<>(investmentTypeService.save(investmentType), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteInvestmentType(@PathVariable Long id) {
        investmentTypeService.delete(investmentTypeService.findById(id));
    }

}
