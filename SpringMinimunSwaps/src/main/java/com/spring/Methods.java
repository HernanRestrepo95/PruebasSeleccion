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

    static Response minimunSwaps(int arr[]) {
        int swap = 0;
        boolean visitas[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int j = i, cycle = 0;

            while (!visitas[j]) {
                visitas[j] = true;
                j = arr[j] - 1;
                cycle++;
            }

            if (cycle != 0) {
                swap += cycle - 1;
            }
        }

        Response objResponse = new Response(String.valueOf(swap));
        return objResponse;
    }

}
