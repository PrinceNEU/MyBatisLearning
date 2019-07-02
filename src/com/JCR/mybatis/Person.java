package com.JCR.mybatis;

public class Person {

        String personname;
        String persongpassword;
        int persongid;
        String personmail;
        @Override
        public String toString() {
            return "Person [personname=" + personname + ", persongpassword=" + persongpassword + ", persongid=" + persongid
                    + ", personmail=" + personmail + "]";
        }
        public String getPersonname() {
            return personname;
        }
        public void setPersonname(String personname) {
            this.personname = personname;
        }
        public String getPersongpassword() {
            return persongpassword;
        }
        public void setPersongpassword(String persongpassword) {
            this.persongpassword = persongpassword;
        }
        public int getPersongid() {
            return persongid;
        }
        public void setPersongid(int persongid) {
            this.persongid = persongid;
        }
        public String getPersonmail() {
            return personmail;
        }
        public void setPersonmail(String personmail) {
            this.personmail = personmail;
        }
}
