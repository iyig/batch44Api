package get_http_request.day15;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

/*
“user”: {
        “id”: 110016,
        “login”: “leopoldo.reinger”,
        “firstName”: “Jasmine”,
        “lastName”: “Stehr”,
        “email”: “marni.zboncak@yahoo.com”,
        “activated”: true,
        “langKey”: “en”,
        “imageUrl”: null,
        “resetDate”: null
    }
      */
   private int id;
   private String login;
   private String firstnName;
   private String lastName;
   private  String email;
   private boolean activated;
   private String langKey;
   private String imageUrl;
   private String resetDate;


   //2


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstnName() {
        return firstnName;
    }

    public void setFirstnName(String firstnName) {
        this.firstnName = firstnName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getResetDate() {
        return resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }

//3
   public User(){

}

    public User(int id, String login, String firstnName, String lastName, String email, boolean activated, String langKey, String imageUrl, String resetDate) {
        this.id = id;
        this.login = login;
        this.firstnName = firstnName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
    }

//4


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstnName='" + firstnName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", resetDate='" + resetDate + '\'' +
                '}';
    }
}
