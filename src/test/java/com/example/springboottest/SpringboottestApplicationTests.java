package com.example.springboottest;

import com.example.springboottest.article.Article;
import com.example.springboottest.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SpringboottestApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void contextLoads() {
		Article a1 = new Article();
		a1.setTitle("테스트");
		a1.setContent("테스트입니다.");
		a1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a1);
	}

}
