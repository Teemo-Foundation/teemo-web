package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.GetUserSubjectInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserSubject {

    @Autowired
    private GetUserSubjectInDataBaseImpl getSubjectImpl;

    private UserSubject execute(final Long id){
        return getSubjectImpl.execute(id);
    }

}
