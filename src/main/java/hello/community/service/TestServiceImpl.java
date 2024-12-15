package hello.community.service;

import hello.community.domain.Test;
import hello.community.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    @Transactional
    public void save(Test test) {
        testRepository.save(test);
    }

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }


}
