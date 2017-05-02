package com.obego.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by k.neffati on 28/03/2017.
 */
@Table
public class stream_users_by_places {
    @Id
    private final String place;

    private final long persons_by_place;

    public stream_users_by_places(long persons_by_place, String place) {
        this.persons_by_place = persons_by_place;
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public long getPersons_by_place() {
        return persons_by_place;
    }
}
