package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        System.out.println(paciente);

        Paciente paciente2 = paciente;
        System.out.println(paciente2);

        System.out.println(paciente == paciente2);
    }
}
