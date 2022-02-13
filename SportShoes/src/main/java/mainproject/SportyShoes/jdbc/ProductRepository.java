package mainproject.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import mainproject.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
