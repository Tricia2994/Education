/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.plants.repositories;

import com.codecademy.plant.entities.Plant;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author patricia
 */
public interface PlantRepository extends CrudRepository<Plant, Integer> {

}
