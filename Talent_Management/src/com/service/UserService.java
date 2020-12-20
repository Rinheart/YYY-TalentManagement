package com.service;
import com.dao.ICustomerDAO;
import com.po.Customer;


public class UserService implements IUserService {
    private ICustomerDAO customerDAO = null;

    public UserService() {
        System.out.println("create UserService.");
    }

    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }

    public void register(Customer reg_customer) {
        System.out.println("execute --register()-- method.");
        customerDAO.save(reg_customer);
        System.out.println("成功注册一个customer"+reg_customer.toString());
    }


}
