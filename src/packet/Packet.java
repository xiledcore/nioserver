package packet;

import java.nio.ByteBuffer;
import java.util.Optional;

/**
 * <p>The <code>Packet</code> class representing the packet.</p>
 * @author Xiledcore
 *
 */

public final class Packet {
	
	/**
	 * A <code>byte array</code> containing the data to be sent.
	 */
	private final byte[] data;
	
	/**
	 * The <code>constructor</code> of the <code>Packet</code> class.
	 * @param buffer The <code>ByteBuffer</code> instance.
	 */
	public Packet(ByteBuffer buffer) {
		data = new byte[buffer.remaining()];
		buffer.get(data);
	}
	
	/**
	 * This method returns a <code>byte array</code> wrapped in an <code>Optional</code> object.
	 * @return The <code>Optional</code> instance containing the <code>byte array</code>.
	 */
	public Optional<byte[]> get() {
		return Optional.of(data);
	}
	
}
