package ru.netology.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.controller.PostController;
import ru.netology.repository.PostRepository;
import ru.netology.service.PostService;

@Configuration
public class AppConfig {
    @Bean
    public PostController postController(PostService postService) {
        return new PostController(postService);
    }

    @Bean
    public PostService postService(PostRepository postRepository){
        return new PostService(postRepository);
    }

    @Bean
    public PostRepository postRepository(){
        return new PostRepository();
    }
}