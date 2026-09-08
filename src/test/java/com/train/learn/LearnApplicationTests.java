package com.train.learn;

import cn.hutool.core.builder.GenericBuilder;
import com.train.learn.entity.po.Animal;
import com.train.learn.entity.po.Coder;
import com.train.learn.entity.po.Teacher;
import com.train.learn.entity.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnApplicationTests {

	@Test
	void Test1() {
		User user = new User()
				.id(1)
				.age(18)
				.name("test");
		System.out.println(user.toString());
	}

	@Test
	void Test2() {
		Teacher teacher = new Teacher()
				.setId(1)
				.setAge(18)
				.setName("test");
		System.out.println(teacher.toString());
	}

	@Test
	void Test3() {
		Coder coder = Coder.builder()
				.id(1)
				.age(18)
				.name("test")
				.build();
		System.out.println(coder.toString());
	}

	@Test
	void Test4() {
		Animal animal = GenericBuilder.of(Animal::new)
				.with(Animal::setId,1)
				.with(Animal::setAge,18)
				.with(Animal::setName,"test")
				.build();
		System.out.println(animal.toString());
	}
}
