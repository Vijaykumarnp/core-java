package com.xworkz.app.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Library {

	
	
	@Autowired
	private List<Book>  books;
	
}
