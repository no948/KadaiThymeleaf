package com.techacademy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class OutputController {
    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String previous, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("previous", previous);
        return "output";
    }

}
