package graduaat.it.www.springmvcoef2.dao;

import java.util.List;
 
import graduaat.it.www.springmvcoef2.model.User;

public interface UserDao {
    User findById(int id);
     
    User findBySSO(String sso);
     
    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}
