package br.com.system.teemo.usecase.creation;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.database.SaveSubjectInDataBaseImpl;
import br.com.system.teemo.usecase.validation.SubjectDoesNotExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateSubject {

    @Autowired
    private SaveSubjectInDataBaseImpl saveSubjectInDataBaseImpl;

    @Autowired
    private SubjectDoesNotExists subjectDoesNotExists;

    public Subject execute(Subject subject) {
        if(subjectDoesNotExists.execute(subject)) {
            return saveSubjectInDataBaseImpl.execute(subject);
        }
        return null;
    }

}
