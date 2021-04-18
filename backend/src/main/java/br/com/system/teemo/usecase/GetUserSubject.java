package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.GetUserSubjectInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserSubject {

    @Autowired
    private GetUserSubjectInDataBaseImpl getUserSubjectInDataBaseImpl;

    public List<UserSubject> execute(final Long id){
        return getUserSubjectInDataBaseImpl.execute(id);
    }

}
