package com.obego.Controller;

import com.obego.Entity.batch_users_by_places;
import com.obego.Entity.stream_users_by_places;
import com.obego.Service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by k.neffati on 28/03/2017.
 */
@RestController
public class MainController {

    @Autowired
    private ChartService chartService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value ="/greeting",method=RequestMethod.GET, produces="application/json")
    public stream_users_by_places greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new stream_users_by_places(counter.incrementAndGet(),
                String.format(template, name));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/Stream",method= RequestMethod.GET, produces="application/json")
    public Collection<stream_users_by_places> stream() {
        return chartService.getStream();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/Batch",method= RequestMethod.GET, produces="application/json")
    public Collection<batch_users_by_places> batch() {
        return chartService.getBatch();
    }
}
