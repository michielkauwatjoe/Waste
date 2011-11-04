package nl.concretejungle.waste.sketches;
import processing.core.*;
//mport processing.xml.*;


public class WasteSketch extends PApplet {

	PShape s;
	private static final long serialVersionUID = 1L;
	
	public void setup() {
    	background(92, 64, 10);
		size(1024, 576, JAVA2D);
		s = loadShape("../resources/world-map.svg");
		smooth();
		shape(s, 0, 0, 1024, 576);
	}

	/*public void draw() {
	    stroke(255, 128, 0);       // bright orange (red 255, green 128, blue 0)
		if (mousePressed) {
			line(mouseX,mouseY,pmouseX,pmouseY);
		}
	}*/
	
    public void mousePressed() {
    	background(192, 64, 0);
    }
}
