package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository userRepository;
	
	public List<Product> findall(){		
		return userRepository.findAll();		
	}
	
	public Product findById(Long id){	
		Optional<Product> obj = userRepository.findById(id);
		
		return obj.get();
	}

}
