package com.obego.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by k.neffati on 30/03/2017.
 */
@Repository
public interface BatchRepository extends CrudRepository<batch_users_by_places,String> {

}
