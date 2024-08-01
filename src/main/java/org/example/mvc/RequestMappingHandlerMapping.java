package org.example.mvc;

import org.example.mvc.controller.Controller;
import org.example.mvc.controller.HomeController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    // [key] /users [value] UserController
    private Map<String, Controller> mapping = new HashMap<>();

    void init(){
        mapping.put("/", new HomeController()); // /는 키, 홈컨트롤러는 밸류 (찾아갈 값)


    }

    public  Controller fineHandler(String uriPath){
        return mapping.get(uriPath);
    }
}
