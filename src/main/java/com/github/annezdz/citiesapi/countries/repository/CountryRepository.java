package com.github.annezdz.citiesapi.countries.repository;

import com.github.annezdz.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
