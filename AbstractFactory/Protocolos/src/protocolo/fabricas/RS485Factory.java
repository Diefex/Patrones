package protocolo.fabricas;

import protocolos.Protocolo;
import protocolos.RS485;
import protocolos.fabricas.ProtocoloFactory;

public class RS485Factory extends ProtocoloFactory {

	@Override
	public Protocolo crearProtocolo() {
		return new RS485();
	}

}
