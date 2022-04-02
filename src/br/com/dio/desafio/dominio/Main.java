package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("descrição curso javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição mentoria de java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("===== Bootcamp Java Developer ===== \n");
		bootcamp.setDescricao("Descrição bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println(bootcamp.getNome());
		Dev devAlex = new Dev();
		devAlex.setNome("Alex Castro");
		devAlex.inscreverBootcamp(bootcamp);
		System.out.println(devAlex.getNome());
		System.out.println("CONTEÚDOS INSCRITOS: " + devAlex.getConteudosInscritos());
		devAlex.progredir();
		devAlex.progredir();
		System.out.println("\n ------- progressão do bootcamp... ------- \n");
		System.out.println("CONTEÚDOS INSCRITOS: \n" + devAlex.getConteudosInscritos());
		System.out.println("\n CONTEÚDOS CONCLUÍDOS: " + devAlex.getConteudosConcluidos());
		System.out.println("\n XP: " +devAlex.calcularTotalXp());
		
		System.out.println("\n -------------------------------------------------------------------------------------------- \n");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila Cavalcante");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println(devCamila.getNome());
		System.out.println("CONTEÚDOS INSCRITOS: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("\n ------- progressão do bootcamp... ------- \n");
		System.out.println("CONTEÚDOS INSCRITOS: \n" + devCamila.getConteudosInscritos());
		System.out.println("CONTEÚDOS CONCLUÍDOS: " + devCamila.getConteudosConcluidos());
		System.out.println("\n XP: " +devCamila.calcularTotalXp());
		
		
	}

}
