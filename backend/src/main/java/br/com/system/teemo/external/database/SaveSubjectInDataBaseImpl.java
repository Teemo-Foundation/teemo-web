package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.SaveSubjectInDataBase;
import br.com.system.teemo.external.database.entity.SubjectModel;
import br.com.system.teemo.external.database.entity.adapter.SubjectModelAdapter;
import br.com.system.teemo.external.database.repository.SubjectNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveSubjectInDataBaseImpl implements SaveSubjectInDataBase {

    @Autowired
    private SubjectNameRepository subjectNameRepository;

    @Override
    public Subject execute(Subject subject) {
        SubjectModel subjectModel = SubjectModelAdapter.entityToModel(subject);
        return SubjectModelAdapter.modelToEntity(subjectNameRepository.save(subjectModel));
    }
}
