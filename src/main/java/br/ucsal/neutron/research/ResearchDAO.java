package br.ucsal.neutron.research;

import java.util.ArrayList;
import java.util.List;


public class ResearchDAO {
	private final static List<Research> researches = new ArrayList<>();
	private static Long id = 1L;

	public static void salvar(Research research) {
		research.setId(id);
		researches.add(research);
		id++;
		
	}

	public static List<Research> listar() {
		List<Research> researchesCopy = new ArrayList<>();
		researchesCopy = researches;
		return researchesCopy;
	}

	public static Research findById(Long id) {
		Research research = null;
		for (Research r : researches) {
			if(r.getId().equals(id)) {
				research = r;
			}	
		}	
		return research;
	}

	public static void atualizar(Research research) {
		for (Research r : researches) {
			if(r.getId().equals(research.getId())) {
				r.setName(research.getName());
				r.setDescription(research.getDescription());
			}
		}
		
	}

	public static void delet(Long id) {
		Research research = null;
		for (Research r : researches) {
			if(r.getId().equals(id)) {
				research = r;
			}
		}
		researches.remove(research);
		
	}
}
