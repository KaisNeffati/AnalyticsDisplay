package com.obego.Dao;

import com.google.common.collect.Lists;
import com.obego.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by k.neffati on 28/03/2017.
 */
@Repository
@Qualifier("cassandraDb")
public class CassandraChartsDaoImpl implements ChartsDao {

    @Autowired
    StreamRepository streamRepository;

    @Autowired
    BatchRepository batchRepository;

    @Override
    public Collection<stream_users_by_places> getStream(){
        return Lists.newArrayList(streamRepository.findAll());
    }
    @Override
    public Collection<batch_users_by_places> getBatch(){
        return Lists.newArrayList(batchRepository.findAll());
    }

}
