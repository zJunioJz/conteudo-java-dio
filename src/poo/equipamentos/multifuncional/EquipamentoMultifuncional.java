package poo.equipamentos.multifuncional;

import poo.equipamentos.copiadora.Copiadora;
import poo.equipamentos.digitalizadora.Digitalizadora;
import poo.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiadora() {
        System.out.println("Copiando via equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
}
