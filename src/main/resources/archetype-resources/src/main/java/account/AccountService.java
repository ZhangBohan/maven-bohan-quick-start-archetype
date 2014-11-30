package ${package}.account;

import org.springframework.security.core.userdetails.User;

/**
 * User: bohan
 * Date: 9/15/14
 * Time: 5:19 PM
 */
public interface AccountService {
    User get(String username);
    void save(Account account);
}
