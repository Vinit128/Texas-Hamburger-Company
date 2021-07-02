package com.example.texashamburgercompany.Controller;

import com.example.texashamburgercompany.Model.Location;

import com.example.texashamburgercompany.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value="location")
public class LocationController {

    @Autowired
    private LocationService ls;

    @RequestMapping(method = RequestMethod.GET)
    public List<Location> findAll() {
        return null;
    }


}










// @Component --  to handle all the request related to Reservations
//@Request Mapping --  from the outside world/client it will map to the controller ( API hitpoint )
//@PathVariable --