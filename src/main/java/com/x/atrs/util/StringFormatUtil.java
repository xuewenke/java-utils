
/*
 * @Copyright 2014-2020 云安宝 (www.yunanbao.com.cn).
 *
 * 注意：本内容仅限于深圳云安宝科技有限公司内部传阅，禁止外泄以及用于其他商业目的
 *
 */

package com.x.atrs.util;

import lombok.experimental.UtilityClass;

/**
 * 格式化字符串的工具类
 *
 * @author xuewenke
 */
@UtilityClass
public class StringFormatUtil {

    /**
     * 把月份格式化为两位数，如 1->01  9->09
     *
     * @param month
     * @return
     */
    public String formatMonth(int month) {
        return String.format("%02d", month);
    }

    public static void main(String[] args) {
        System.out.println(formatMonth(3));
    }
}