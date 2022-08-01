import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso JAVA");
        curso.setDescricao("drescricao curso JAVA");
        curso.setCargaHoraria(8);
//        System.out.println(curso);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("drescricao curso JS");
        curso2.setCargaHoraria(4);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());
//        System.out.println(mentoria);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JAVASCRIPT");
        mentoria2.setDescricao("Descrição mentoria JAVASCRIPT");
        mentoria2.setData(LocalDate.now());
//        System.out.println(mentoria2);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Desenrolando o JAVA e o JAVASCRIPT");
        bootCamp.setDescricao("Aprenda a diferenca do JAVA e do JAVASCRIPT e veja na prática como usar cada uma das linguagens");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(mentoria);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria2);

        Dev dev = new Dev();
        dev.setNome("Robson Farias");
        dev.inscreverBootCamp(bootCamp);
        dev.progredir();
//        dev.progredir();

        Dev dev1 = new Dev();
        dev1.setNome("Camila Farias");
        dev1.inscreverBootCamp(bootCamp);
        dev1.progredir();
        dev1.progredir();

        System.out.println(dev.getNome());
        System.out.println("Conteudos inscritos: "+dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+dev.getConteudosConcluidos());
        System.out.println("Seu XP atual é: "+dev.calcularTotalXp());

        System.out.println("-------------------------------------");

        System.out.println(dev1.getNome());
        System.out.println("Conteudos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+dev1.getConteudosConcluidos());
        System.out.println("Seu XP atual é: "+dev1.calcularTotalXp());

        System.out.println("-------------------------------------");

        System.out.println("BootCampo: "+bootCamp.getNome());
        System.out.println("Descricao: "+bootCamp.getDescricao());
        System.out.println("Data Inicial: "+bootCamp.getDataInicial());
        System.out.println("Termino: "+bootCamp.getDataFinal());
        System.out.println("Conteudo do BootCamp: "+bootCamp.getConteudos());
        System.out.println("Quantidade de devs inscritos: "+bootCamp.getDevsInscritos().size());
        System.out.println("Devs inscritos: "+bootCamp.getDevsInscritos());

    }
}
