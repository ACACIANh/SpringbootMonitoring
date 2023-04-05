package com.example.springbootmonitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricController {

	@GetMapping( "/endPoint1" )
	public String endPoint1() {
		return "Metrics for endPoint1";
	}

	@GetMapping( "/endPoint2" )
	public String endPoint2() {
		return "Metrics for endPoint2";
	}
}
