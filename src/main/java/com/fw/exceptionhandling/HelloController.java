package com.fw.exceptionhandling;

import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
	public ResponseEntity<?> hello() throws Exception {
		try {
			throw new IOException("IOException");
		} catch(Exception e) {
			throw e;
		}
	}

}
