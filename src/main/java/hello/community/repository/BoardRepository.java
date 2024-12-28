package hello.community.repository;

import hello.community.domain.Board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {
    void save(Board board); //Test 객체를 저장하는 기능
    List<Board> findAll(); // 모든 Test 객체를 조회하는 기능, findAll()이 데이터베이스에서 조회하는 기능

    Optional<Board> findById(Long id);
}
