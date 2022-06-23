package test.springboot.service;

import test.springboot.entity.TestEntity;

import java.util.List;

public interface TestService {
    public TestEntity save(TestEntity testEntity);
    public List<TestEntity> get();
}
