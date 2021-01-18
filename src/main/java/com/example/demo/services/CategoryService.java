package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	public CategoryRepository userRepository;
	
	public List<Category> findall(){		
		return userRepository.findAll();		
	}
	
	public Category findById(Long id){	
		Optional<Category> obj = userRepository.findById(id);
		
		return obj.get();
	}

}
