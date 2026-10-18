package ru.nartov.lab6.dto;
import jakarta.validation.constraints.*;
public class SubjectRequest {@NotBlank @Size(max=100) private String name;@NotNull @Min(1) @Max(1000) private Integer hours;@NotNull @Min(1) @Max(12) private Integer semester;public SubjectRequest(){}public String getName(){return name;}public void setName(String v){name=v;}public Integer getHours(){return hours;}public void setHours(Integer v){hours=v;}public Integer getSemester(){return semester;}public void setSemester(Integer v){semester=v;}}
