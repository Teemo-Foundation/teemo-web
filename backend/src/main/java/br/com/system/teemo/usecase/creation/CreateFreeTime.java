package br.com.system.teemo.usecase.creation;

import br.com.system.teemo.entity.FreeTime;
import br.com.system.teemo.external.database.SaveFreeTimeInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateFreeTime {

    @Autowired
    private SaveFreeTimeInDataBaseImpl saveFreeTimeInDataBaseImpl;

    public FreeTime execute(FreeTime freeTime){
        return saveFreeTimeInDataBaseImpl.execute(freeTime);
    }

}
