package org.formation.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {


	    @GetMapping
	    public String readFoo() {
	        return "read foo " + UUID.randomUUID().toString();
	    }

	    @PostMapping
	    public String writeFoo() {
	        return "write foo " + UUID.randomUUID().toString();
	    }
	}

