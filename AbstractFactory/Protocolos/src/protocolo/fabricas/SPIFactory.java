package protocolo.fabricas;

import protocolos.Protocolo;
import protocolos.SPI;
import protocolos.fabricas.ProtocoloFactory;

public class SPIFactory extends ProtocoloFactory {

	@Override
	public Protocolo crearProtocolo() {
		return new SPI();
	}

}
