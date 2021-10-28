package edu.eci.arsw.coronavirusStats.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CoronavirusController {

    @RequestMapping(value="/cases", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCases(){
        return null;
    }
}
