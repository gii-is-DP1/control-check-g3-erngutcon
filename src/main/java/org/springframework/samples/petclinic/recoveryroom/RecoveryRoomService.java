package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {
    
	@Autowired
	private RecoveryRoomRepository recoveryRoomRepository;
	
	public List<RecoveryRoom> getAll(){
        List<RecoveryRoom> r = recoveryRoomRepository.findAll();
        return r;
    }
	
    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return null;
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
    	RecoveryRoomType rRT = recoveryRoomRepository.getRecoveryRoomType(typeName);
        return rRT;
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
        return null;
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return null;       
    }

    
}
