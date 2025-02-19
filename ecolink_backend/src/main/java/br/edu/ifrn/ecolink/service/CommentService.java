package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.Comment;
import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repository;

    private Comment save(Comment comment) {
        return repository.save(comment);
    }

    private void deleteById(Long id) {
        repository.deleteById(id);
    }

    private List<Comment> findAll() {
        return repository.findAll();
    }

    private Optional<Comment> findById(Long id) {
        return repository.findById(id);
    }

    public Long countByPost(Post post) {
        return repository.countByPost(post);
    }
}
