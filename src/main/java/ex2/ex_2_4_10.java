package ex2;

import java.util.*;

/**
 * Created by alexey on 11.09.16.
 */
public class ex_2_4_10 {


    private static String printTextPerRole(String[] roles, String[] textLines) {
        int i = 0;
        Map<String, StringBuilder> roleMap = new LinkedHashMap<>();
        for (String s : roles) {
            roleMap.put(s, new StringBuilder());
        }
        for (String s : textLines) {
            ++i;
            String r = s.substring(0, s.indexOf(":"));
            String text = s.substring(s.indexOf(":") + 1);
            roleMap.get(r).append(i).append(")").append(text).append("\n");
        }

        StringBuilder total = new StringBuilder(textLines.length + roles.length * 2);
        roleMap.forEach((k, v) -> {
            total.append(k).append(":").append("\n").append(v.toString()).append("\n");
        });
        return total.toString();

    }

    public static void main(String[] args) {

        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"

        };
        String[] text = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(printTextPerRole(roles, text));
    }

}
