


package com.x.atrs.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串正则
 *
 * @author xuewenke
 */
@UtilityClass
public class StringRegularUtil {
    /**
     * 匹配换行符
     */
    private final Pattern LINE_BREAK_PATTERN = Pattern.compile("[\r\n]");


    /**
     * 字符串有换行符，处理成不换自的字符换，换行符号替换为 “ ”
     *
     * @param content
     * @return 不换行的字符串
     */
    public String notLineBreak(String content) {
        if (StringUtils.isBlank(content)) {
            return content;
        }
        Matcher m = LINE_BREAK_PATTERN.matcher(content);
        return m.replaceAll(" ");
    }

}