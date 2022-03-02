package bootcamp;



public class Curso extends Conteudo {
	

	private int cargaHoraria;
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descrição=" + getDescricao()+", cargaHoraria=" + getCargaHoraria() + "]";
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria + 2;
	}
	
	
	

}
