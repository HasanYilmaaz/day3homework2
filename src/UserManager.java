public class UserManager {

    public void login(User user) {
        System.out.println(user.getUsername()+" Sisteme Başarılı Bir Şekilde Giriş Yaptınız.");
    }

    public void logOut(User user) {
        System.out.println(user.getUsername()+" Sistemden Çıkış Yaptınız.");
    }

    public void deleteAccount(User user) {
        System.out.println(user.getUsername()+" kullanıcı adlı esabınız başaraılı bir şekilde silindi.");
    }

    public void updateInfo(User user) {
        System.out.println(user.getInfo()+ " Sistemdeki bilgileriniz güncellendi.");
    }
    public void getMyCourses(User user){
        System.out.println("Kurslarınız : "+user.getMyCourses());
    }

}
