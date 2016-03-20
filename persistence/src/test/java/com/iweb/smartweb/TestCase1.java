package com.iweb.smartweb;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ClassUtils;

/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 16/3/10 18:20
 * @see
 * @since 1.0
 */
public class TestCase1 {

    public static void main(String[] args) throws ClassNotFoundException {
        TestCase1 t = new TestCase1();
//        System.out.println(Class.forName(t.getClass().toString().split(" ")[1]).getSimpleName());
        System.out.println(ClassUtils.getShortName(t.getClass()));
        System.out.println(StringUtils.uncapitalize(ClassUtils.getShortName(t.getClass())));
    }
}
