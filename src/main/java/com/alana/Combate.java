package com.alana;

public class Combate {

//    private Atacante atacante;
//    private Defensor defensor;
//    private Magia magia;

    private Personagem atacar;
    private Personagem defensor;
    private Arma arma;
    private Habilidade habilidade;
    private int atacanteMana;
    private int defensorMana;


    public Combate(Personagem atacar, Personagem defensor, Arma arma, Habilidade habilidade, int atacanteMana, int defensorMana) {
        this.atacar = atacar;
        this.defensor = defensor;
        this.arma = arma;
        this.habilidade = habilidade;
        this.atacanteMana = atacanteMana;
        this.defensorMana = defensorMana;
    }

    public int realizarAtaque() {
        int danoBase = atacar.atacar() + arma.calcularDano();

        if (atacar.usarHabilidade(habilidade.getNome())) {
            danoBase += habilidade.efeito();

        }

        if (atacanteMana < 10 && habilidade.getNome().equals("Magia")) {
            danoBase -= 10;

        }
        return defensor.receberDano(danoBase);
    }
}
