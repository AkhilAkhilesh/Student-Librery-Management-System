package com.Management.System.Student.Librery.Management.System.Repositery;

import com.Management.System.Student.Librery.Management.System.Model.BookModel;
import com.Management.System.Student.Librery.Management.System.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookModel,Integer> {
}
