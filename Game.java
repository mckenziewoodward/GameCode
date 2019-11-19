
	public class Game{
	    public static void main (String[] args){
	      Firebolt fb = new Firebolt();
	    Repair r = new Repair();
	    Healing h = new Healing();
	    Spells sb = new Spells();
	    sb.addSpell(fb);
	    sb.addSpell(r);
	    sb.addSpell(h);
	  }
	}

