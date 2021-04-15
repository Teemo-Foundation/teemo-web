package br.com.system.teemo.external;

import br.com.system.teemo.entity.User;

public interface GetUserByEmailInDataBase {

    User execute(String email);
}
