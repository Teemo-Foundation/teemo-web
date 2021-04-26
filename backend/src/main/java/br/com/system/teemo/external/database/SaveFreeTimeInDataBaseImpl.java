package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.FreeTime;
import br.com.system.teemo.external.SaveFreeTimeInDataBase;
import br.com.system.teemo.external.database.entity.FreeTimeModel;
import br.com.system.teemo.external.database.entity.adapter.FreeTimeModelAdapter;
import br.com.system.teemo.external.database.repository.FreeTimeIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveFreeTimeInDataBaseImpl implements SaveFreeTimeInDataBase {

    @Autowired
    private FreeTimeIdRepository freeTimeIdRepository;

    @Override
    public FreeTime execute(FreeTime freeTime) {
        FreeTimeModel freeTimeModel = FreeTimeModelAdapter.entityToModel(freeTime);
        return FreeTimeModelAdapter.modelToEntity(freeTimeIdRepository.save(freeTimeModel));
    }
}
