package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.database.GetAllSubjectsInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllSubjects {

    @Autowired
    private GetAllSubjectsInDataBaseImpl getAllSubjectsInDataBase;

    public List<Subject> execute (){
        final List<Subject> subjectList = getAllSubjectsInDataBase.execute();

        return subjectList;
    }

}
