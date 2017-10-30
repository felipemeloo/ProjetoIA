package buscas;
import java.util.Queue;

import main.DirectGraphList;
import main.Vertice;

public class BuscaEmLargura{
	
	// Fila de dados FiFo
	private Queue<Vertice> filaGrafos;
	void percorrerAdjacente(DirectGraphList grafo, Queue<Vertice> init) {
		boolean[] pre = new boolean[DirectGraphList.numeros.size()];
		boolean nivelArvore;
		int nivel = 1;
		int[] nivelV = new int[DirectGraphList.numeros.size()];
		while(!init.isEmpty()) {
			nivelArvore=true;
			Vertice v = init.poll();
			if(nivel == 1) {
				pre[DirectGraphList.numeros.indexOf(v)]=true;
			}
			for(Vertice vadj: v.getAdjacents()) {
				init.offer(vadj.proximo);
				nivelV[DirectGraphList.numeros.indexOf(vadj.proximo)]= nivelV[DirectGraphList.numeros.indexOf(v)]+1;
				pre[DirectGraphList.numeros.indexOf(vadj.proximo)]=true;
				if(nivelArvore) {
					System.out.println();
					System.out.println("Nivel"+nivelV[DirectGraphList.numeros.indexOf(vadj.proximo)]+" ");
					nivelArvore= false;
				}
				System.out.println(vadj.getDegree());
			}
		}
	}
/*		
	public BuscaEmLargura(int valorBusca) {
		this.filaNos = new LinkedList<Vertice>();
		this.setValorBusca(valorBusca);
	}
	
	@Override
	public boolean buscarResultado(No no) {
		if (isResultadoBusca(no)) {
			// Se for o objetivo
			obterResultadoPaternal(no);
			return true;
		} else {			
			// Adicionar os nós na fila
			if (no.getNoEsquerda() != null) {
				this.filaNos.add(no.getNoEsquerda());
			}
			if (no.getNoDireita() != null) {
				this.filaNos.add(no.getNoDireita());
			}
			
			No noPonta = this.filaNos.poll();
			if (noPonta != null && buscarResultado(noPonta)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int contarNosFolha() {
		if (this.filaNos != null) {
			return this.filaNos.size();
		}
		return 0;
	}*/
	
}