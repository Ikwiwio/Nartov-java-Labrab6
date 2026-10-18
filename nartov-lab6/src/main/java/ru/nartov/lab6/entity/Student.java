package ru.nartov.lab6.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;
@Entity @Table(name="STUDENTS") public class Student {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Size(max=15) @Column(length=15,nullable=false) private String name;
 @NotBlank @Size(max=25) @Column(length=25,nullable=false) private String surname;
 @NotBlank @Size(max=20) @Column(length=20,nullable=false) private String faculty;
 @NotNull @Min(16) @Max(120) private Integer age;
 public Student(){} public Student(String n,String s,String f,Integer a){name=n;surname=s;faculty=f;age=a;}
 public Long getId(){return id;} public void setId(Long v){id=v;} public String getName(){return name;} public void setName(String v){name=v;} public String getSurname(){return surname;} public void setSurname(String v){surname=v;} public String getFaculty(){return faculty;} public void setFaculty(String v){faculty=v;} public Integer getAge(){return age;} public void setAge(Integer v){age=v;}
}
