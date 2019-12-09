package graduaat.it.www.springmvcoef2.dao;

import graduaat.it.www.springmvcoef2.model.UserProfile;
import java.util.List;

public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}