public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Jompa");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println( v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Paulo");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setCurso("Ciência da Computação");
        a1.setMatricula(5);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Darlan");
        b1.setMatricula(25462);
        b1.setBolsa(12);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
}