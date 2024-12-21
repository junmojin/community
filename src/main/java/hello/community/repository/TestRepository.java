package hello.community.repository;

import hello.community.domain.Test;

import java.util.List;

public interface TestRepository {
    void save(Test test); //Test 객체를 저장하는 기능

    List<Test> findAll(); // 모든 Test 객체를 조회하는 기능, findAll()이 데이터베이스에서 조회하는 기능
}
