/**
 * Controlador para consumir Servicio Rest en otro sitio
 */
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Item;

/**
 * @author eliezer
 *
 */
@Controller
@RestController
@RequestMapping("/myapp")
public class ItuneGalleryController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/lista/{queryP}")
	public String getLista(@RequestParam(name = "queryP", defaultValue = "false") String queryP) {
		// String url = "http://api.tvmaze.com/search/shows?q="+queryP;
		String url = "https://itunes.apple.com/search?term=" + queryP;

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();

	}

}
