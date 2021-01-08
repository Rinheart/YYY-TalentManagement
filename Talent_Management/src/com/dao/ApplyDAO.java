package com.dao;
import com.entity.Applicate;
import com.entity.Talent;
import com.entity.WorkExperience;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ApplyDAO extends BaseHibernateDAO implements IApplyDAO {

    public void save(Applicate transientInstance) {
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

    /*无覆写，直接用父类的findHql*/
    /*public List findByHql(String hql){}*/

    public void update(Applicate transientInstance) {
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

    public void updateExp(WorkExperience transientInstance) {
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

    public void saveExp(WorkExperience transientInstance) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(transientInstance);
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


    public void updateTalent(Talent transientInstance) {
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
