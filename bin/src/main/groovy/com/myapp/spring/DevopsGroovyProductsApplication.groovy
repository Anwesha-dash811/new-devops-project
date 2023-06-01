package com.myapp.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
 class DevopsGroovyProductsApplication extends SpringBootServletInitializer {

	static void main(String[] args) {
		SpringApplication.run(DevopsGroovyProductsApplication, args)
	}
	
	
	@GetMapping
	def sayHello() {
		return "Hello "
	}
	

}


/*
1. Version Control
2. Build Management : Maven
3. TestAutomation: Junit
4. Repository : Artifactory
5. CI & CD : Jenkins
6. Containers : Docker and Kubernetes
7. Monitoring: ELK
8. Cloud Deployment


*/