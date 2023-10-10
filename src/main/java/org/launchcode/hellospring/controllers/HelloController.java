package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ResponseBody
//@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
    //lives /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // handles request of the form/hello?name=LaunchCode
    //lives at hello/hello
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Yo, " + name + " !";
    }

    //respongs to /hello/launchCode
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        model.addAttribute("greeting", "Hello," + name + "!");
        return "hello";

    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }
}


        //        return "<html" +
//                "<head>" +
//                     "<title>Greeting Form</title>" +
//                "</head>" +
//                "<body>" +
//                "<h2>Greeting Form</h2>" +
//                "<form action='/hello' method='post'>" +
//                "<label for='name'>Name:</label>" +
//                "<input type='text' id='name' name='name'><br>" +
//                "<label for='language'>Select a language:</label>" +
//                "<select id='language' name='language'>" +
//                "<option value='english'>English</option>" +
//                "<option value='french'>French</option>" +
//                "<option value='italian'>Italian</option>" +
//                "<option value='spanish'>Spanish</option>" +
//                "<option value='german'>German</option>" +
//                "</select><br>" +
//
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";


    //handles requests of the form /hello/LaunchCode
    //lives at /hello/form
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + " !";
//    }
//    @RequestMapping(value="hello", method = RequestMethod.POST)
//    @ResponseBody
//    public String helloPost(@RequestParam String name, @RequestParam String language, Map<String, Object> model) {
//        if (name == null) {
//            name = "World";
//        }
//
//        String greeting = createMessage(name, language);
//        return "greetingResult::greetingMessage"; // Renders the result template fragment.
//    }
//
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "World";
//        }
//
//        return createMessage(name, language);
//    }
//    private static String createMessage(String name, String language) {
//        String greeting = "";
//
//        if ("english".equals(language)) {
//            greeting = "Hello";
//        } else if ("french".equals(language)) {
//            greeting = "Bonjour";
//        } else if ("italian".equals(language)) {
//            greeting = "Buongiorno";
//        } else if ("spanish".equals(language)) {
//            greeting = "Hola";
//        } else if ("german".equals(language)) {
//            greeting = "Hallo";
//        } else {
//            // Default to English if the language is not recognized.
//            greeting = "Hello";
//        }
//
//        return greeting + " " + name;
//    }

//    @GetMapping("form")
//    public String helloForm(){
//        return"form";
//
//        //        return "<html" +
////                "<head>" +
////                     "<title>Greeting Form</title>" +
////                "</head>" +
////                "<body>" +
////                "<h2>Greeting Form</h2>" +
////                "<form action='/hello' method='post'>" +
////                "<label for='name'>Name:</label>" +
////                "<input type='text' id='name' name='name'><br>" +
////                "<label for='language'>Select a language:</label>" +
////                "<select id='language' name='language'>" +
////                "<option value='english'>English</option>" +
////                "<option value='french'>French</option>" +
////                "<option value='italian'>Italian</option>" +
////                "<option value='spanish'>Spanish</option>" +
////                "<option value='german'>German</option>" +
////                "</select><br>" +
////
////                "<input type='submit' value='Greet me!'>" +
////                "</form>" +
////                "</body>" +
////                "</html>";
//
//    }



