/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

/**
 *
 * @author Hernan_Restrepo
 */
public class Methods {

    static Response twoStrings(String s1, String s2) {

        String sbRespuesta = "NO";

        if (s1.length() < 1 || s1.length() > Math.pow(10, 5) || s2.length() < 1 || s2.length() > Math.pow(10, 5)) {
            sbRespuesta = "NO";
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    sbRespuesta = "YES";
                }
            }
        }

        Response objResponse = new Response(sbRespuesta);
        return objResponse;
    }
}
