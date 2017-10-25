package main;

import java.util.ArrayList;
import java.util.Collections;


public class Ordenacao{
	public ArrayList<Integer> ordena(ArrayList<Integer> unsortedList){
	Collections.sort(unsortedList);
	return unsortedList;
	}
	public ArrayList<Integer> listaDeVertices(ArrayList<Integer> unsortedList){
	unsortedList.remove(0);
		Collections.sort(unsortedList);
	int atual;
	int prox;
	  for(int i=0; i< unsortedList.size(); i++) {
		  atual=unsortedList.get(i);
		  prox=unsortedList.get(i+1);
		  if(atual==prox) {
			  unsortedList.remove(i);
	  }}
	return unsortedList;
	}
	public static boolean estaOrdenado(ArrayList<Integer> sortedList)
	{
		boolean sorted = true;
		for(int i = 0; i < sortedList.size() - 1; i++)
		{
			if(sortedList.get(i) > sortedList.get(i + 1))
			{
				sorted = false;
				break;
			}
		}
		return sorted;
	}
}