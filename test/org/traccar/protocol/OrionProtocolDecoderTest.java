package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class OrionProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        OrionProtocolDecoder decoder = new OrionProtocolDecoder(new TestDataManager());

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(
                new int[] {0x50,0x57,0x00,0x41,0x07,0x36,0x7C,0x24,0x2B,0x44,0x09,0x01,0xAD,0xE9,0x7D,0x01,0x63,0x14,0x3B,0x07,0xB0,0x03,0x00,0x00,0x00,0x00,0x0D,0x04,0x19,0x17,0x38,0x2D,0x00,0x0B,0x01,0x01,0x00,0x05,0x11,0x00,0x00,0x00,0x00,0x06,0x82,0x05,0x00,0x00,0x00,0x8E,0x08,0x00,0x00,0x00,0x00,0x00,0x00,0x8C,0x03,0x00,0x84,0x03,0x00,0x85,0x03,0x00,0x09,0x0A,0x00,0x00,0x00,0x00,0x48,0x01,0x00,0x00,0x00,0x8A,0xFC}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(
                new int[] {0x50,0x57,0x00,0x41,0x07,0x36,0x7C,0x24,0x2C,0x44,0x09,0x01,0xAD,0xE9,0x7D,0x01,0x63,0x14,0x3B,0x07,0xB0,0x03,0x00,0x00,0x00,0x00,0x0D,0x04,0x19,0x17,0x38,0x2D,0x00,0x0B,0x01,0x01,0x00,0x05,0x13,0x00,0x00,0x00,0x00,0x06,0x82,0x05,0x00,0x00,0x00,0x8E,0x08,0x00,0x00,0x00,0x00,0x00,0x00,0x8C,0x03,0x00,0x84,0x03,0x00,0x85,0x03,0x00,0x09,0x0A,0x00,0x00,0x00,0x00,0x3B,0xFE,0xFF,0xFF,0x01,0xFA,0xE5}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(
                new int[] {0x50,0x57,0x00,0x41,0x07,0x36,0x7C,0x24,0x2D,0x44,0x09,0x01,0xAD,0xE9,0x7D,0x01,0x63,0x14,0x3B,0x07,0xB0,0x03,0x00,0x00,0x00,0x00,0x0D,0x04,0x19,0x17,0x38,0x2D,0x00,0x0B,0x01,0x01,0x00,0x05,0x14,0x00,0x00,0x00,0x00,0x06,0x82,0x05,0x00,0x00,0x00,0x8E,0x08,0x00,0x00,0x00,0x00,0x00,0x00,0x8C,0x03,0x00,0x84,0x03,0x00,0x85,0x03,0x00,0x09,0x0A,0x00,0x00,0x00,0x00,0xFD,0xFD,0xFF,0xFF,0x02,0x37,0x21}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(
                new int[] {0x50,0x57,0x00,0x41,0x2a,0xc8,0x62,0x36,0x35,0x40,0x09,0x11,0x4d,0x20,0xe4,0x02,0x21,0x0f,0x1f,0x00,0xd2,0x04,0x00,0x00,0x00,0x00,0x0e,0x06,0x11,0x0d,0x34,0x14,0x00,0x0b,0x01,0x01,0x00,0x12,0x28,0x00,0x00,0x00,0x00,0x06,0x82,0x05,0x00,0x00,0x00,0x8e,0x08,0x00,0x00,0x00,0x00,0x00,0x00,0x8c,0x03,0x00,0x84,0x03,0x00,0x85,0x03,0x00,0x03,0x06,0x7b,0x00,0x68,0x01,0x00,0x09,0x30}))));

    }

}
