package com.example.usermetadata.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
    
        return userRepo.save(metaData);
    }

    @Override
    public UserMetaData getsUserDetailsFromDB(String userId) {
    
    return userRepo.findAllByuniqueId(userId);
    }
     public Optional<UserMetaData> getById(Long Id){
        return userRepo.findById(Id);
     }
    
}
