package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.GetAllSubjectsInDataBase;
import br.com.system.teemo.external.database.repository.SubjectNameRepository;
import br.com.system.teemo.external.database.entity.SubjectModel;
import br.com.system.teemo.external.database.entity.adapter.SubjectModelAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetAllSubjectsInDataBaseImpl implements GetAllSubjectsInDataBase {

    @Autowired
    private SubjectNameRepository subjectNameRepository;

    @Override
    public List<Subject> execute() {
        final List<SubjectModel> subjectModelList = subjectNameRepository.findAll();
        final List<Subject> result = new ArrayList<>();

        for (SubjectModel item : subjectModelList){
            result.add(SubjectModelAdapter.modelToEntity(item));
        }

        return result;
    }
}
