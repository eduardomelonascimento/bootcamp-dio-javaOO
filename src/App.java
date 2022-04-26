import java.time.LocalDate;
import java.time.Month;

import br.com.dio.desafio.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Conteúdos
         **/

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java OO");
        cursoJava.setDescricao("Curso de fundamentos da orientação a objetos em Java.");
        cursoJava.setCargaHoraria(8);
        // System.out.println(cursoJava);

        Mentoria mentoriaSpring = new Mentoria();
        mentoriaSpring.setTitulo("Simplificando projetos com Spring");
        mentoriaSpring.setDescricao(
                "Nessa mentoria você vai aprender a utilizar o Spring nos seus projetos e conhecer o poder desse framework.");
        mentoriaSpring.setData(LocalDate.of(2022, Month.MAY, 7));

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JS");
        cursoJS.setDescricao("Curso introdutório de JavaScript para desenvolvimento Web Frontend.");
        cursoJS.setCargaHoraria(6);
        // System.out.println(cursoJS);

        Mentoria mentoriaAngular = new Mentoria();
        mentoriaAngular.setTitulo("Criação de SPA com Angular");
        mentoriaAngular.setDescricao(
                "Nessa mentoria você vai aprender a criar SPAs com o Angular e conhecer o poder desse framework, utilizando TypeScript.");

        /*
         * Bootcamp
         **/

        Bootcamp philips = new Bootcamp();
        philips.setNome("Philips Fullstack Developer | You Are You");
        philips.setDescricao(
                "O bootcamp Philips Fullstack Developer é um programa gratuito para quem deseja iniciar a carreira em desenvolvimento e tecnologia da informação. Você vai aprender com experiências educacionais práticas como criar aplicações e projetos do zero ao código final. Este programa é uma iniciativa do projeto You Are You, que tem o objetivo de fomentar a diversidade e inclusão em seu time e no ecossistema tecnológico como um todo. As contratações serão exclusivas para pessoas desenvolvedoras de grupos de Diversidade.");
        philips.getConteudos().add(cursoJava);
        philips.getConteudos().add(mentoriaSpring);
        philips.getConteudos().add(cursoJS);
        philips.getConteudos().add(mentoriaAngular);

        /*
         * Dev
         **/

        Dev eduardo = new Dev();
        eduardo.setNome("Eduardo");
        eduardo.getConteudosInscrito().add(mentoriaAngular);
        eduardo.getConteudosInscrito().add(cursoJS);

        System.out.println(eduardo.getNome()+":" + "\nConteúdos inscrito: " + eduardo.getConteudosInscrito());

        eduardo.progredir();

        System.out.println(eduardo.getNome()+":" + "\nConteúdos inscrito: " + eduardo.getConteudosInscrito());
        System.out.println(eduardo.getNome()+":" + "\nConteúdos concluídos: " + eduardo.getConteudosConcluidos());
        System.out.println("XP: " + eduardo.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev melo = new Dev();
        melo.setNome("Melo");
        melo.inscreverBootcamp(philips);

        System.out.println(melo.getNome()+":" + "\nConteúdos inscrito: " + melo.getConteudosInscrito());
        System.out.println("");

        melo.progredir();

        System.out.println("Conteúdos Inscrito: " + melo.getConteudosInscrito());
        System.out.println("");
        System.out.println("Conteúdos Concluídos: " + melo.getConteudosConcluidos());
        System.out.println("XP: " + melo.calcularTotalXp());
    }
}
