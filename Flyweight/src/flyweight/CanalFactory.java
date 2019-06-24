package flyweight;

import java.util.ArrayList;

public class CanalFactory {

	private ArrayList<Canal> CanalPool;
	private int freq = 850;
	private int n = 1;

	public CanalFactory() {
		CanalPool = new ArrayList<Canal>();
	}

	public Canal getCanal() {
		Canal canal = null;
		for (Canal c : CanalPool) {
//			System.out.println("canal " + c.getNumero() + " ocupado=" + c.isOcupado());
			if (!c.isOcupado()) {
				canal = c;
				break;
			}
		}
		if (canal == null && freq < 9350) {
			canal = new Canal(freq, n);
			CanalPool.add(canal);
			freq += 850;
			n++;
		}
		return canal;
	}

	public ArrayList<Canal> getCanalPool() {
		return CanalPool;
	}

}
