package com.codecademy.plants.repositories;

import com.codecademy.plants.entities.Adventure;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AdventureRepository extends CrudRepository<Adventure, Integer> {

    public List<Adventure> findByCountry(String country);

    public List<Adventure> findByState(String state);
}
