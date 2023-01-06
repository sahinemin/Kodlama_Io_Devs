package com.example.kodlama_io_devs.business.abstracts;

import com.example.kodlama_io_devs.entities.concretes.Lang;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LangService {
    List<Lang> getAllLangs();
    void addLang(Lang lang);

    Lang getSpecificLang(int id);
    void deleteLang(Lang lang);
    void updateLang(Lang lang);
}
