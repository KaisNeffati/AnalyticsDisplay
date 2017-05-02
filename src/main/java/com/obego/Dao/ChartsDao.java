package com.obego.Dao;

import com.obego.Entity.batch_users_by_places;
import com.obego.Entity.stream_users_by_places;

import java.util.Collection;

/**
 * Created by k.neffati on 29/03/2017.
 */
public interface ChartsDao {
    Collection<stream_users_by_places> getStream();

    Collection<batch_users_by_places> getBatch();
}
