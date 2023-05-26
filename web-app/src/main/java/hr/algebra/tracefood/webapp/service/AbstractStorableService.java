package hr.algebra.tracefood.webapp.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

public class AbstractStorableService<T> {

    protected final String BASE_URL = "http://localhost:8080";
    protected final String url;
    protected final Class<T> responseType;

    public AbstractStorableService(String url,Class<T> responseType) {
        this.url = BASE_URL +url;
        this.responseType = responseType;
    }

    public void create(T newStorable) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<T> request = new HttpEntity<>(newStorable);
        ResponseEntity<T> response = restTemplate.exchange(this.url, HttpMethod.POST, request, responseType);
    }

        public T getById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(this.url+"/"+id, responseType);
    }

    public List<T> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<T[]> response = (ResponseEntity<T[]>) restTemplate.getForEntity(this.url, responseType.arrayType());
        return List.of(Objects.requireNonNull(response.getBody()));
    }

    public void deleteById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(this.url+"/"+id);
    }

}
