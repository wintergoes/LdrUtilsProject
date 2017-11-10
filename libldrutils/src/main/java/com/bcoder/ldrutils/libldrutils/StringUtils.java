package com.bcoder.ldrutils.libldrutils;

public class StringUtils {

    /**
     * 将字符串转换为整数值
     * @param s 要转换的字符串
     * @param defaultValue 转换失败后返回的默认的整数值
     * @return 返回整数结果
     */
    public static final int str2Int(String s, int defaultValue){
        int result = defaultValue;
        try{
            result = Integer.parseInt(s);
        }catch (Exception e){

        }

        return result;
    }

    /**
     * 检查字符串为空或者null，如果是返回第二个参数的值
     * @param src 源字符串
     * @param dest 如果为空或者null返回的字符串
     * @return
     */
    public static String checkEmptyString(String src, String dest){
        if(null == src || src.isEmpty()){
            return dest;
        }else{
            return src;
        }
    }

    /**
     * 使用空格连接两个字符串，比如：str1: a, str2: b，返回：a b
     * @param str1
     * @param str2
     * @return
     */
    public static String concatStrWithSpace(String str1, String str2){
        return concatStrWithSep(str1, str2, " ");
    }

    /**
     * 使用连接符连接两个字符串，比如：str1: a, str2: b, sep: -, 返回: a-b
     * @param str1
     * @param str2
     * @param sep
     * @return
     */
    public static String concatStrWithSep(String str1, String str2, String sep){
        if(str1 == null || str1.isEmpty()){
            return str2;
        }

        if(str2 == null || str2.isEmpty()){
            return str1;
        }

        return str1 + sep + str2;
    }
}
