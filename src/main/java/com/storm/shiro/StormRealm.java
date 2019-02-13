package com.storm.shiro;


import com.storm.domain.Module;
import com.storm.domain.ModuleExample;
import com.storm.domain.User;
import com.storm.domain.UserExample;
import com.storm.mapper.ModuleMapper;
import com.storm.mapper.UserMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

/**
 * 自定义realm
 */
public class StormRealm extends AuthorizingRealm {
    @Resource
    private UserMapper userMapper;
    @Resource
    private ModuleMapper moduleMapper;

    /**
     * 认证方法
     */
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        UserExample userexam = new UserExample();
        userexam.createCriteria().andUserNameEqualTo(username);
        User user = userMapper.selectByExample(userexam).get(0);
        if (user == null) {

            return null;
        } else {

            String password = user.getPassword();
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
                    password, this.getClass().getSimpleName());
            return info;
        }
    }

    /**
     * 授权方法
     */
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        User user = (User) principals.getPrimaryPrincipal();
        List<Module> list = null;
        if (user.getUserName().equals("admin")) {
            ModuleExample funexam = new ModuleExample();
            list = moduleMapper.selectByExample(funexam);
        } else {
            ModuleExample funexam = new ModuleExample();
            funexam.createCriteria().andModuleIdEqualTo(user.getUserId());
            list = moduleMapper.selectByExample(funexam);
        }
        for (Module function : list) {
            info.addStringPermission(function.getPcode());
        }
        return info;
    }

}
