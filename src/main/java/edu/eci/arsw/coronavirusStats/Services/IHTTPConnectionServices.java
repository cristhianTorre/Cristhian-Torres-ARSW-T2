package edu.eci.arsw.coronavirusStats.Services;

import org.json.JSONObject;

public interface IHTTPConnectionServices {

    JSONObject getAllCases() throws CoronavirusServicesException;
    JSONObject getCasesByCountry(String country) throws CoronavirusServicesException;
    JSONObject getCordsOfCountry(String country) throws CoronavirusServicesException;
}
