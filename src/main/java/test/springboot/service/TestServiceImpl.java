package test.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springboot.TestRepository;
import test.springboot.entity.TestEntity;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {

    }

    @Override
    public TestEntity save(TestEntity testEntity) {
        return testRepository.save(testEntity);
    }

    @Override
    public List<TestEntity> get() {
//        System.out.println(testRepository.findAll()); ---------> empty
        return (List<TestEntity>) testRepository.findAll();
    }
}
