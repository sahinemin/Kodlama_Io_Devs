package com.example.kodlama_io_devs.webApi.controllers;

import com.example.kodlama_io_devs.business.abstracts.LangService;
import com.example.kodlama_io_devs.entities.concretes.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/langs")
public class LangsController {
    private final LangService langService;

    @Autowired
    public LangsController(LangService langService) {
        this.langService = langService;
    }
    @GetMapping("/getAll")
    public List<Lang>getAll(){return langService.getAllLangs();}
    @GetMapping("/getSpecificLang")
    @ResponseBody
    public Lang getSpecificLang(@RequestParam int id){
        return langService.getSpecificLang(id);}
    @RequestMapping(
            value = "/addLang",
            method = RequestMethod.POST
    )
    public void addLang(@RequestBody Map<String, Object> lang){

         langService.addLang(new Lang(Integer.parseInt(lang.get("id").toString()),lang.get("name").toString()));
    }
    @RequestMapping(
            value = "/deleteLang",
            method = RequestMethod.DELETE
    )
    public void deleteLang(@RequestBody Map<String, Object> lang){
        langService.deleteLang(new Lang(Integer.parseInt(lang.get("id").toString()),lang.get("name").toString()));
    }
    @RequestMapping(
            value = "/updateLang",
            method = RequestMethod.PUT
    )
    public void updateLang(@RequestBody Map<String, Object> lang){
        langService.updateLang(new Lang(Integer.parseInt(lang.get("id").toString()),lang.get("name").toString()));
    }
}
