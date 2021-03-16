package com.zk.tank.net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
//消息编码
public class MsgEncoder extends MessageToByteEncoder<Msg>{

	@Override
	protected void encode(ChannelHandlerContext ctx, Msg msg, ByteBuf buf) throws Exception {
		buf.writeInt(msg.getMsgType().ordinal());
		byte[] bytes = msg.toBytes();
		buf.writeInt(bytes.length);
		buf.writeBytes(bytes);
	}
	

}
