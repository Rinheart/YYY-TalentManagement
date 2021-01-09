package com.dao;

import com.entity.Department;
import com.entity.Enterprise;
import com.entity.Talent;
import com.entity.v_Enterprise_Talent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EnterpriseDAO extends BaseHibernateDAO implements IEnterpriseDAO{
    public void save(Enterprise transientInstance) {
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
    public void update(Enterprise transientInstance) {
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
    //存储部门信息
    public void saveDepartment(Department transientInstance) {
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
    // 修改部门信息
    public void updateDepartment(Department transientInstance) {
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.update(transientInstance);
            session.flush();
            System.out.println("正在更新部门信息:\n"+transientInstance.toString());
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
    //修改人事信息
    public void updateHR(Talent transientInstance) {
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.update(transientInstance);
            session.flush();
            System.out.println("正在更新HR信息:\n"+transientInstance.toString());
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
   //删除部门
   public void deleteDepartment(int departmentid) {
       Transaction tran = null;
       Session session = null;
       try {
           session = getSession();
           tran = session.beginTransaction();
           String hql = "Delete From Department where departmentId =?1";
           Query q = session.createQuery(hql) ;
           q.setParameter(1,departmentid);
           System.out.println("正在删除部门ID为'"+departmentid+"'的部门。");
           q.executeUpdate();
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
