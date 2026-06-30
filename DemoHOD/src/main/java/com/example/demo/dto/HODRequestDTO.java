package com.example.demo.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HODRequestDTO {

	@NotNull
	@NotBlank(message = "Name Is Required Can Not Be Blank")
	@Size(min = 2,max = 30,message = "Name Must Be Between 2 to 30 Characters")
	private String name;
	
	@NotBlank(message = "Email Is Required Can Not Be Blank")
	@Email(message = "Inavalid Email Format")
	private String email;
	
	@NotNull(message = "Experience Is Required Can Not Be Null")
	@Positive(message = "Experience Must Be Greater Than 0")
	@Max(message = "Experience Can Not Be Greater Than 50 Years", value = 50)
	private Float exp;
	
	@NotNull(message = "Salary Is Required Can Not Be Null")
	@Positive(message = "Salary Must Be Greater Than 0")
	private Float salary;
	
	@NotNull(message = "Address Is Required Can Not Be Null")
	@NotBlank(message = "Address Is Required Can Not Be Blank")
	private String address;
	
	@NotNull(message = "Password Is Required Can Not Be Null")
	@NotBlank(message = "Password Is Reqiured Can Not Be Blank")
	@Size(min = 8, message = "Password Must Be At Least 8 Characters")
	private String password;
	
	@NotNull(message = "Mobile Number Is Required Can Not Be Null")
	@NotBlank(message = "Mobile Number Is Required Can Not Be Blank")
//	@Size(min = 10,max = 10,message = "Mobile Number Must Be 10 Digit")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile Number Must Be 10 Digit And Starts With 6 to 9")
	private String mob;
	
	private List<String> subjects;
}
