class Gerente extends Funcionario {
    private String departamento;

    public Gerente() {

    }

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
