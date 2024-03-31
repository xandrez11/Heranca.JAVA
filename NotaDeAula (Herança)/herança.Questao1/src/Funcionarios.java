class Funcionario {
    private String nome;
    private double salario=0;
    private static Funcionario[] funcionarios = new Funcionario[0];
    public Funcionario() {


    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularBonus() {
        salario+= salario * 0.1;
    }

    public double getSalario() {
        return salario;
    }
    public void cadastrar() {
        Funcionario[] novosFuncionarios = new Funcionario[funcionarios.length + 1];
        System.arraycopy(funcionarios, 0, novosFuncionarios, 0, funcionarios.length);
        novosFuncionarios[funcionarios.length] = this;
        funcionarios = novosFuncionarios;
    }

    public static Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario;
    }
}
