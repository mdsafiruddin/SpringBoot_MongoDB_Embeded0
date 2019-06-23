package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Product(10,"ABC",5.8));
		repo.save(new Product(11,"CCC",9.8));
		repo.save(new Product(13,"MKlC",5.7));
		repo.save(new Product(16,"YTC",9.8));
		repo.save(new Product(14,"uuC",9.6));
		repo.findAll().forEach(System.out::println);

	}

}
