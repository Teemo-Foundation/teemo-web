package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.database.entity.SubjectModel;

public class SubjectModelAdapter {

    public static Subject modelToEntity (final SubjectModel model) {
        Subject entity = new Subject();
        entity.setId(model.getId());
        entity.setSubjectName(model.getSubject_name());
        entity.setUser(UserModelAdapter.modelToEntity(model.getUser()));

        return entity;
    }

    public static SubjectModel entityToModel(final Subject entity) {
        SubjectModel model = new SubjectModel();
        model.setId(entity.getId());
        model.setSubject_name(entity.getSubjectName());
        model.setUser(UserModelAdapter.entityToModel(entity.getUser()));

        return model;
    }
}
