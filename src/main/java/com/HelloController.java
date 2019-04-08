/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloController
 * Author:   Stephen.Liu
 * Date:     2019/4/8 上午 10:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Stephen.Liu
 * @create 2019/4/8
 * @since 1.0.0
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello --";
    }

}
