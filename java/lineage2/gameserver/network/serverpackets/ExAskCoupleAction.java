package lineage2.gameserver.network.serverpackets;

public class ExAskCoupleAction extends L2GameServerPacket
{
	private int _objectId, _socialId;

	public ExAskCoupleAction(int objectId, int socialId)
	{
		_objectId = objectId;
		_socialId = socialId;
	}

	@Override
	protected void writeImpl()
	{
		writeEx(0xBC);
		writeD(_socialId);
		writeD(_objectId);
	}
}
