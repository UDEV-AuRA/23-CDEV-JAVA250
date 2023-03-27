package com.example.demo.repository;

import com.example.demo.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository permettant l'interraction avec la base de données pour les articles.
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
