package com.oneone.oneone;

import com.oneone.oneone.model.Address;
import com.oneone.oneone.model.Employee;
import com.oneone.oneone.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneOneApplication.class, args);
	}
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public void run(String... args) throws Exception {
		Address add = new Address("Phnom penh","house");
		Employee emp = new Employee("Theara","12",add);
		this.commentRepository.save(emp);
	}
}
