package drugi_Java_test_09_09_2022;

public class InstagramMentionAddOn extends InstagramAddOn{
	private InstagramUser tag;

	public InstagramMentionAddOn(String id, int xPozicija, int yPozicija, int sirinaAddOn, int visinaAddOn,
			InstagramUser tag) {
		super(id, xPozicija, yPozicija, sirinaAddOn, visinaAddOn);
		this.tag = tag;
	}

	public InstagramUser getTag() {
		return tag;
	}

	public void setTag(InstagramUser tag) {
		this.tag = tag;
	}

	@Override
	public int minSirinaAddOn() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public int minVisinaAddOn() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void stampaj() {
		System.out.println("[" + this.xPozicija + ", " + this.yPozicija + "] (" + this.visinaAddOn + ", " +
				this.sirinaAddOn + ") @" + this.tag.getUsername() + " / " + 
				this.tag.linkProfila(this.tag.getUsername()));
		
	}
	

}
