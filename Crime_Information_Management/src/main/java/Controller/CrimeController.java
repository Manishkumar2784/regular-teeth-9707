package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Service.CrimeServiceImpl;
import model.Crime;


@RestController
public class CrimeController {
	
	
	private static final String Crime = null;
	private static final model.Crime AddCrime = null;
	@Autowired
	private CrimeServiceImpl  CrimeService;
	
	@PostMapping("/addCrime")
	public ResponseEntity<Crime> addUser(@RequestBody Crime crime, @RequestParam String uuid) throws Exception{
		
		Crime addCrime = this.CrimeService.addCrime();
		
		return new ResponseEntity<Crime>(AddCrime,HttpStatus.CREATED);
		
		
	}

}
