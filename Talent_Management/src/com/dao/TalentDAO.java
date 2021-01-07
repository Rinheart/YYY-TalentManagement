package com.dao;
import com.entity.*;
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

    //添加异常出勤记录
    public  boolean saveAttend(Attend attend) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(attend);
            session.flush();
            System.out.println("正在保存:\n"+attend.toString());
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }

    //添加异常出勤记录
    public boolean saveDisciplinary(Disciplinary disciplinary) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(disciplinary);
            session.flush();
            System.out.println("正在保存:\n"+disciplinary.toString());
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }

    //添加奖励事件记录
    public boolean saveReward(Reward reward) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(reward);
            session.flush();
            System.out.println("正在保存:\n"+reward.toString());
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }

    //添加重大事件记录
    public boolean saveBigEvent(BigEvent bigEvent) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(bigEvent);
            session.flush();
            System.out.println("正在保存:\n"+bigEvent.toString());
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }

    //添加绩效评价记录
    public boolean saveAchievement(Achievement achievement) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(achievement);
            session.flush();
            System.out.println("正在保存:\n"+achievement.toString());
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }

    //添加主观评价记录
    public boolean saveEvaluate(Evaluate evaluate) {
        Transaction tran = null;
        Session session = null;

        try {
            session = getSession();
            tran = session.beginTransaction();

            session.save(evaluate);
            session.flush();
            System.out.println("正在保存:\n"+evaluate.toString());
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            if(session!=null){
                session.close();
            }
        }
    }
}
