package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.external.database.GetSubjectByNameInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetSubjectByName {

    @Autowired
    private GetSubjectByNameInDataBaseImpl getSubjectByNameInDataBaseImpl;

    public Subject execute(final String name) {
        return getSubjectByNameInDataBaseImpl.execute(name);
    }
}
