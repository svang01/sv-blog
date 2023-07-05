//package com.restapi.blogplatformhw.service;
//
//import com.restapi.blogplatformhw.model.BlogPost;
//import com.restapi.blogplatformhw.repository.BlogPostRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class BlogPostService {
//    private final BlogPostRepository blogPostRepository;
//
//    @Autowired
//    public BlogPostService(BlogPostRepository blogPostRepository) {
//        this.blogPostRepository = blogPostRepository;
//    }
//
//    public List<BlogPost> getAllBlogPosts() {
//        return blogPostRepository.findAll();
//    }
//
//    public Optional<BlogPost> getBlogPostById(Long id) {
//        return blogPostRepository.findById(id);
//    }
//
//    public BlogPost createBlogPost(BlogPost blogPost) {
//        return blogPostRepository.save(blogPost);
//    }
//
//    public BlogPost updateBlogPost(Long id, BlogPost updatedBlogPost) {
//        BlogPost existingBlogPost = blogPostRepository.findById(id).orElse(null);
//        if (existingBlogPost != null) {
//            existingBlogPost.setTitle(updatedBlogPost.getTitle());
//            existingBlogPost.setContent(updatedBlogPost.getContent());
//            existingBlogPost.setAuthor(updatedBlogPost.getAuthor());
//            return blogPostRepository.save(existingBlogPost);
//        }
//        return null;
//    }
//
//    public void deleteBlogPost(Long id) {
//        blogPostRepository.deleteById(id);
//    }
//}

package com.example.svblog.service;

import com.example.svblog.model.BlogPost;
import com.example.svblog.repo.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {
    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    public Optional<BlogPost> getBlogPostById(Long id) {
        return blogPostRepository.findById(id);
    }

    public BlogPost createBlogPost(BlogPost blogPost) {
        // Perform any necessary operations before saving the blog post

        // Set a specific ID for the blog post
        blogPost.setId(1L);

        // Save the blog post to the database
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(Long id, BlogPost updatedBlogPost) {
        Optional<BlogPost> optionalBlogPost = blogPostRepository.findById(id);
        if (optionalBlogPost.isPresent()) {
            BlogPost existingBlogPost = optionalBlogPost.get();
            existingBlogPost.setTitle(updatedBlogPost.getTitle());
            existingBlogPost.setContent(updatedBlogPost.getContent());
            existingBlogPost.setAuthor(updatedBlogPost.getAuthor());
            return blogPostRepository.save(existingBlogPost);
        }
        return null;
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
