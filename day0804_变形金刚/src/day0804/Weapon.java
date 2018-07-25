package day0804;

public interface Weapon {
	
	/*//public static final*/
	int TYPE_COLD=9527;
	int TYPE_HOT=9547;
	int TYPE_NUCLEAR = 9247;

	
	/*public abstract */
	void kill();
	String getNmae();
	int getType();
	
}
