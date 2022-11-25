package com.example.Test.StudentRepoTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Test.StudentEntity.StudentEntity;
import com.example.Test.StudentRepository.StudentRepository;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepoTesting {
	@Autowired
	private StudentRepository studentrepo;
	@Autowired
	private TestEntityManager entityManager;
	
	@BeforeEach
	public void Demo1()
	{
		System.out.println("Abcd");
	}
	@AfterEach
	public void Demo2()
	{
		System.out.println("xyz");
	}
	@Test
	public void Add()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);

	}

}
