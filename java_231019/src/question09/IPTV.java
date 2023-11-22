package question09;

public class IPTV extends ColorTv {
	private String ip;
	public IPTV(String ip,int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
		@Override
		public void printProperty(){
			System.out.print("나의 IPTV는  "+getIp()+"주소의 ");
			super.printProperty();
			
			
		}
		public static void main(String[] args) {
			IPTV iptv = new IPTV("192.1.1.2",32,2048);
			iptv.printProperty();
		}
		
	}


