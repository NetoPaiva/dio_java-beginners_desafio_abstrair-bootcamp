import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso poo");
        curso2.setDescricao("descrição curso poo");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        //System.out.println("Conteúdos Inscritos José " + devJose.getConteudosInscritos());

        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos José " + devJose.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos José " + devJose.getConteudosConcluidos());
        System.out.println("XP de José: " + devJose.calcularTotalXp());

        //apenas para separar as informações no terminal de saída
        System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        //System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP de João: " + devJoao.calcularTotalXp());
        System.out.println("-");

    }

}
