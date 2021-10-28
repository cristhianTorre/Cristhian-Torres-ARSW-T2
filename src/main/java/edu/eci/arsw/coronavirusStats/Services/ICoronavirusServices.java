package edu.eci.arsw.coronavirusStats.Services;

import edu.eci.arsw.coronavirusStats.Model.Case;

import java.util.List;

public interface ICoronavirusServices {
    List<Case> getAllCases() throws CoronavirusServicesException;
    List<Case> getCasesByCountry(String country) throws CoronavirusServicesException;
}
