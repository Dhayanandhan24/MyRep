
abstract class ncaok
{
 abstract void nefwe();
}

class dncsj extends ncaok
{
	public void nefw() 
		{
		System.out.println("what do u do");
		}

	@Override
	void nefwe() {
		System.out.println("what do u do");	
	}
}

class wndsj extends dncsj
{
	public void iwnc(wndsj dck)
		{
		System.out.println("what do u do");
		}
}

class dummy extends wndsj
{
	public static void main(String[] args) {
	wndsj ndck = new dummy();
	ndck.iwnc(ndck);
	ndck.nefwe();
}
}
   