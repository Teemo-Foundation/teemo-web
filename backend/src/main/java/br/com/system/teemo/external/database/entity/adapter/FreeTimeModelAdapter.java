package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.FreeTime;
import br.com.system.teemo.external.database.entity.FreeTimeModel;

public class FreeTimeModelAdapter {

    public static FreeTime modelToEntity (final FreeTimeModel model){
        final FreeTime entity = new FreeTime();
        entity.setId(model.getId());
        entity.setDayOfWeek(model.getDayOfWeek());
        entity.setFreeTimeHour(model.getFreeTimeHour());
        entity.setUser(UserModelAdapter.modelToEntity(model.getUser()));
        return entity;
    }

    public static FreeTimeModel entityToModel (final FreeTime entity) {
        final FreeTimeModel model = new FreeTimeModel();
        model.setId(entity.getId());
        model.setDayOfWeek(entity.getDayOfWeek());
        model.setFreeTimeHour(entity.getFreeTimeHour());
        model.setUser(UserModelAdapter.entityToModel(entity.getUser()));
        return model;
    }

}
