import com.br.dio.desafio.dominio.Bootcamp;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Dev;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Cuso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Cuso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria do curso java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luiz: " + devLuiz.getConteudosInscritos());

        devLuiz.progredir();
        devLuiz.progredir();

        System.out.println("Conteudos Inscritos Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Luiz: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXP());

        System.out.println("__________________");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());

        devJoao.progredir();

        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

    }
}
