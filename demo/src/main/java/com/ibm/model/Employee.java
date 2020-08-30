package com.ibm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_tbl")
public class Employee {

	@Id
	@Min(value = 1)
	@Max(value = 20)
	private Integer eno;
	
	@NotNull
	@Size(min = 2, message = "name altest two chars")
//	@Pattern(regexp = "[a-zA-Z]", message = "must match the pattersn")
	private String name;
	
	@NotNull
	@Min(value = 100,message = "salary minum 100 is required")
	private Double salary;
}
