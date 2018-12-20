/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Hernan_Restrepo
 */
public class CompareTo {
    
    public static void assertEqualsCompare(List<Response> lstResEsp, List<Response> lstResObt){
        for (int i = 0; i < lstResEsp.size(); i++) {
            assertEquals(lstResEsp.get(i).getMessage(), lstResObt.get(i).getMessage());
        }
        
    }
}
