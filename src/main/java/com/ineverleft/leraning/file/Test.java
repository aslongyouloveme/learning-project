package com.ineverleft.leraning.file;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.HashUtil;

/**
 * @ClassName Test
 * @Description Test
 * @Author ineverleft
 * @Date 2020/7/14 下午1:57
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println((Convert.toInt("12142821") % 256));
        System.out.println((Convert.toInt("12142821") % 256)/8);
    }
}
