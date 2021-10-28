package edu.eci.arsw.coronavirusStats.Controller;

import edu.eci.arsw.coronavirusStats.Services.CoronavirusServicesException;
import edu.eci.arsw.coronavirusStats.Services.ICoronavirusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CoronavirusController {

    @Autowired
    ICoronavirusServices cs;

    @RequestMapping(value="/cases", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCases(){
        try{
            return new ResponseEntity<>(cs.getAllCases(), HttpStatus.ACCEPTED);
        } catch (CoronavirusServicesException e) {
            if(e.getMessage().equals("Cases not found")){
                return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="/cases/{country}", method = RequestMethod.GET)
    public ResponseEntity<?> getCasesByCountry(@PathVariable(name="country") String country){
        try{
            return new ResponseEntity<>(cs.getCasesByCountry(country),HttpStatus.ACCEPTED);
        } catch (CoronavirusServicesException e) {
            if(e.getMessage().equals("Cases not found")){
                return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}
