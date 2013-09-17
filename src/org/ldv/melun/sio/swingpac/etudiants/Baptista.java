package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;
import java.util.List;

import org.ldv.melun.sio.swingpac.Bidule;

public class Baptista extends Bidule {

	  
	  public Baptista() {
	    super("Baptista");
	    setBackground(Color.CYAN);    
	  }

	  @Override
	  public void doMove() {  
	    super.doMove();
	    List<Bidule> proches = this.getBidulesProches(10);
	    if (proches.isEmpty() == false){
	    	for(Bidule proche: proches) {
	    		if (proche.getDELAY() > this.getDELAY() || proche.getDELAY() < this.getDELAY()){
	    			poursuit(proche);
	    			return;
	    		}
	    	}
	    		
	    }
	  }
	  
	  private void poursuit(Bidule proche){
		  if (proche.getIncX() == this.getIncX() && proche.getIncY() == this.getIncY()){
			  if (this.getX()-proche.getX() < (this.getX()+this.getIncX())-proche.getX()){
				  this.setIncX(this.getIncX()*(-1));
			  }
		  }
	  }

	  @Override
	  protected void doAfterImpactByOther() {
	    super.doAfterImpactByOther();
	    
	  }

	  
	}