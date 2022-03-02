package bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	String nome;
	Set<Conteudo>conteudosInscritos = new LinkedHashSet<>();
	Set<Conteudo>conteudosConcluídos = new LinkedHashSet<>();
	
	public void inscreverBootCamp(BootCamp bootcamp) {
	  this.conteudosInscritos.addAll(bootcamp.getConteudos());
	  bootcamp.getDevInscritos().add(this);
		
	}
	
	public void progredir() { 
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()){
			
			this.conteudosConcluídos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
			
		}else {
			System.err.println("Voce não esta matriculado	");
		}
		
		
	}
	
	
	public  double caulcularXP() {
		return  this.conteudosConcluídos
				.stream()
				.mapToDouble(conteudo -> conteudo
				.calcularXp())
				.sum();
				
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluídos() {
		return conteudosConcluídos;
	}

	public void setConteudosConcluídos(Set<Conteudo> conteudosConcluídos) {
		this.conteudosConcluídos = conteudosConcluídos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluídos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluídos, other.conteudosConcluídos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	

}
