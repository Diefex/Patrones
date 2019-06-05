package usuarios;

import bases.BDBiblioteca;
import bases.BDTesis;

public class Administrador extends Usuario {

	@Override
	public void accesoBiblioteca() {
		BDBiblioteca base = new BDBiblioteca();
		base.acceder();
	}

	@Override
	public void accesoTesis() {
		BDTesis base = new BDTesis();
		base.acceder();
	}

}
