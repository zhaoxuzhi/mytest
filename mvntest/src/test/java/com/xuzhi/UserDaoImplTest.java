package com.xuzhi;

import org.junit.Test;

public class UserDaoImplTest {

    @Test
    public void test1() {
        IUserDao userdao = new UserDaoImpl();
        userdao.test();
    }
}