public class Banco {
    private Cliente clientes[] = new Cliente[2];

    public Cliente[] getClientes() {
        return clientes;
    }

    public Cliente[] cadastraClientes() {
        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345);

        clientes[0] = c1;
        clientes[1] = c2;

        return clientes;
    }

    public String operacoes() {
        // Saque R$100 de cada cliente
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].saque(100);
        }

        // Deposite R$50 na conta de cada cliente
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].deposito(50);
        }

        // Verifica extrato, se negativo seta saldo para 0
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].extrato() < 0) {
                clientes[i].setSaldo(0);
            }
        }

        // Altera nome do Cliente2 para "Ada Lovelace"
        clientes[1].setNome("Ada Lovelace");

        // Altera CPF do Cliente1 para "12345689"
        clientes[0].setCpf("12345689");

        // Retorna informacoes de todos os clientes
        String resultado = "";
        for (int i = 0; i < clientes.length; i++) {
            resultado += clientes[i].toString();
            if (i < clientes.length - 1) {
                resultado += "\n";
            }
        }

        return resultado;
    }
}
