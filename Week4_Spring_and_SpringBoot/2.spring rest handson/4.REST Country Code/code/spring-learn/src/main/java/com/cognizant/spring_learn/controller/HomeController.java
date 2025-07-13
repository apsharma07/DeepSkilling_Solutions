package com.cognizant.spring_learn.controller;
import com.cognizant.spring_learn.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cognizant.spring_learn.service.CountryService;


@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Spring Learn App!";
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
    @RequestMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Country country = (Country) context.getBean("in");
        return country;
    }
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        return countryList;
    }
    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}
