package com.example.leonardo.guiadebolsoen_us;

public class Food {
    private String nome;
    private String desc;

    public Food(String nome, String desc){
        this.nome= nome;
        this.desc = desc;
    }


    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }


}
