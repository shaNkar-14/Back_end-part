package net.javaguides.springboot.empLoginmodel;


import java.util.List;

import jakarta.persistence.*;

 

@Entity
public class EmpLogin {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long EmpId;
    private String name;
    private String email;
    private String password;
    public long getRegUserId() {
        return EmpId;
    }
    
    
    
    public EmpLogin(long regUserId, String name, String email, String password) {
        super();
        this.EmpId = EmpId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public void setRegUserId(long regUserId) {
        this.EmpId = EmpId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
    public EmpLogin() {
        super();
    }


	
	
	
}
