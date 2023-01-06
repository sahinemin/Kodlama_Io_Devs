package com.example.kodlama_io_devs.dataAccess.concretes;

import com.example.kodlama_io_devs.dataAccess.abstracts.LangRepository;
import com.example.kodlama_io_devs.entities.concretes.Lang;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLangRepository implements LangRepository {
    public static List<Lang> langs;
    public InMemoryLangRepository() {
        langs=new ArrayList<>();
        langs.add(new Lang(1,"Java"));
        langs.add(new Lang(2,"C#"));
        langs.add(new Lang(3,"GO"));
    }

    @Override
    public List<Lang> getAllLangs() {
        return langs;
    }


    @Override
    public Lang getSpecificLang(int id) {
        return langs.get(id-1);
    }

    @Override
    public void addLang(Lang lang) {
        langs.add(lang);
    }

    @Override
    public void deleteLang(Lang lang) {
        if(langs.contains(lang)) {
            langs.remove(lang);
        }
        else {
            System.out.println("couldnt find lang");
        }

    }
    @Override
    public void updateLang(Lang lang) {
            langs.get(lang.getId()-1).setName(lang.getName());
    }
}
