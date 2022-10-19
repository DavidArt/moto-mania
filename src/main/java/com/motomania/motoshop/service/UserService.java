package com.motomania.motoshop.service;

import com.motomania.motoshop.domain.UserEntity;
import com.motomania.motoshop.dto.User;
import com.motomania.motoshop.repo.UserRepo;
import com.motomania.motoshop.util.MapperUtil;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;
    private final MapperUtil mapperUtil;

    public UserService(UserRepo userRepo, MapperUtil mapperUtil) {
        this.userRepo = userRepo;
        this.mapperUtil = mapperUtil;
    }

    public User getUser(Long id){
        UserEntity userEntity = userRepo
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No user found with this is id = " + id));

        return mapperUtil.map(userEntity, User.class);
    }

    public List<User> getAllUsers(){
        List<UserEntity> userEntityList = userRepo.findAll();

        return mapperUtil.mapList(userEntityList, User.class);
    }

    public User createUser(User user){
        UserEntity savedUser = userRepo
                .save(mapperUtil.map(user, UserEntity.class));

        return mapperUtil.map(savedUser, User.class);
    }

    public User updateUser(User user){
        UserEntity updateUser = userRepo
                .save(mapperUtil.map(user, UserEntity.class));

        return mapperUtil.map(updateUser, User.class);
    }

    public void deleteUser(Long id){
        if (userRepo.existsById((id))) {
            userRepo.deleteById(id);
        }
    }
}
