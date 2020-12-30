package com.service;
import com.dao.ITalentDAO;
import com.entity.Talent;


public class UserService implements IUserService {

    private ITalentDAO talentDAO = null;

    public UserService() {
        System.out.println("create UserService.");
    }

    public void setTalentDAO(ITalentDAO talentDAO) {
        this.talentDAO = talentDAO;
    }

    public boolean register(Talent talent) {
        /*待写入逻辑*/
        return true;
    }
    public boolean login(Talent talent){
        /*待写入逻辑*/
        return true;
    }
    public boolean update(Talent talent){
        /*待写入逻辑*/
        return true;
    }
    public boolean delete(Talent talent){
        /*待写入逻辑*/
        return true;
    }
}
