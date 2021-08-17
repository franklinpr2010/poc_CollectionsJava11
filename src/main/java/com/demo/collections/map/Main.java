package com.demo.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	   Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	   hashMap.put(1, 10);
	   hashMap.put(2, 11);
	   hashMap.put(3, 12);
	   hashMap.put(4, 13);
	   hashMap.put(5, 14);
	   
	   hashMap.put(5, 15);
	   //se tiver a chave não substitui
	   hashMap.putIfAbsent(5, 16);
	   
	   //pega pela chave
	   System.out.println(hashMap.get(2));
	   //se não achar a chave retorna um valor default
	   System.out.println(hashMap.getOrDefault(88, 10000));
	   
	   System.out.println(hashMap);
	   
	   System.out.println(hashMap.entrySet());
	   
	   Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
	   
	   for (Map.Entry<Integer, Integer> map : entrySet) {
		   System.out.println(map);
		   System.out.println(map.getKey());
		   System.out.println(map.getKey());
		   System.out.println(map.getValue());
	   }
	   
	   //Retorna os valores do hashmap
	   Collection<Integer> values = hashMap.values();
	   System.out.println(values);
	   
	   //Retorna todos os keys
	   Collection<Integer> keys = hashMap.keySet();
	   System.out.println(keys);
	   
	   //Remove a quarta chave
	   System.out.println(hashMap.remove(4));
	   System.out.println(hashMap);
	   
	   //Substitui o valor
	   System.out.println(hashMap.replace(4, 40));
	   //antigo valor 11 e o novo 40
	   System.out.println(hashMap.replace(4, 11, 40));
	   
	   //Replace/all 
	   hashMap.replaceAll((k,v) -> v + 10);
	   System.out.println(String.format( "replaceAll %s", hashMap) );
	   
	   hashMap.compute(1, (k,v) -> v + 100);
	   
	   System.out.println(String.format( "compute %s", hashMap));
	   
	   //Só computa se o index está presente
	   hashMap.computeIfPresent(3, (k,v) -> v * 100);
	   
	   System.out.println(String.format( "computeIfPresent %s", hashMap));
	   
	   //verifica se contem a chave
	   System.out.println(hashMap.containsKey(1));
	   
	   //Verifica se contem o valor
	   System.out.println(hashMap.containsValue(14));
	   
	   //Se tiver vazia retorna true
	   System.out.println(hashMap.isEmpty());
	   
	   
	   
	   
	   
	   
	   
	}
}
