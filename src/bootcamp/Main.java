package bootcamp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso cursoA = new Curso();
		cursoA.setTitulo("Java");
		cursoA.setDescricao("Bacharel");
		cursoA.setCargaHoraria(8);
		
		System.out.println(cursoA);
		
		Curso cursoB = new Curso();
		cursoB.setTitulo("Python");
		cursoB.setDescricao("Certificação");
		cursoB.setCargaHoraria(8);
		
		

		Conteudo conteudoD = new Curso();
		conteudoD.setTitulo("Designer");
		conteudoD.setDescricao("Certificação");
		
		
		System.out.println(cursoB);
		System.out.println(conteudoD);
		
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setDescricao("BootCamp Python Developer");
		bootCamp.setDescricao("BootCamp para vagas na Empresa AÇAIAMADO");
		bootCamp.getConteudos().add(cursoA);
		bootCamp.getConteudos().add(cursoB);
		bootCamp.getConteudos().add(conteudoD);
		
		
		Dev devOsvaldo = new Dev();
		devOsvaldo.setNome("Osvaldo");
		devOsvaldo.inscreverBootCamp(bootCamp);
		System.out.println("++++++");
		devOsvaldo.progredir();
		System.out.println("Conteudos Inscritos" + devOsvaldo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devOsvaldo.getConteudosConcluídos());
		System.out.println("CalcularXP"+ devOsvaldo.caulcularXP());
		
		Dev devIzabella = new Dev();
		devIzabella.setNome("Izabella");
		devIzabella.inscreverBootCamp(bootCamp);
		devIzabella.progredir();
		devIzabella.progredir();
		
		System.out.println("++++++");
		System.out.println("Conteudos Inscritos" + devIzabella.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devOsvaldo.getConteudosConcluídos());
		System.out.println("CalcularXP"+ devIzabella.caulcularXP());
		
		
		
		
		

	}

}
