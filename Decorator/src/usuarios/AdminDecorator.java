package usuarios;

import bases.BDAdmin;

public class AdminDecorator extends Usuario {

	Usuario admin;

	public AdminDecorator(Usuario admin) {
		this.admin = admin;
	}

	@Override
	public void accesoBiblioteca() {
		admin.accesoBiblioteca();
	}

	@Override
	public void accesoTesis() {
		admin.accesoTesis();
	}

	public void accesoAdmin() {
		BDAdmin base = new BDAdmin();
		base.acceder();
	}

}
