package protocolo.fabricas;

import protocolos.I2C;
import protocolos.Protocolo;
import protocolos.fabricas.ProtocoloFactory;

public class I2CFactory extends ProtocoloFactory {

	@Override
	public Protocolo crearProtocolo() {
		return new I2C();
	}

}
