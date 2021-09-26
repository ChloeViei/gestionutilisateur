package com.chloevie.webapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.chloevie.webapp.CustomProperties;
import com.chloevie.webapp.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserProxy {

    @Autowired
    private CustomProperties props;

    /**
    * Get all users
    * @return An iterable of all users
    */

    public Iterable<User> getUsers() {
        String baseApiUrl = props.getApiUrl();
        String getEmployeesUrl = baseApiUrl + "/users";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<User>> response = restTemplate.exchange(
                getEmployeesUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<User>>() {}
                );

        log.debug("Get Users call " + response.getStatusCode().toString());
        
        return response.getBody();
    }
    
}
