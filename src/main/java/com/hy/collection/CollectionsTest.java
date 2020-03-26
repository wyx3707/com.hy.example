package com.hy.collection;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 集合工具类的操作
 */
public class CollectionsTest {

    public static void main(String[] args) throws ParseException {
        boolean notBlank = org.apache.commons.lang3.StringUtils.isNotBlank(null);
        System.out.println(notBlank);

//        String string = "<p data-value=\"合同号:{合同号}\">合同号:</p><p data-value=\"户名:{户名}\">户名:</p><p data-value=\"上次安检日期:{上次安检日期}\">上次安检日期:</p><p data-value=\"本次安检日期:{本次安检日期}\">本次安检日期:</p><p data-value=\"安检订单号:{安检订单号}\">安检订单号:</p><p data-value=\"隐患(待用户整改):{隐患(待用户整改)}\">隐患(待用户整改):</p><p data-value=\"安检员姓名:{安检员姓名}\">安检员姓名:</p><p data-value=\"安检员电话:{安检员电话}\">安检员电话:</p><p data-value=\"客服电话:{客服电话}\">客服电话:110-119-120</p><p data-value=\"用户签名:{用户签名}\">用户签名:</p><p data-value=\"表钢号:{表钢号}\">表钢号:</p><p data-value=\"表计方向:{表计方向}\">表计方向:</p>";
//        List<String> subUtil = getSubUtil(string, ">(.*?)</p>");
//        boolean isRe = true;
//        String realSteelGradeKey = "表钢号";
//        String insertCardDirectionKey = "表计方向";
//        String useGasTypeKey = "用气类型";
//        String meterReadNumberKey = "本次表数";
//        for (String context : subUtil) {
//            if ((context.contains(realSteelGradeKey) || context.contains(insertCardDirectionKey) || context.contains(useGasTypeKey) || context.contains(meterReadNumberKey)) && isRe) {
//                isRe = false;
//                //组合列表
//                List<String> collect = subUtil.stream().filter(f -> (f.contains(realSteelGradeKey) || f.contains(insertCardDirectionKey) || f.contains(useGasTypeKey) || f.contains(meterReadNumberKey))).collect(Collectors.toList());
//                for (String s:collect){
//                    if(s.contains(realSteelGradeKey)){
//                        System.out.println("sssssssssssssss");
//                    }
//                }
//            }
//        }


    }

    public static List<String> getSubUtil(String soap, String rgex) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(rgex);
        Matcher m = pattern.matcher(soap);
        while (m.find()) {
            int i = 1;
            list.add(m.group(i));
            i++;
        }
        return list;
    }
}
