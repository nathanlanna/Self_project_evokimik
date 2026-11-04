package evoTest.models;

import java.io.Serial;
import java.util.Map;

public class Mission {

	@Serial
	private int Id;
	private String nome;
	private String desc;
	private Map<String,Integer> rewards;
	
	public Mission(String nome, String desc, Map<String,Integer> rewards) {
		this.nome = nome;
		this.desc = desc;
		this.rewards = rewards;
		
	}

	public int getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Map<String, Integer> getRewards() {
		return rewards;
	}

	public void setRewards(Map<String, Integer> rewards) {
		this.rewards = rewards;
	}
	
}
