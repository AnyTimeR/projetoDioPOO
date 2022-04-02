package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("descri��o curso javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descri��o mentoria de java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("===== Bootcamp Java Developer ===== \n");
		bootcamp.setDescricao("Descri��o bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println(bootcamp.getNome());
		Dev devAlex = new Dev();
		devAlex.setNome("Alex Castro");
		devAlex.inscreverBootcamp(bootcamp);
		System.out.println(devAlex.getNome());
		System.out.println("CONTE�DOS INSCRITOS: " + devAlex.getConteudosInscritos());
		devAlex.progredir();
		devAlex.progredir();
		System.out.println("\n ------- progress�o do bootcamp... ------- \n");
		System.out.println("CONTE�DOS INSCRITOS: \n" + devAlex.getConteudosInscritos());
		System.out.println("\n CONTE�DOS CONCLU�DOS: " + devAlex.getConteudosConcluidos());
		System.out.println("\n XP: " +devAlex.calcularTotalXp());
		
		System.out.println("\n -------------------------------------------------------------------------------------------- \n");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila Cavalcante");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println(devCamila.getNome());
		System.out.println("CONTE�DOS INSCRITOS: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("\n ------- progress�o do bootcamp... ------- \n");
		System.out.println("CONTE�DOS INSCRITOS: \n" + devCamila.getConteudosInscritos());
		System.out.println("CONTE�DOS CONCLU�DOS: " + devCamila.getConteudosConcluidos());
		System.out.println("\n XP: " +devCamila.calcularTotalXp());
		
		
	}

}
