package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class InputController {
    @GetMapping("/input")
    public String getInput() {
    // 入力画面の初期表示をする
        return "input";
    }

    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String previous, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("previous", previous);
        return "output";
    }



}
