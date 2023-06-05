package net.javaguides.springboot.emploginrepo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.empLoginmodel.EmpLogin;

@Repository
public interface EmpLoginRepo extends JpaRepository<EmpLogin, Long>{

    List<EmpLogin> findByEmailAndPassword(String email,String password);

    List<EmpLogin> findByEmail(String email);

 

}