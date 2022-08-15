package springboot.api.repository;

import org.springframework.stereotype.Component;


import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.HttpClientErrorException;

import org.springframework.web.client.RestTemplate;



import java.util.Map;

@Component
public class RestTemplateHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateHelper.class);

	private RestTemplate restTemplate;

	@Autowired
	public RestTemplateHelper(RestTemplateBuilder restTemplateBuilder, ObjectMapper objectMapper) {
		this.restTemplate = restTemplateBuilder.build();
	}

	public <T> ResponseEntity<T> getEntity(Class<T> clazz, String url, Map<String, ?> uriVariables) {

		ResponseEntity<T> response = null;
		try {
			HttpHeaders headers = new HttpHeaders();
			HttpEntity<T> requestEntity = new HttpEntity<>(headers);
			response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, clazz, uriVariables);
			// return response;
		} catch (HttpClientErrorException exception) {
			if (exception.getStatusCode() == HttpStatus.NOT_FOUND) {
				LOGGER.info("No data found {}", url);
				throw exception;
			} else {
				LOGGER.info("rest client exception", exception.getMessage());
				throw exception;
			}
		}
		return response;
	}

}