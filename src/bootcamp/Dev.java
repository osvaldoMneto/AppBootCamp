package bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	String nome;
	Set<Conteudo>conteudosInscritos = new LinkedHashSet<>();
	Set<Conteudo>conteudosConclu�dos = new LinkedHashSet<>();
	
	public void inscreverBootCamp(BootCamp bootcamp) {
	  this.conteudosInscritos.addAll(bootcamp.getConteudos());
	  bootcamp.getDevInscritos().add(this);
		
	}
	
	public void progredir() { 
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()){
			
			this.conteudosConclu�dos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
			
		}else {
			System.err.println("Voce n�o esta matriculado	");
		}
		
		
	}
	
	
	public  double caulcularXP() {
		return  this.conteudosConclu�dos
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

	public Set<Conteudo> getConteudosConclu�dos() {
		return conteudosConclu�dos;
	}

	public void setConteudosConclu�dos(Set<Conteudo> conteudosConclu�dos) {
		this.conteudosConclu�dos = conteudosConclu�dos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConclu�dos, conteudosInscritos, nome);
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
		return Objects.equals(conteudosConclu�dos, other.conteudosConclu�dos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	

}
