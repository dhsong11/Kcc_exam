package kosa.phone;

public class PhoneInfo {
   String name;
   String phoneNo;
   String birth;
   
   
   public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public String getBirth() {
	return birth;
}

public void setBirth(String birth) {
	this.birth = birth;
}

public PhoneInfo() {};
   
   public PhoneInfo(String name, String phoneNo, String birth) {
      this.name = name;
      this.phoneNo = phoneNo;
      this.birth = birth;
   }


 
  

   

   
   
}