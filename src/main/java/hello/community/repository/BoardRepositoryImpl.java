package hello.community.repository;

import hello.community.domain.Board;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
    private final EntityManager em;

    @Autowired
    public BoardRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Board board) {
        em.persist(board);
    }

    @Override
    public List<Board> findAll() {
        String jpql = "select b from Board b";
        return em.createQuery(jpql, Board.class).getResultList();
    }

    @Override
    public Optional<Board> findById(Long id) {
        Board board = em.find(Board.class, id); // EntityManager의 find 메서드 사용
        return Optional.ofNullable(board); // 결과가 없으면 Optional.empty()를 반환
    }
}
