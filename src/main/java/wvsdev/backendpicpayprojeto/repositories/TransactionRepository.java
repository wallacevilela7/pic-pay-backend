package wvsdev.backendpicpayprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wvsdev.backendpicpayprojeto.domain.transaction.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}