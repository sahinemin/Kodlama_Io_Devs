package com.example.kodlama_io_devs.dataAccess.abstracts;

import com.example.kodlama_io_devs.entities.concretes.Lang;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LangRepository {
    List<Lang> getAllLangs();
    Lang getSpecificLang(int id);
    void addLang(Lang lang);
    void deleteLang(Lang lang);
    void updateLang(Lang lang);
}
