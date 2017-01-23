package com.mifi.insurance.controllers;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

/**
 * Created by niqunhao on 17/1/23.
 */
@Path("/hello/")
public class HelloController {
    @Get("world")
    public String index(){
        return "@hello world";
    }

}
