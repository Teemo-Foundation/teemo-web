package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.database.entity.SubjectModel;

public class SubjectModelAdapter {

    public static Subject modelToEntity (final SubjectModel model) {
        Subject entity = new Subject();
        entity.setId(model.getId());
        entity.setName(model.getSubject_name());
        entity.setUser(model.getUser());

        return entity;
    }

    public static SubjectModel entityToModel(final Subject entity) {
        SubjectModel model = new SubjectModel();
        model.setId(entity.getId());
        model.setSubject_name(entity.getName());
        model.setUser(entity.getUser());

        return model;
    }
}
