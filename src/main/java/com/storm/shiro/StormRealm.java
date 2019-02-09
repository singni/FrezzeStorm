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
 * 
 *
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
		String username = upToken.getUsername();// 从令牌中获得用户名

        UserExample userexam=new UserExample();
        userexam.createCriteria().andUserNameEqualTo(username);
        User user = userMapper.selectByExample(userexam).get(0);
		if (user == null) {
			// 用户名不存在
			return null;
		} else {
			// 用户名存在
			String password = user.getPassword();// 获得数据库中存储的密码
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
					password, this.getClass().getSimpleName());
			return info;//返回给安全管理器，由安全管理器负责比对数据库中查询出的密码和页面提交的密码
		}
	}

	/**
	 * 授权方法
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//根据当前登录用户查询其对应的权限，授权
		User user = (User) principals.getPrimaryPrincipal();
		List<Module> list = null;
		if(user.getUserName().equals("admin")){
			//当前用户是超级管理员，查询所有权限，为用户授权
            ModuleExample funexam=new ModuleExample();
            list = moduleMapper.selectByExample(funexam);
		}else{
			//普通用户，根据用户id查询对应的权限
            ModuleExample funexam=new ModuleExample();
            funexam.createCriteria().andModuleIdEqualTo(user.getUserId());
            list = moduleMapper.selectByExample(funexam);
		}
		for (Module function : list) {
			info.addStringPermission(function.getPcode());
		}
		return info;
	}

}
