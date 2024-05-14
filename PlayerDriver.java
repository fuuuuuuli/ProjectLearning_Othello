package test;

public class PlayerDriver {
	public static void main(String[] args)throws Exception {
		int time=180;
		String myName="human1";
		String opponentName="human2";
		int color=1;
		Player player = new Player(time,myName,opponentName,color);
		System.out.println("getMyName()でmyNameを取得します。");
		System.out.println(player.getMyName());
		System.out.println("getOpponentName()でOpponentNameを取得します。");
		System.out.println(player.getOpponentName());
		System.out.println("getMyTime()でmytimeを取得します。");
		System.out.println(player.getMyTime());
		System.out.println("setMyTime()でmytimeを240に設定します。");
		player.setMyTime(240);
		System.out.println(player.getMyTime());
		System.out.println("getMyColor()でmycolorを取得します。");
		System.out.println(player.getMyColor());
		System.out.println("setMyColor()でmycolorを0に設定します。");
		player.setMyColor(0);
		System.out.println(player.getMyColor());		
		System.out.println("updateTime()により、mytimeを240から1減少させます。");
		player.updateTime(1);
		System.out.println(player.getMyTime());
		player.setMyTime(3);
		System.out.println("updataTime()により、myTimeを3から1ずつ15回減少させながらisTimeUp()の出力を確認します。");
		for(int i=0;i<15;i++) {
			System.out.println(player.getMyTime());
			System.out.println(player.isTimeUp());
			player.updateTime(1);
		}
		
		
		
	}
}
