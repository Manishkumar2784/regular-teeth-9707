package Service;

import java.util.List;

import Exception.AdminException;
import Exception.CrimeException;
import Exception.CurrentCrimeException;
import model.Crime;


public interface CrimeService {

	public  Crime addCrime()throws Exception;
	
	public Crime AddCrimeDetails() throws AdminException;
	
	public Crime registerUser(Crime crime)throws CrimeException;

	public List<Crime> firList(String uuid) throws CrimeException;
	
	public String deleteCrime(String uuid, Integer crime_id) throws  CrimeException, Exception;
}
