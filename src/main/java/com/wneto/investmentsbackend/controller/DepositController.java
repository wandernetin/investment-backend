package com.wneto.investmentsbackend.controller;

import com.wneto.investmentsbackend.domain.Deposit;
import com.wneto.investmentsbackend.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deposit")
@CrossOrigin(origins = "http://localhost:3000")
public class DepositController {

    private final DepositService depositService;

    @Autowired
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @GetMapping
    public ResponseEntity<List<Deposit>> getAll() {
        return new ResponseEntity<>(depositService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Deposit> getDeposit(@PathVariable Long id) {
        return new ResponseEntity<>(depositService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Deposit> createDeposit(@RequestBody Deposit deposit) {
        return new ResponseEntity<>(depositService.save(deposit), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Deposit> updateDeposit(@RequestBody Deposit deposit) {
        return new ResponseEntity<>(depositService.save(deposit), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteDeposit(@PathVariable Long id) {
        depositService.delete(depositService.findById(id));
    }

}
