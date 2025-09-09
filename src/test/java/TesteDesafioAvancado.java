import com.alana.*;
import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteDesafioAvancado {

    private Personagem atacante, defensor;
    private Arma arma;
    private Habilidade habilidade;
    private Equipamento equipamento;
    private Combate atacanteMana, defensorMana;

    @Test
    void testeAtaqueFisicoComArmaEHabilidadeAtiva() {

        atacante = EasyMock.createMock(Personagem.class);
        defensor = EasyMock.createMock(Personagem.class);
        Arma arma = EasyMock.createMock(Arma.class);
        Habilidade habilidade = EasyMock.createMock(Habilidade.class);
        Equipamento equipamento = EasyMock.createMock(Equipamento.class);

        Combate combate = new Combate(atacante, defensor, arma, habilidade, 20, 20);
        equipamento = null;

        EasyMock.expect(atacante.atacar()).andReturn(30);
        EasyMock.expect(arma.calcularDano()).andReturn(10);
        EasyMock.expect(habilidade.getNome()).andReturn("Força Extra");
        EasyMock.expect(atacante.usarHabilidade("Força Extra")).andReturn(true);
        EasyMock.expect(habilidade.efeito()).andReturn(10);
        EasyMock.expect(defensor.receberDano(50)).andReturn(30);

        EasyMock.replay(atacante, defensor, arma, habilidade);

        int vidaRestante = combate.realizarAtaque();

        assertEquals(30, vidaRestante);
        EasyMock.verify(habilidade, arma, atacante, defensor);
        
    }

}
