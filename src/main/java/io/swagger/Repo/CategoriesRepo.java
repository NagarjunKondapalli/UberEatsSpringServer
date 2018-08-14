package io.swagger.Repo;

import io.swagger.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepo extends JpaRepository<Categories,Integer>
{


}
