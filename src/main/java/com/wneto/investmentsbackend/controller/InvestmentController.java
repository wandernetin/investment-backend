package com.wneto.investmentsbackend.controller;

import com.wneto.investmentsbackend.domain.Investment;
import com.wneto.investmentsbackend.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investment")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestmentController {

    private final InvestmentService investmentService;

    @Autowired
    public InvestmentController(InvestmentService investmentService) {
        this.investmentService = investmentService;
    }

    @GetMapping
    public ResponseEntity<List<Investment>> getAll() {
        return new ResponseEntity<>(investmentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investment> getInvestment(@PathVariable Long id) {
        return new ResponseEntity<>(investmentService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Investment> createInvestment(@RequestBody Investment investment) {
        return new ResponseEntity<>(investmentService.save(investment), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Investment> updateInvestment(@RequestBody Investment investment) {
        return new ResponseEntity<>(investmentService.save(investment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteInvestment(@PathVariable Long id) {
        investmentService.delete(investmentService.findById(id));
    }
}
