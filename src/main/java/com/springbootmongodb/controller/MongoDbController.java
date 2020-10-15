package com.springbootmongodb.controller;

import com.springbootmongodb.config.XxcInfo;
import com.springbootmongodb.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : huyan
 * @Desrciption : MongoDbController
 * @date : 2020-10-11 19:13
 **/
@RestController
public class MongoDbController {
    @Autowired
    private MongoDbService mongoDbService;

    @PostMapping("/mongo/save")
    public String saveObj(@RequestBody XxcInfo book) {
        return mongoDbService.saveObj(book);
    }

    @GetMapping("/mongo/findAll")
    public List<XxcInfo> findAll() {
        return mongoDbService.findAll();
    }

    @GetMapping("/mongo/findOne")
    public XxcInfo findOne(@RequestParam String id) {
        return mongoDbService.getBookById(id);
    }

    @GetMapping("/mongo/findOneByName")
    public XxcInfo findOneByName(@RequestParam String name) {
        return mongoDbService.getBookByName(name);
    }

    @PostMapping("/mongo/update")
    public String update(@RequestBody XxcInfo book) {
        return mongoDbService.updateBook(book);
    }

    @PostMapping("/mongo/delOne")
    public String delOne(@RequestBody XxcInfo book) {
        return mongoDbService.deleteBook(book);
    }

    @GetMapping("/mongo/delById")
    public String delById(@RequestParam String id) {
        return mongoDbService.deleteBookById(id);
    }

    @GetMapping("/mongo/findlikes")
    public List<XxcInfo> findByLikes(@RequestParam String search) {
        return mongoDbService.findByLikes(search);
    }
}
