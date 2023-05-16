package com.snowboard.snowboard.Repository;

import com.snowboard.snowboard.Entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long > {
}
