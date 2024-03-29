package com.sos.facemash.DTO;

import lombok.Data;

@Data
public class UserSummaryDTO {

    private String userName;
    private String mail;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static class Builder{
        private String userName;
        private String mail;

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public UserSummaryDTO build(){
            UserSummaryDTO userSummaryDTO = new UserSummaryDTO();
            userSummaryDTO.setUserName(userName);
            userSummaryDTO.setMail(mail);
            return userSummaryDTO;
        }
    }
}
