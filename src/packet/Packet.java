package packet;

import java.nio.ByteBuffer;
import java.util.Optional;

public final class Packet {
	
	private final ByteBuffer buffer;
	
	public Packet(ByteBuffer buffer) {
		this.buffer = buffer;
	}
	
	public Optional<Byte> get(int index) {
		return Optional.of(buffer.get(index));
	}
	
}
