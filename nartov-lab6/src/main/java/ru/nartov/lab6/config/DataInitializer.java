package ru.nartov.lab6.config;
import org.springframework.boot.CommandLineRunner;import org.springframework.context.annotation.*;import ru.nartov.lab6.dao.*;import ru.nartov.lab6.entity.*;
@Configuration public class DataInitializer{@Bean CommandLineRunner seedDatabase(StudentDAO students,SubjectDAO subjects){return args->{if(students.count()==0){students.save(new Student("Иван","Иванов","ИТ",20));students.save(new Student("Анна","Петрова","РТФ",21));}if(subjects.count()==0){subjects.save(new Subject("Технологии программирования",72,4));subjects.save(new Subject("Базы данных",64,3));}};}}
