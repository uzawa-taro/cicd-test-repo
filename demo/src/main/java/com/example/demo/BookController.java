package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("ui/book")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("date",this.getCurrentDate());
        return "index";
    }

    private String getCurrentDate(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return dtf.format(date);
    }

    @GetMapping("list")
    public String list(Model model){
        model.addAttribute("bookList", bookService.findAll());
        return "list";
    }

    @GetMapping("add")
    public String add(Model model){
        model.addAttribute("book",new Book());
        return "add";
    }

    @PostMapping("add")
    public String add(Book book){
        bookService.addBook(book);
        return "redirect:list";
    }
}
