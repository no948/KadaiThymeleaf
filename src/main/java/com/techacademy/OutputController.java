package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class OutputController {
    @GetMapping("/output")
    public String postOutput() {
        // 入力画面から入力値を受け取って、出力画面を表示する
        return "output";
    }
    @PostMapping("/input")
    public String getLink(Model model) {
        model.addAttribute("previous");
        return "input";
    }
}
