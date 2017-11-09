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
}
