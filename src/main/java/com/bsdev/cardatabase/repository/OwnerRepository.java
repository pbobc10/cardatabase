package com.bsdev.cardatabase.repository;

import com.bsdev.cardatabase.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
