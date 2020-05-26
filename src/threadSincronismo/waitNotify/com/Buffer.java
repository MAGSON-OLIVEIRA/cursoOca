package threadSincronismo.waitNotify.com;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	private static final int MAX = 10; // O MAXIMO BUFFER
	private Queue<Integer> fila = new LinkedList<Integer>();   // fila de informação 
	
	public synchronized void produzir(int n) {
		// se a thead voltar de maneira inesperada faz a validação no while novamente. apenas para segurança
		while(fila.size() == MAX) {
			try {
				// o wait adormeçe a thread. e libera o look com wait. 
				this.wait(); // o wait tem que ser chamado no objeto monitor. que nesse casso é o proprio. poderia ser outro sim objet.wait()
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fila.offer(n);
		// chama notifall acorda todos as threads 
		this.notifyAll(); // o notify ou o all tem que ser chamado no bloco sunchronized. e o this.not pq o monitor é o proprio objeto. 
		imprimir();
	}
	public  int consmir() {
		// o monitor é o proprio objeto Buffer
		synchronized(this) {
			while(fila.size()==0) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int n =  fila.poll(); // apos o poll  acordas todos. 
			// chama notifall acorda todos as threads 
			this.notifyAll(); // o notify ou o all tem que ser chamado no bloco sunchronized. e o this.not pq o monitor é o proprio objeto. 
			imprimir();
			return n;
		}
	}
	
	private void imprimir() {
		System.out.print(" => ");
		for(Integer i: fila) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
