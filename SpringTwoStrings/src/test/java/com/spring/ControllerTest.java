package com.spring;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ControllerTest {

    @Test
    public void testTwoStrings() {
        Request objRequest = new Request(4, "wouldyoulikefries abcabcabcabcabcabc hackerrankcommunity cdecdecdecde jackandjill wentupthehill writetoyourparents fghmqzldbc");

        Controller objController = new Controller();

        List<Response> objRespObt = objController.TwoStrings(objRequest);

        List<Response> objResponse = new ArrayList<Response>();
        objResponse.add(new Response("NO"));
        objResponse.add(new Response("YES"));
        objResponse.add(new Response("YES"));
        objResponse.add(new Response("NO"));

        CompareTo.assertEqualsCompare(objResponse, objRespObt);
    }
}
