package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.GetSubjectByNameInDataBase;
import br.com.system.teemo.external.database.entity.SubjectModel;
import br.com.system.teemo.external.database.entity.adapter.SubjectModelAdapter;
import br.com.system.teemo.external.database.repository.SubjectNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetSubjectByNameInDataBaseImpl implements GetSubjectByNameInDataBase {

    @Autowired
    private SubjectNameRepository subjectNameRepository;

    @Override
    public Subject execute(String name) {
        SubjectModel subjectModel = subjectNameRepository.findSubjectByName(name);
        return SubjectModelAdapter.modelToEntity(subjectModel);
    }
}
