package packet;

import java.nio.ByteBuffer;

/**
 * <p>The class that is used as the packet builder.</p>
 * @author Xiledcore
 *
 */

public final class PacketBuilder {
	
	/**
	 * The <code>ByteBuffer</code> instance.
	 */
	private final ByteBuffer buffer;
	
	/**
	 * The <code>default constructor</code> of the <code>PacketBuilder</code> class.
	 */
	public PacketBuilder() {
		this(1024);
	}
	
	/**
	 * The <code>constructor</code> of the <code>PacketBuilder</code> class.
	 * @param capacity An int representing how much the buffer can contain.
	 */
	public PacketBuilder(int capacity) {
		buffer = ByteBuffer.allocate(capacity);
	}
	
	/**
	 * Puts a <code>byte array</code> into the <code>ByteBuffer</code> instance.
	 * @param bytes The <code>byte array</code> to be put into the <code>ByteBuffer</code> instance.
	 * @return This <code>PacketBuilder</code> instance, for chaining purposes.
	 */
	public PacketBuilder putBytes(byte[] bytes) {
		buffer.put(bytes);
		return this;
	}
	
	/**
	 * Creates the <code>Packet</code> instance.
	 * @return The <code>Packet</code> instance.
	 */
	public Packet createPacket() {
		return new Packet((ByteBuffer) buffer.flip());
	}
}
