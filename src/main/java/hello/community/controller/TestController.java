package hello.community.controller;

import hello.community.domain.Test;
import hello.community.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {
    public final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    // 1. 테스트 폼 페이지 (GET)
    @GetMapping("/tests")
    String saveForm(Model model) {
        model.addAttribute("test", new Test());
        return "test/TestsForm";  // "/test/TestsForm" 대신 "test/TestsForm"
    }

    // 2. 테스트 데이터 저장 (POST)
    @PostMapping("/tests")
    String save(Test test) {
        testService.save(test);  // 서비스로 데이터 저장
        return "redirect:/tests";  // 저장 후 "/tests"로 리다이렉트 (리스트 페이지로 이동)
    }

    // 3. 모든 테스트 조회 (GET)
    @GetMapping("/tests/list")
    String findAll(Model model) {
        List<Test> tests = testService.findAll();
        model.addAttribute("testList", tests);  // 테스트 리스트 조회
        return "test/testList";  // "test/testList" 뷰로 이동

    }
}
