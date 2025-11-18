package com.Management.System.Student.Librery.Management.System.Repositery;

import com.Management.System.Student.Librery.Management.System.Model.CardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<CardModel,Integer> {
}
