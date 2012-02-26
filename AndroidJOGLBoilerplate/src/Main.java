
import jogldisplaysetup.Bug;
import jogldisplaysetup.Debugger;
import jogldisplaysetup.GLDisplay;





public class Main {

	  public static void main(String[] args) {
		  Bug.init(new Debugger() {
			
			@Override
			public void debug(Object category, Object debug) {
//				System.err.println(category);
//				System.out.println(debug);
			}
			
			@Override
			public void debug(Object debug) {
//				System.out.println(debug);
			}
			@Override
			public void debugAppend(Object debug) {
//				System.out.print(debug);
			}
			@Override
			public void debugTemp(Object category, Object debug) {
//				System.err.println(category);
//				System.out.println(debug);
			}
			@Override
			public void debugTemp(Object debug) {
//				System.out.println(debug);
			}
			@Override
			public void debugAppendTemp(Object debug) {
//				System.out.print(debug);
			}
		});
		  
		  	GLDisplay display = GLDisplay.createGLDisplayWindowed("Testing");
		  	MyRenderer renderer = new MyRenderer();
	        display.addGLEventListener(renderer);
	        display.start();
	        
	    }
}
