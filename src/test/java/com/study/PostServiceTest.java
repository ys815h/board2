package com.study;

import com.study.domain.post.PostRequest;
import com.study.domain.post.PostResponse;
import com.study.domain.post.PostService;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceTest {

    @Autowired
    PostService postService;

    @Test
    void savePost() {
        PostRequest params = new PostRequest();
        params.setTitle("1번 게시글 제목");
        params.setContent("1번 게시글 내용");
        params.setWriter("테스터");
        
        System.out.println("확인");
        params.setNoticeYn(false);
        postService.savePost(params);
        
        List<PostResponse> posts = postService.findAllPost();
        System.out.println("생성된 게시글 ID : " + posts.size() + "개입니다.");
    }

}