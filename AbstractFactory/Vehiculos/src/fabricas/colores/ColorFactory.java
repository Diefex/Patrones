package fabricas.colores;

import java.awt.Color;

public class ColorFactory {

	public Color crearColor(int R, int G, int B) {
		return new Color(R, G, B);
	}

}
