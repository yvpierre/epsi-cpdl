package com.snowboard.snowboard.Repository;

import com.snowboard.snowboard.Entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long > {
}
