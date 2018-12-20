package com.spring;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ControllerTest {

    @Test
    public void testMinimunSwaps() {
        Request objRequest = new Request(10, "3 7 6 9 1 8 10 4 2 5");

        Controller objController = new Controller();

        List<Response> objRespObt = objController.MinimunSwaps(objRequest);

        List<Response> objResponse = new ArrayList<Response>();
        objResponse.add(new Response("9"));

        CompareTo.assertEqualsCompare(objResponse, objRespObt);
    }

}
