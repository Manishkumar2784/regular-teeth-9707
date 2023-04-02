package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Exception.AdminException;
import Exception.CrimeException;
import model.Crime;

@Service
public class CrimeServiceImpl implements CrimeService{

	@Override
	public Crime addCrime() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crime AddCrimeDetails() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crime registerUser(Crime crime) throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Crime> firList(String uuid) throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCrime(String uuid, Integer crime_id) throws CrimeException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
