package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Employee;


@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>{

}
