package graduaat.it.www.springmvcoef2.service;

import graduaat.it.www.springmvcoef2.model.UserProfile;
import java.util.List;

public interface UserProfileService {
    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
