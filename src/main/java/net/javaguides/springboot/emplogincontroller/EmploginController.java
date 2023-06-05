package net.javaguides.springboot.emplogincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.empLoginmodel.EmpLogin;
import net.javaguides.springboot.emploginrepo.EmpLoginRepo;

import java.nio.charset.StandardCharsets;
import java.util.*;


@RestController
@CrossOrigin("http://localhost:3000")

public class EmploginController {
	
	  @Autowired
	    private EmpLoginRepo repo;

	    @PostMapping("/emplogin")
	    public EmpLogin postRegUser(@RequestBody EmpLogin emplogin) {
	        Base64.Encoder encoder= Base64.getEncoder();
	        String encrytedstring=encoder.encodeToString(emplogin.getPassword().getBytes(StandardCharsets.UTF_8));
	        emplogin.setPassword(encrytedstring);
	        return repo.save(emplogin);
	    }

	    @GetMapping("/getresponse/{email}/{pass}")
	    public String getResponse(@PathVariable("email") String email , @PathVariable("pass") String pass) {
	        List<EmpLogin> temp=repo.findByEmail(email); 
	        if(temp.size()==0) return "wrong mail";
	        Base64.Encoder encoder= Base64.getEncoder();
	        String encrytedpass=encoder.encodeToString(pass.getBytes(StandardCharsets.UTF_8));
	        List<EmpLogin> arr=repo.findByEmailAndPassword(email, encrytedpass);
	        if(arr.size()==0) return "wrong pass";
	        
	        else {
	        	return "ok";
	        }
	    }
	

}
