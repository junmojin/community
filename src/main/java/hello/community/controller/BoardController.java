package hello.community.controller;

import hello.community.domain.Board;
import hello.community.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {
    public final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 1. 테스트 폼 페이지 (GET)
    @GetMapping("/tests")
    String saveForm(Model model) {
        model.addAttribute("board", new Board());
        return "test/BoardForm";  // "/test/BoardForm"
    }

    // 2. 테스트 데이터 저장 (POST)
    @PostMapping("/tests")
    String save(Board board) {
        boardService.save(board);  // 서비스로 데이터 저장
        return "redirect:/tests/list";  // 저장 후 "/tests"로 리다이렉트 (리스트 페이지로 이동)
    }

    // 3. 모든 테스트 조회 (GET)
    @GetMapping("/tests/list")
    String findAll(Model model) {
        List<Board> tests = boardService.findAll();
        model.addAttribute("boardList", tests);  // boardlist 조회
        return "test/boardList";  // "test/boardList" 뷰로 이동
    }


}
