package br.com.system.teemo.external;

import br.com.system.teemo.entity.Subject;

import java.util.List;

public interface GetSubjectByNameInDataBase {
    List<Subject> execute(String name);
}
