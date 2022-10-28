package com.omoluabi.hng9taskone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// rest controller class
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
public class HngController {

    // return type autowired
    @Autowired
    private DetailsStructure detailsStructure;

    // get endpoint
    @GetMapping("/firsttask")
    public DetailsStructure one(DetailsStructure detailsStructure) {

        detailsStructure.setSlackUsername("OmoluabiDaGreat");
        detailsStructure.setBackend(true);
        detailsStructure.setAge(25);
        detailsStructure.setBio("I am result-oriented and love to use technology to solve human problems");
        return detailsStructure;
    }
}
