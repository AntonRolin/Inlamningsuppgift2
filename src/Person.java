import java.time.LocalDate;

/**
 * Created by: Anton Rolin
 * Date: 09/10/2020
 * Time: 18:06
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
public class Person{

    private String idNumber;
    private String name;
    private LocalDate memberRegDate;
    private boolean isCurrentMember;

    public Person(String idNumber, String name, LocalDate memberRegDate){
        try {
            this.idNumber = idNumber;
            this.name = name;
            this.memberRegDate = memberRegDate;
        }catch(Exception e){
            System.out.println("Could not read new Person parameters correctly!");
        }

    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public LocalDate getMemberRegDate() {
        return memberRegDate;
    }

    public boolean getIsCurrentMember(){ return isCurrentMember;}

    public void setCurrentMember(boolean currentMember) {
        this.isCurrentMember = currentMember;
    }
}
