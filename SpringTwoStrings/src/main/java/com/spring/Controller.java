package com.spring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringTwoStrings")
public class Controller {

    @PostMapping("/TwoStrings")
    public List<Response> TwoStrings(@RequestBody Request objRequest) {

        List<Response> objResponse = new ArrayList<Response>();
        String[] sbStrings = objRequest.getSbCadena().split(" ");
        for (int i = 0; i < objRequest.getNuCantidad() * 2; i += 2) {
            objResponse.add(Methods.twoStrings(sbStrings[i], sbStrings[i + 1]));
        }

        return objResponse;
    }
}
