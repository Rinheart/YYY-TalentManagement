package com.dao;
import com.entity.Talent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class TalentDAO extends BaseHibernateDAO implements ITalentDAO {

    public void save(Talent transientInstance) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(transientInstance);
            session.flush();
            System.out.println("正在保存:\n"+transientInstance.toString());
            tran.commit();
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            throw re;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }


    /*是否在hibernate配置文件加入自动提交，实验书p67*/
    /*无覆写，直接用父类的findHql*/
    /*public List findByHql(String hql){}*/

    public void update(Talent transientInstance) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.update(transientInstance);
            session.flush();
            System.out.println("正在更新:\n"+transientInstance.toString());
            tran.commit();
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            throw re;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }
}
