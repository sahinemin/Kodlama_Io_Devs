package com.example.kodlama_io_devs.business.concretes;

import com.example.kodlama_io_devs.business.abstracts.LangService;
import com.example.kodlama_io_devs.dataAccess.abstracts.LangRepository;
import com.example.kodlama_io_devs.entities.concretes.Lang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LangManager implements LangService {
    private final LangRepository langRepository;

    public LangManager(LangRepository langRepository) {
        this.langRepository = langRepository;
    }

    @Override
    public List<Lang> getAllLangs() {
        return langRepository.getAllLangs();
    }

    @Override
    public void addLang(Lang lang) {
        if(lang.getName().isBlank()||lang.getName().isEmpty()){
            return;
        }
         langRepository.addLang(lang);
    }

    @Override
    public Lang getSpecificLang(int id) {
        return langRepository.getSpecificLang(id);
    }

    @Override
    public void deleteLang(Lang lang) {
        langRepository.deleteLang(lang);
    }
    @Override
    public void updateLang(Lang lang) {
        if(lang.getName().isBlank()||lang.getName().isEmpty()){
            return;
        }
        langRepository.updateLang(lang);
    }


}
