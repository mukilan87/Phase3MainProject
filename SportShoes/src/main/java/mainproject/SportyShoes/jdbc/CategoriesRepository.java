package mainproject.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import mainproject.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
