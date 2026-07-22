package org.example.dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;import java.util.HashMap;import java.util.Map;

@Controller
public class DictionaryController {

    private static final Map<String,String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "Xin chào");
        dictionary.put("book", "Quyển sách");
        dictionary.put("computer", "Máy tính");
        dictionary.put("cat", "Con mèo");
        dictionary.put("dog", "Con chó");
        dictionary.put("apple", "Quả táo");
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/search")
    public String search(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());

        if (result == null) {
            result = "Không tìm thấy từ cần tra";
        }

        model.addAttribute("word", word);
        model.addAttribute("result", result);

        return "result";
    }
}
