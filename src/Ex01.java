
public class Ex01 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String name1[][]={{"001","1050001"},{"002","1050002"},{"003","1050003"},{"004","1050004"},{"005","1050005"}};
			Staff stf[]=new Staff[name1.length];	
			for(int i=0;i<name1.length;i++){
				stf[i]=new Staff(name1[i][0],name1[i][1]);
				System.out.println(name1);
			}
	}

}
