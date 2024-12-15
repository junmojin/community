package hello.community.repository;

import hello.community.domain.Test;

import java.util.List;

public interface TestRepository {
    void save(Test test);

    List<Test> findAll();
}
