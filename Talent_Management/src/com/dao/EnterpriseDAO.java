package com.dao;

import com.entity.Enterprise;
import com.entity.Talent;
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
    /*是否在hibernate配置文件加入自动提交，实验书p67*/
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
