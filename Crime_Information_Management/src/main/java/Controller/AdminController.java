package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import Service.AdminServiceImpl;

import model.Admin;
import model.Crime;

public class AdminController {

private AdminServiceImpl  AdminService;
	
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addUser(@RequestBody Admin admin, @RequestParam String uuid) throws Exception{
		
		Crime addCrime = this.AdminService.addAdmin();
		
		Crime addAdmin;
		return new ResponseEntity<Admin>(HttpStatus.CREATED);
		
		
	}
}
