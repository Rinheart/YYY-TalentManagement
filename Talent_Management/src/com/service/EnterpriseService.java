package com.service;

import com.dao.IEnterpriseDAO;
import com.entity.Enterprise;
import com.entity.Talent;

import java.util.List;

public class EnterpriseService implements IEnterpriseService{
    private IEnterpriseDAO enterpriseDAO = null;
    public EnterpriseService() {
        System.out.println("create EnterpriseService.");
    }

    public void setEnterpriseDAO(IEnterpriseDAO enterpriseDAO) {
        this.enterpriseDAO = enterpriseDAO;
    }

    public boolean register(Enterprise Enterprise) {
        /*待写入逻辑*/
        return true;
    }
    public boolean login(Enterprise enterprise) {
        /*ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");*/
        String enterpriseId = enterprise.getEnterpriseId();
        String password = enterprise.getPassword();
        String hql = "from Enterprise as enterprise where EnterpriseId='"
                + enterpriseId + "' and password='" + password + "'";
        List list = enterpriseDAO.findByHql(hql);
        if (list.isEmpty()){
            //request.put("tip", "密码不正确，请重新登录")
            return false;
        }
        else {
            /*session.put("user", account);
            request.put("tip", "登录成功！");
            talent = (Talent) list.get(0);
            request.put("talent", talent);*/
            return true;
        }
    }
    public boolean update(Enterprise enterprise){
        /*待写入逻辑*/
        return true;
    }
    public boolean delete(Enterprise enterprise){
        /*待写入逻辑*/
        return true;
    }
}
