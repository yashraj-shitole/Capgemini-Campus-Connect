package ArrayListProblems;

import java.util.*;

public class InsectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Insect> list=new ArrayList<>();
		
		Insect i1=new Insect("Ant",45);
		Insect i2=new Insect("Cockroach",65);
		Insect i3=new Insect("bee",99);
		Insect i4=new Insect("paper wasp",11);
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		
		Insecticide insecticide=new Insecticide();
		
		System.out.println(insecticide.mapInsectName(list));
		System.out.println("-------------------------------------------------");
		System.out.println(insecticide.getWeight(list));

	}

}



// Insect Class
class Insect{
	private String insectName;
	private int insectWeight;
	public Insect() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
}



class Insecticide{
	public List<String> mapInsectName(List<Insect> list) {
		
		Insect insect=new Insect();
		List<String> insectName=new ArrayList<>();
		
		for (Insect name : list) {
			
			insectName.add(name.getInsectName());
		}
		
		return insectName;
	}
	
	public List<Insect> getWeight(List<Insect> list)  {
		
		Insect insect=new Insect();

		List<Insect> filteresdInsectList=new ArrayList<>();
		
		for (Insect insect2 : list) {
			if (insect2.getInsectWeight()>40 && insect2.getInsectWeight()<100) {
				filteresdInsectList.add(insect2);	
			}
		}
		
		return filteresdInsectList;
		
	}
}