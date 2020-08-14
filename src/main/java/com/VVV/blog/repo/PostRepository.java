package com.VVV.blog.repo;
import com.VVV.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {

}
