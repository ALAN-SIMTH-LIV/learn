package com.train.learn;

import cn.hutool.core.builder.GenericBuilder;
import com.train.learn.entity.enums.Season;
import com.train.learn.entity.po.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

	@Test
	void Test5() {

		System.out.println(Season.SPRING.getName());
		System.out.println(Season.SUMMER.getName());
		System.out.println(Season.AUTUMN.getName());
		System.out.println(Season.WINTER.getName());

		System.out.println(Season.SPRING.getDesc());
		System.out.println(Season.SUMMER.getDesc());
		System.out.println(Season.AUTUMN.getDesc());
		System.out.println(Season.WINTER.getDesc());
	}

	@Test
	void Test6() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// 正常的调用
		Apple apple = Apple.builder()
				.price(12)
				.build();
		System.out.println("苹果的价格: "+apple.getPrice());

		// 反射的调用
		Class<?> clz = Class.forName("com.train.learn.entity.po.Apple");
		Method setPriceMethod = clz.getMethod("setPrice",int.class);
		Constructor<?> appleConstructor = clz.getConstructor();
		Object appleObj = appleConstructor.newInstance();
		setPriceMethod.invoke(appleObj,19);
		Method getPriceMethod = clz.getMethod("getPrice");
		System.out.println("苹果的价格: " + getPriceMethod.invoke(appleObj));

		Class<?> c = Apple.class;
	}
}
