package com.Management.System.Student.Librery.Management.System.Repositery;

import com.Management.System.Student.Librery.Management.System.Model.BookModel;
import com.Management.System.Student.Librery.Management.System.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Optional;


@Repository
public interface BookRepo extends JpaRepository<BookModel,Integer> {
    Optional<BookModel> findByName(String name);
}
