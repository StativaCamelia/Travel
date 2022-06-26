package com.example.repo;

import com.example.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepo extends JpaRepository<Travel, Long> {

    @Override
    <S extends Travel> S save(S entity);
}
