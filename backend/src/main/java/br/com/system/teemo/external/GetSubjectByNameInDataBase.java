package br.com.system.teemo.external;

import br.com.system.teemo.entity.Subject;

public interface GetSubjectByNameInDataBase {
    Subject execute(String name);
}
