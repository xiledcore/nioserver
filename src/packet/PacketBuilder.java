package packet;

import java.nio.ByteBuffer;

public class PacketBuilder {
	
	private ByteBuffer buffer;
	
	public PacketBuilder() {
		this(1024);
	}
	
	public PacketBuilder(int capacity) {
		buffer = ByteBuffer.allocate(capacity);
	}
	
	public PacketBuilder putBytes(byte[] bytes) {
		buffer.put(bytes);
		return this;
	}
	
	public Packet createPacket() {
		return new Packet((ByteBuffer) buffer.flip());
	}
}
