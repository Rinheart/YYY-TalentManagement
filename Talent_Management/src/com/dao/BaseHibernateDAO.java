package com.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class BaseHibernateDAO{
    private SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.openSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /*基础操作写在此，子类继承，具体操作也可覆写*/
    public List findByHql(String hql){
        Transaction tran=null;
        Session session=getSession();//直接getSession()，否则报空指针错误
        List list=null;
        try{
            tran=session.beginTransaction();
            Query query=session.createQuery(hql);
            list=query.list();
            tran.commit();
        }
        catch (RuntimeException re){
            if(tran != null) tran.rollback();
            throw re;
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
        return list;
    }

}
