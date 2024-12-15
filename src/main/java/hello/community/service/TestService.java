package hello.community.service;

import hello.community.domain.Test;

import java.util.List;

public interface TestService {

    void save(Test test);

    List<Test> findAll();
}
