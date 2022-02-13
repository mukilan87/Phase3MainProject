package mainproject.SportyShoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainproject.SportyShoes.entity.Categories;
import mainproject.SportyShoes.entity.Product;
import mainproject.SportyShoes.jdbc.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public void save(Product product)
	{
		prodrepo.save(product);
	}

}
