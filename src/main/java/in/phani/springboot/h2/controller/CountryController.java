package in.phani.springboot.h2.controller;

import in.phani.springboot.h2.pojo.Country;
import in.phani.springboot.h2.repository.CountryRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

  private final CountryRepository countryRepository;

  public CountryController(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  @GetMapping("/country")
  public Iterable<Country> getAllCountries() {
    return countryRepository.findAll();
  }

  @GetMapping("/country/initialize")
  public String addCountries() {
    Country country1 = new Country();
    country1.setName("India");country1.setRanking(1);country1.setId(1);
    Country country2 = new Country();
    country2.setName("Brazil");country2.setRanking(2);country2.setId(2);
    Country country3 = new Country();
    country3.setName("USA");country3.setRanking(3);country3.setId(3);

    List<Country> countries = new ArrayList<>();
    countries.add(country1);
    countries.add(country2);
    countries.add(country3);
    countryRepository.saveAll(countries);
    return "success";
  }

  @GetMapping("/country/add")
  public String addNew() {
    Country country1 = new Country();
    country1.setName("Argentina");country1.setRanking(1);country1.setId(4);

    countryRepository.save(country1);// Fails.
    return "success";
  }
}
