package fr.iutvalence.info.dut.m3105.preamble;

public class SolidFillDecorator extends ShapeDecorator
{
	String color;
	
	SolidFillDecorator(String color){
		this.color=color;
	}
	
	public String toString(){
		return ShapeDecorator.shape.toString()+",with "+this.color+" solid fill";
	}
	
}
