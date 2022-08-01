import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso JAVA");
        curso.setDescricao("drescricao curso JAVA");
        curso.setCargaHoraria(8);
        System.out.println(curso);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("drescricao curso JS");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JAVA");
        mentoria2.setDescricao("Descrição mentoria JAVA");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);
    }
}
