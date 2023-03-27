/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplillos {

    public static void main(String[] args) {
        final String regex = "(Localizacion:) ([N-S-E-O])";
        final String string = "a aquiLocalizacion: N vsdvf";

        System.out.println(string.matches(regex));
        
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
