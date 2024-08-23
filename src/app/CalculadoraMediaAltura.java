package app;

public class CalculadoraMediaAltura {
    private Pessoa[] pessoas;

    public CalculadoraMediaAltura(int numPessoas) {
        pessoas = new Pessoa[numPessoas];
    }

    public void adicionarPessoa(int indice, double altura) {
        pessoas[indice] = new Pessoa(altura);
    }

    public double calcularMediaAltura() {
        double somaAlturas = 0.0;
        for (Pessoa pessoa : pessoas) {
            somaAlturas += pessoa.getAltura();
        }
        return somaAlturas / pessoas.length;
    }
}
