package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.TimeSubject;
import br.com.system.teemo.external.database.entity.TimeSubjectModel;

public class TimeSubjectModelAdapter {

    public static TimeSubject modelToEntity (final TimeSubjectModel model){
        final TimeSubject entity = new TimeSubject();
        entity.setId(model.getId());
        entity.setFreeTimeFk(FreeTimeModelAdapter.modelToEntity(model.getFreeTime()));
        entity.setSubject(SubjectModelAdapter.modelToEntity(model.getSubject()));

        return entity;
    }

    public static TimeSubjectModel entityToModel (final TimeSubject entity){
        final TimeSubjectModel model = new TimeSubjectModel();
        model.setId(entity.getId());
        model.setFreeTime(FreeTimeModelAdapter.entityToModel(entity.getFreeTimeFk()));
        model.setSubject(SubjectModelAdapter.entityToModel(entity.getSubject()));

        return model;
    }
}
