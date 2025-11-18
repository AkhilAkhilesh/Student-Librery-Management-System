package com.Management.System.Student.Librery.Management.System.Repositery;

import com.Management.System.Student.Librery.Management.System.Model.BookModel;
import com.Management.System.Student.Librery.Management.System.Model.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionRepo extends JpaRepository<TransactionModel,Integer> {
    Optional<TransactionModel> findByName(String name);
}
