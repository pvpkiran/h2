package in.phani.springboot.h2.repository;

import in.phani.springboot.h2.pojo.Country;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository  extends CrudRepository<Country, Long> {
}
