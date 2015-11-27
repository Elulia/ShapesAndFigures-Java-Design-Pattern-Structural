package fr.iutvalence.info.dut.m3105.preamble;

public abstract class Shape {

		public void Draw(Position p){
			
			System.out.println("Drawing "+this.toString()+" at "+p.toString());
		}

}
