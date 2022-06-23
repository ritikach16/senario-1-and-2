package test.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import test.springboot.entity.TestEntity;

//@org.springframework.stereotype.Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
