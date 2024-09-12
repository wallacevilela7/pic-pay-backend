package wvsdev.backendpicpayprojeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wvsdev.backendpicpayprojeto.domain.transaction.Transaction;
import wvsdev.backendpicpayprojeto.domain.user.User;
import wvsdev.backendpicpayprojeto.dtos.TransactionDTO;
import wvsdev.backendpicpayprojeto.dtos.UserDTO;
import wvsdev.backendpicpayprojeto.services.TransactionService;
import wvsdev.backendpicpayprojeto.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transactionDTO) throws Exception {
        Transaction newTransaction = this.transactionService.createTransaction(transactionDTO);
        return new ResponseEntity<>(newTransaction, HttpStatus.CREATED);
    }
}
