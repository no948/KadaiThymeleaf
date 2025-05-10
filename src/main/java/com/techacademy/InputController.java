package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {
    @GetMapping("/input")
    public String getInput() {
    // 入力画面の初期表示をする
        return "input";
    }

}
