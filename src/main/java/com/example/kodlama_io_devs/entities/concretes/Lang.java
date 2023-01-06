package com.example.kodlama_io_devs.entities.concretes;

import com.example.kodlama_io_devs.dataAccess.concretes.InMemoryLangRepository;

import java.util.Objects;

public class Lang {
    private int id;
    private String name;

    public Lang(int id, String name) {
        boolean includes=false;
        for (Lang localLang:
                InMemoryLangRepository.langs) {
            if(Objects.equals(name, localLang.getName())){
                includes=true;
                break;
            }
        }
        if (!includes){
            this.id = id;
            this.name = name;
        }
        else {
            System.out.println("the language is already listed");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
