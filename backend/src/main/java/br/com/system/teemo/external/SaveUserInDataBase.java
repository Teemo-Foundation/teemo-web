package br.com.system.teemo.external;

import br.com.system.teemo.entity.User;

public interface SaveUserInDataBase {

    User execute(User user);
}
