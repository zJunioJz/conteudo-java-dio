package poo.equipamentos.estabelecimento;

import poo.equipamentos.copiadora.Copiadora;
import poo.equipamentos.digitalizadora.Digitalizadora;
import poo.equipamentos.impressora.Deskjet;
import poo.equipamentos.impressora.Impressora;
import poo.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiadora();
    }
}
