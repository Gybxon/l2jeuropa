package lineage2.gameserver.network.serverpackets;

public class ExAskModifyPartyLooting extends L2GameServerPacket
{
	private String _requestor;
	private int _mode;

	public ExAskModifyPartyLooting(String name, int mode)
	{
		_requestor = name;
		_mode = mode;
	}

	@Override
	protected void writeImpl()
	{
		writeEx(0xC0);
		writeS(_requestor);
		writeD(_mode);
	}
}
