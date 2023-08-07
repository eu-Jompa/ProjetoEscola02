public class Tecnico extends Aluno {
    private int regprofissional;

    public void praticar(){
        System.out.println("Praticando...");
    }

    public int getRegprofissional() {
        return regprofissional;
    }

    public void setRegprofissional(int regprofissional) {
        this.regprofissional = regprofissional;
    }
}
