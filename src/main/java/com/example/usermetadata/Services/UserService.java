package com.example.usermetadata.Services;

import org.springframework.stereotype.Service;

import com.example.usermetadata.Entity.UserMetaData;

@Service
public interface UserService {


    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData);
    
    public UserMetaData getsUserDetailsFromDB(String userId);
   
    


}
