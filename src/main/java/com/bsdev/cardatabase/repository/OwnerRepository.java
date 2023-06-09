package com.bsdev.cardatabase.repository;

import com.bsdev.cardatabase.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface OwnerRepository extends CrudRepository<Owner,Long> {
    List<Owner> findByFirstname(String firstname);
    List<Owner> findByLastname(String lastname);

}
