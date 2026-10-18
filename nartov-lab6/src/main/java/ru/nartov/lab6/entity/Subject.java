package ru.nartov.lab6.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;
@Entity @Table(name="SUBJECTS") public class Subject {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Size(max=100) @Column(length=100,nullable=false,unique=true) private String name;
 @NotNull @Min(1) @Max(1000) private Integer hours;
 @NotNull @Min(1) @Max(12) private Integer semester;
 public Subject(){} public Subject(String n,Integer h,Integer s){name=n;hours=h;semester=s;}
 public Long getId(){return id;} public void setId(Long v){id=v;} public String getName(){return name;} public void setName(String v){name=v;} public Integer getHours(){return hours;} public void setHours(Integer v){hours=v;} public Integer getSemester(){return semester;} public void setSemester(Integer v){semester=v;}
}
