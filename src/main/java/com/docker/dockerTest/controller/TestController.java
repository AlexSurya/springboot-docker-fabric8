/**
 * 
 */
package com.docker.dockerTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alexsurya
 *
 */
@RestController
@RequestMapping(path="/api/**")
public class TestController {

	@GetMapping(path="hello")
	public String testConnection() {
		return "Hello World";
	}
}
