package com.service;
import com.dao.ICustomerDAO;
import com.entity.Talent;


public class UserService implements IUserService {
    /*此处，talentdao没写*/
    private ICustomerDAO customerDAO = null;

    public UserService() {
        System.out.println("create UserService.");
    }

    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }

    public boolean register(Talent talent) {
        /*System.out.println("execute --register()-- method.");
        customerDAO.save(reg_customer);
        System.out.println("成功注册一个customer"+reg_customer.toString());*/
        return true;
    }
    public boolean login(Talent talent){
        return true;
    }


}
