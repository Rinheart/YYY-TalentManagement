package com.service;

import com.dao.IEnterpriseDAO;
import com.entity.Enterprise;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
import java.util.Map;

public class EnterpriseService implements IEnterpriseService{
    private IEnterpriseDAO enterpriseDAO = null;
    public EnterpriseService() {
        System.out.println("create EnterpriseService.");
    }

    public void setEnterpriseDAO(IEnterpriseDAO enterpriseDAO) {
        this.enterpriseDAO = enterpriseDAO;
    }

    public boolean register(Enterprise enterprise) {
        Map request = (Map) ActionContext.getContext().get("request");
        String enterpriseId = enterprise.getEnterpriseId();
        String hql = "from Enterprise as enterprise where EnterpriseId='" + enterpriseId + "'";
        List list = enterpriseDAO.findByHql(hql);
        if (!list.isEmpty()){
            request.put("tip","注册失败，出现重名用户");
            return false;
        }
        enterprise.setInformationReview(true);
        enterpriseDAO.save(enterprise);
        request.put("tip","恭喜您注册成功！");
        //做一个跳转功能，待实现
        return true;
    }
    public boolean login(Enterprise enterprise) {
        Map request = (Map) ActionContext.getContext().get("request");
        String enterpriseId = enterprise.getEnterpriseId();
        String password = enterprise.getPassword();
        String hql = "from Enterprise as enterprise where EnterpriseId='"
                + enterpriseId + "' and password='" + password + "'";
        List list = enterpriseDAO.findByHql(hql);
        if (list.isEmpty()){
            request.put("tip", "密码不正确，请重新登录");
            return false;
        }
        request.put("tip", "登录成功！");
        return true;
    }
    public boolean update(Enterprise enterprise){
        /*待写入逻辑*/
        return true;
    }
}
