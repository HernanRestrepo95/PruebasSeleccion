package com.spring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringMinimunSwaps")
public class Controller {

    @PostMapping("/MinimunSwaps")
    public List<Response> MinimunSwaps(@RequestBody Request objRequest) {

        List<Response> objResponse = new ArrayList<Response>();

        String[] arrItems = objRequest.getSbCadena().split(" ");
        int nuCantidad = objRequest.getNuCantidad();
        int[] arr = new int[nuCantidad];
        for (int i = 0; i < nuCantidad; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        objResponse.add(Methods.minimunSwaps(arr));
        return objResponse;
    }

}
