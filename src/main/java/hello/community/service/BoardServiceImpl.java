package hello.community.service;

import hello.community.domain.Board;
import hello.community.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService { //BoardService 인터페이스에 정의된 메서드를 구현하는 클래스(BoardServiceImpl.java)

    private final BoardRepository boardRepository;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    @Transactional
    public void save(Board board) {
        boardRepository.save(board);
    }

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public Board findById(Long id) throws IllegalAccessException {
        Optional<Board> optionalBoard = boardRepository.findById(id);
        return optionalBoard.orElseThrow(() -> new IllegalAccessException("게시글을 찾을 수 없습니다.")); //예외처리
    }


}
