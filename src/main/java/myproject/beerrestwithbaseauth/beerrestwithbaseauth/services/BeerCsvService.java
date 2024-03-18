package myproject.beerrestwithbaseauth.beerrestwithbaseauth.services;


import myproject.beerrestwithbaseauth.beerrestwithbaseauth.model.BeerCSVRecord;

import java.io.File;
import java.util.List;

public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}