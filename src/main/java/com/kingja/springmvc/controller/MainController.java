package com.kingja.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description：TODO
 * Create Time：2016/11/15 15:35
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Controller()
@RequestMapping(value = "/main")
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView main() {
        logger.debug("main");
        ModelAndView modelAndView = new ModelAndView("main");
        return modelAndView;
    }


}
