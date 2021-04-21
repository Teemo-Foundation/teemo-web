package br.com.system.teemo.usecase.validation;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.database.GetSubjectByNameInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectDoesNotExists {

    @Autowired
    private GetSubjectByNameInDataBaseImpl getSubjectByNameInDataBaseImpl;

    public boolean execute (Subject subject) {
        return getSubjectByNameInDataBaseImpl.execute(subject.getName()) == null;
    }

}
