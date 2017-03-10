public class Student {
	private String name , gender , id , tel ;
	   private float height , weight ;
	       public Student(String name1 , String id1){
	    	   name = name1;
	    	   id = id1;
	       }
	       public String getName(){
	     	  return name;
	       }
	       public String getId(){
	     	  return id;
	       }
	       public void setGender(String gender1){
	     	  gender = gender1;;
	       }
	       public String getGender(){
	     	  return gender;
	       }
	       public void setTel(String tel1){
	     	  tel = tel1;
	       }
	       public String getTel(){
	     	  return tel;
	       }
	       public void setHeight(float height1){
	      	  height = height1;
	        }
	        public float getHeight(){
	      	  return height;
	        }
	        public void setWeight(float weight1){
	       	  weight = weight1;
	        }
	        public float getWeight(){
	      	  return weight;
	        }
	}
