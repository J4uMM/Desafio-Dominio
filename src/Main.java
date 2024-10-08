import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java");
        System.out.println(curso);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
    }
}