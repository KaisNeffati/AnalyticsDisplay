package com.obego.Service;

import com.obego.Dao.ChartsDao;
import com.obego.Entity.batch_users_by_places;
import com.obego.Entity.stream_users_by_places;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by k.neffati on 29/03/2017.
 */
@Service
public class ChartService {

    @Autowired
    @Qualifier("cassandraDb")
    ChartsDao chartsDao;

    public Collection<stream_users_by_places> getStream(){
        return chartsDao.getStream();
    }
    public Collection<batch_users_by_places> getBatch(){
        return chartsDao.getBatch();
    }

}
