import com.alana.Atacante;
import com.alana.Defensor;
import com.alana.Magia;
import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAtaqueSimples {
//    @Test
//    void testeAtaqueSimples() {
//
//        Atacante atacante = EasyMock.createMock(Atacante.class);
//        EasyMock.expect(personagem.atacar()).andReturn(20);
//
//        EasyMock.replay(atacante);
//
//        Defensor defensor = EasyMock.createMock(Defensor.class);
//        EasyMock.expect(defensor.defender(10)).andReturn(0);
//
//        EasyMock.replay(defensor);
//
//        assertEquals(0, defensor.defender(10));
//        EasyMock.verify(defensor);
//    }
//
//    @Test
//    void testeLancarMagiaDeFogo(){
//
//        Magia magia = EasyMock.createMock(Magia.class);
//        EasyMock.expect(magia.lancarMagia("fogo")).andReturn("Explosão de fogo!");
//        EasyMock.replay(magia);
//
//        assertEquals("Explosão de fogo!", magia.lancarMagia("fogo"));
//        EasyMock.verify(magia);
//
//    }
//
//    @Test
//    void testeDefesaInvalida(){
//
//        Defensor defensor = EasyMock.createMock(Defensor.class);
//        EasyMock.expect(defensor.defender(-5)).andReturn(-1).andThrow(new IllegalArgumentException("Dano inválido"));
//        EasyMock.replay(defensor);
//
//        assertEquals(-1, defensor.defender(-5));
//        assertThrows(IllegalArgumentException.class, () -> defensor.defender(-5));
//        EasyMock.verify(defensor);
//
//    }
//
//    @Test
//    void testVariosAtaquesSeguidos(){
//
//        Atacante atacante = EasyMock.createMock(Atacante.class);
//        EasyMock.expect(atacante.atacar()).andReturn(15).andReturn(25).andReturn(30);
//        EasyMock.replay(atacante);
//
//        assertEquals(15, atacante.atacar());
//        assertEquals(25, atacante.atacar());
//        assertEquals(30, atacante.atacar());
//        EasyMock.verify(atacante);
//    }

}
