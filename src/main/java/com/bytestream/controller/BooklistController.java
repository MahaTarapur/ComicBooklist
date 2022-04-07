package com.bytestream.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytestream.entity.Booklist;


@RestController
@RequestMapping("/api/v1")
public class BooklistController 

{
	@CrossOrigin("*")
	@GetMapping("/getBooklist")
	public List<Booklist> getBooklist()
	
	{
		Booklist data = new Booklist(1977, 500, "A Bag of Gold Coins" ,"Amar Chitra Katha");
		Booklist data1 = new Booklist(1972, 800, "Abhimanyu" , "Amar Chitra Katha");
		Booklist data2 = new Booklist(1974, 900, "Adi Shankara" , "Amar Chitra Katha");
		Booklist data3 = new Booklist(1974, 400, "Agastya" , "Amar Chitra Katha");
		
		List<Booklist> list = new ArrayList();
		list.add(data);
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		return list;
	
		
	}
}
			