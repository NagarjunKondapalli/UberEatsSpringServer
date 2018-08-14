package io.swagger.Service;

import io.swagger.Repo.CategoriesRepo;
import io.swagger.model.Categories;
import io.swagger.model.Categories;
import org.hibernate.type.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" })
public class CategoryService {

    @Autowired
    private CategoriesRepo categoriesRepo;

    public void updateCategory(Categories category)
    {
        int id = category.getId();
        Categories cat = categoriesRepo.getOne(id);
        cat.setCategoryName(category.getCategoryName());
        categoriesRepo.save(cat);
    }

    public void addCategory(Categories categories)
    {
        categoriesRepo.save(categories);
    }

    public void deleteCategory(Integer id)
    {
        categoriesRepo.delete(id);
    }


}
