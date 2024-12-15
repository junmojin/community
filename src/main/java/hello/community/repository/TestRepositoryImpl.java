package hello.community.repository;

import hello.community.domain.Test;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepositoryImpl implements TestRepository {
    private final EntityManager em;

    @Autowired
    public TestRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Test test) {
        em.persist(test);
    }

    @Override
    public List<Test> findAll() {
        String jpql = "select t from Test t";
        return em.createQuery(jpql, Test.class).getResultList();
    }
}
