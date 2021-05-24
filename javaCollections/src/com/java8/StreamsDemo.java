package com.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Harry", 25, 'M', true);
		Person p2 = new Person("Ron", 26, 'M', true);
		Person p3 = new Person("Hermione", 25, 'F', true);
		Person p4 = new Person("Albus", 116, 'M', false);
		Person p5 = new Person("Tom", 70, 'M', false);
		
		List<Person> persons = List.of(p1,p2,p3,p4,p5);
		Predicate<Person> byAge = p -> p.getAge() > 30;
		List<Person> result = persons.stream().filter(byAge)
                .collect(Collectors.toList());
		result.forEach(t-> System.out.println(t.getName()));
		
		List<Person> pp= persons.stream().filter(p-> p.getIsAlive()).collect(Collectors.toList());
		pp.forEach(p->System.out.println(p.getName()));
		
		pp.removeIf(a->a.getAge()>25);
		pp.forEach(p-> System.err.println(p.getName()));
	}
}
