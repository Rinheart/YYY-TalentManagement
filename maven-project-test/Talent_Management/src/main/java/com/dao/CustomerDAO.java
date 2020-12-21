package com.dao;
import com.po.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CustomerDAO
        extends BaseHibernateDAO
        implements ICustomerDAO{

    public void save(Customer transientInstance) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();
            session.save(transientInstance);
            System.out.println("11111111111\n"+transientInstance.toString());
            tran.commit();
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            throw re;
        } finally {
            session.close();
        }
    }
}
