package jogldisplaysetup;



public class Bug {
	
	private static Debugger debugger;
	
	public static void init(Debugger mydebugger){
		debugger = mydebugger;
	}
	public static void debug(){
		debugger.debug("");
	}
	public static void debugAppend(Object debug){
		debugger.debugAppend(debug);
	}
	public static void debug(Object debug){
		debugger.debug(debug);
	}
	public static void debug(String category, Object debug){
		debugger.debug(category, debug);
	}
	
	public static void debugTemp(){
		debugger.debug("");
	}
	public static void debugAppendTemp(Object debug){
		debugger.debugAppend(debug);
	}
	public static void debugTemp(Object debug){
		debugger.debug(debug);
	}
	public static void debugTemp(String category, Object debug){
		debugger.debug(category, debug);
	}
}
