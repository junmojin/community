package hello.community.service;

import hello.community.domain.Board;

import java.util.List;

public interface BoardService {

    void save(Board board);

    List<Board> findAll();

    Board findById(Long id) throws IllegalAccessException;
}
