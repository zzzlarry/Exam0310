
public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("小明","105021001");
        Student s2 = new Student("小華","105021002");
        Student s3 = new Student("小王","105021003");
        Student s4 = new Student("小李","105021004");
        Student s5 = new Student("小白","105021005");
        s1.setGender("男");
        s2.setGender("女");
        s3.setGender("男");
        s4.setGender("男");
        s5.setGender("女");
        s1.setTel("0800111000");
        s2.setTel("0800111001");
        s3.setTel("0800111002");
        s4.setTel("0800111003");
        s5.setTel("0800111004");
        s1.setHeight(175);
        s2.setHeight(160);
        s3.setHeight(180);
        s4.setHeight(185);
        s5.setHeight(150);
        s1.setWeight(55);
        s2.setWeight(45);
        s3.setWeight(70);
        s4.setWeight(60);
        s5.setWeight(48);
        System.out.println("姓名:"+s1.getName()+"  學號:"+s1.getId()+"  性別:"+s1.getGender()+"  電話:"+s1.getTel()+"  身高:"+s1.getHeight()+"  體重:"+s1.getWeight());
        System.out.println("姓名:"+s2.getName()+"  學號:"+s2.getId()+"  性別:"+s2.getGender()+"  電話:"+s2.getTel()+"  身高:"+s2.getHeight()+"  體重:"+s2.getWeight());
        System.out.println("姓名:"+s3.getName()+"  學號:"+s3.getId()+"  性別:"+s3.getGender()+"  電話:"+s3.getTel()+"  身高:"+s3.getHeight()+"  體重:"+s3.getWeight());
        System.out.println("姓名:"+s4.getName()+"  學號:"+s4.getId()+"  性別:"+s4.getGender()+"  電話:"+s4.getTel()+"  身高:"+s4.getHeight()+"  體重:"+s4.getWeight());
        System.out.println("姓名:"+s5.getName()+"  學號:"+s5.getId()+"  性別:"+s5.getGender()+"  電話:"+s5.getTel()+"  身高:"+s5.getHeight()+"  體重:"+s5.getWeight());
	}

}
