package hr.algebra.tracefood.webapp.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AbstractClassicDBStorableService<T> extends AbstractStorableService<T> {

    public AbstractClassicDBStorableService(String url, Class<T> responseType) {
        super(url, responseType);
    }

    public void update(T updatedClassicDBStorable) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<T> request = new HttpEntity<>(updatedClassicDBStorable);
        ResponseEntity<T> response = restTemplate.exchange(this.url, HttpMethod.PUT, request, this.responseType);
    }
    
}
