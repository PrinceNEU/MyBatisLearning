package com.JCR.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {

    public static void main(String[] args) throws Exception {

        String resource= "config/mybatis-config.xml";
        InputStream in= Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        Person person=session.selectOne("findPersonByName","dong");
        System.out.println(person);

        session.close();
    }
}
