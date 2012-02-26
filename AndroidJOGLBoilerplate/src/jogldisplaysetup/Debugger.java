package jogldisplaysetup;


public interface Debugger {

	public void debug(Object debug);
	public void debugTemp(Object debug);
	public void debugTemp(Object category, Object debug);
	public void debugAppendTemp(Object debug);
	public void debugAppend(Object debug);
	public void debug(Object category, Object debug);
}
