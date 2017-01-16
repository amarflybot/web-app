package com.amar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by amarendra on 16/1/17.
 */
@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long>{

    @RestResource(path = "by-name")
    Collection<Person> findByName(@Param("rn") String rn);
}
