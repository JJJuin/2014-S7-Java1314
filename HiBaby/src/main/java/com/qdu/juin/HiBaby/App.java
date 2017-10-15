package com.qdu.juin.HiBaby;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qdu.pojo.Account;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Reader reader = Resources.getResourceAsReader("config/config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
        
        SqlSession session = ssf.openSession();
        //第一种映射方式 通过字符串描述域名与ID查找映射
        /*List<Account> accountList = session.selectList("test.getAll");
        for(Account acc : accountList) {
        	System.out.println(acc.getUsername());
        }*/
        Account account = new Account();
        account.setUserName("testname");
        account.setPassword("testpassword");
        session.insert("test.addAcc",account);
        
        session.commit();
        
        //第二种映射方式，通过接口映射
        /*IRole roleDao = session.getMapper(IRole.class);
        List<Role> roleList = roleDao.getAll();
        for(Role role : roleList) {
        	System.out.println(role.getRolename());
        }*/
        //第三种映射方式，通过注解
        /*session.getConfiguration().addMapper(ILog.class);
        ILog logDao = session.getMapper(ILog.class);
        List<UserLog> logList = logDao.getAll();
        for(UserLog ul : logList) {
        	System.out.println(ul.getDescription());
        }*/
    }
}