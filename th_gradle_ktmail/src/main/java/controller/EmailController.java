package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailController {
    private static Pattern parttern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailController(){
        parttern= Pattern.compile(EMAIL_REGEX);
    }
    @GetMapping("/")
    public String getIndex(){

        return "index";
    }
@PostMapping("validate")
   public String validateEmail(@RequestParam("email") String email, Model model) {
        boolean isvalid = this.validate(email);
        if (!isvalid) {
            model.addAttribute("message", "Email is invalid");
            return "index";
        }

        model.addAttribute("email", email);
        return "success";
    }

    private boolean validate(String regex) {
        matcher = parttern.matcher(regex);
        return matcher.matches();
    }

}

