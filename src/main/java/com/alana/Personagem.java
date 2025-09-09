package com.alana;

public interface Personagem {
    int atacar();
    int defender();
    int receberDano(int dano);
    boolean usarHabilidade(String nomeHabilidade);
}
