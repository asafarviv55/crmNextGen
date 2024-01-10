package com.xa.crmgena.crm.controllers;

import com.xa.crmgena.crm.models.Article;
import com.xa.crmgena.crm.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/articles")
public class ArticleController {

        @Autowired
        ArticleRepository articleRepository;


        @GetMapping("welcome")
        public String welcome(){
            return "articles area";
        }


        @GetMapping
        public List<Article> getAllArticles() {
            return articleRepository.findAll();
        }

        // Create
        @PostMapping("/create")
        public Article createArticle(@RequestBody Article article) {
            return articleRepository.save(article);
        }


        @GetMapping("/get/{id}")
        public ResponseEntity<Article> getArticleById(@PathVariable Long id) {
            Optional<Article> article = articleRepository.findById(id);
            return article.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        // Update
        @PutMapping("/update/{id}")
        public ResponseEntity<Article> updateArticle(@PathVariable Long id, @RequestBody Article updatedArticle) {
            Optional<Article> existingArticle = articleRepository.findById(id);
            if (existingArticle.isPresent()) {
                updatedArticle.setId(id);
                articleRepository.save(updatedArticle);
                return new ResponseEntity<>(updatedArticle, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        // Delete
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteArticle(@PathVariable Long id) {
            if (articleRepository.existsById(id)) {
                articleRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
