package com.codecademy.boots.repositories;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface BootRepository extends CrudRepository< Interger, Boot> {

    public Optional<Boot> findById(Integer id);

    public List<Boot> findBySize(Float size);

    public List<Boot> findByMaterial(String material);

    public List<Boot> findbyType(BootType type);

    public List<Boot> findByQuantityGreaterThan(Integer quantity);

    public List<Boot> findByMaterialAndQuantityGreaterThan(String material, Integer minQuantity);

    public List<Boot> findByMaterialAndSizeAndQuantityGreaterThan(String material, Float size, Integer minQuantity);

    public List<Boot> findByTypeAndSizeAndQuantityGreaterThan(BootType type, Float size, Integer minQuantity);

    public List<Boot> findByTypeAndQuantityGreaterThan(BootType type, Integer minQuantity);

    public void findBySize();
}
