package Optional;

import java.util.List;

class Curso{
    private String nome;
    private List<Aluno> listaAluno;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }
}
class Aluno{
    private Matricula matricula;
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Matricula{
    private String numero;

    public Matricula(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
public class ExemploOptional {
    public static void main(String[] args){
        //Criando curso
        Curso cursoAdm = new Curso("Administração");

        //Criando alunos
        Aluno joao = new Aluno("João");
        joao.setMatricula(new Matricula("1001"));
        cursoAdm.getListaAluno().add(joao);

        Aluno maria = new Aluno("Maria");
        maria.setMatricula(new Matricula("1002"));
        cursoAdm.getListaAluno().add(maria);

        Aluno mateus = new Aluno("Mateus");
        mateus.setMatricula(new Matricula("1003"));
        cursoAdm.getListaAluno().add(mateus);

        Aluno paulo = new Aluno("Paulo");
        paulo.setMatricula(new Matricula("1004"));
        cursoAdm.getListaAluno().add(paulo);

        Aluno jose = new Aluno("Jose");
        jose.setMatricula(new Matricula("1005"));
        cursoAdm.getListaAluno().add(jose);

        cursoAdm.getListaAluno().forEach(a -> System.out.println("Aluno: "+a.getNome()+", Matricula: "+a.getMatricula()));
    }
}
