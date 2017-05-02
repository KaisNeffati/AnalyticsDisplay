package com.obego.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by k.neffati on 28/03/2017.
 */
@Repository
public interface StreamRepository extends CrudRepository<stream_users_by_places,String> {

}
