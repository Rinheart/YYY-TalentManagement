package com.dao;
import com.entity.Talent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class TalentDAO
        extends BaseHibernateDAO
        implements ITalentDAO {

    public void save(Talent transientInstance) {
        /*Transaction tran = null;*/
        Session session = null;

        try {
            session = getSession();
            /*tran = session.beginTransaction();*/
            session.save(transientInstance);
            session.flush();
            System.out.println("正在保存:\n"+transientInstance.toString());
            /*tran.commit();*/
        } catch (RuntimeException re) {
            /*if(tran != null) tran.rollback();*/
            throw re;
        } finally {
            session.close();
        }
    }

    /*不知道返回放哪，待补充*/
    /*已在hibernate配置文件加入自动提交，实验书p67*/
    public List findByHql(String hql) {
        /*Transaction tran = null;*/
        Session session = null;

        try {
            session = getSession();
            /*tran = session.beginTransaction();*/

            Query queryObject = getSession().createQuery(hql);

            session.flush();
            System.out.println("正在执行:\n"+hql);

            /*tran.commit();*/

            return queryObject.list();

        } catch (RuntimeException re) {
            /*if(tran != null) tran.rollback();*/
            throw re;
        } finally {
            session.close();
        }


    }
}
